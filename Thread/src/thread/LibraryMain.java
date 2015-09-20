package thread;

import java.util.ArrayList;
import java.util.Vector;

class Library
{
	public ArrayList<String> nextShelf = new ArrayList<String>();
	
	public Library()
	{
		nextShelf.add("ÅÂ¹é»ê¸Æ1");
		nextShelf.add("ÅÂ¹é»ê¸Æ2");
		nextShelf.add("ÅÂ¹é»ê¸Æ3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException
	{
		Thread t = Thread.currentThread();
		
		while(nextShelf.size() == 0){
			System.out.println("[" + t.getName() + "]: waiting start");
			this.wait();
			System.out.println("[" + t.getName() + "]: waiting end");
			
			//return null;
		}
		
		
		String name = nextShelf.remove(0);
		System.out.println("[" + t.getName() + "]: " + name + "ºô·ÈÀ½");
		return name;
	}
	
	public synchronized void returnBook(String name)
	{
		nextShelf.add(name);
		this.notifyAll();
		Thread t = Thread.currentThread();
		System.out.println("[" + t.getName() + "]: " + name + " ¹Ý³³");
	}
}

class Student extends Thread
{
	public void run()
	{
		
		try {
			String title = LibraryMain.Library.lendBook();
			sleep(5000);
			LibraryMain.Library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class LibraryMain {

	public static Library Library = new Library();
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		

	}

}
