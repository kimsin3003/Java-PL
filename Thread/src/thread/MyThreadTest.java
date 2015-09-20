package thread;

class MyThread implements Runnable{
	
	boolean flag = false;
	
	@Override
	public void run(){
		while(!flag){
		s	try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
			
			
			
			
		}
	}
	
	void flag(boolean flag){
		this.flag = flag;
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		System.out.println("start");
		
		MyThread threadA =  new MyThread("A");
		MyThread threadB =  new MyThread("B");
		MyThread threadC =  new MyThread("C");
		
		
		threadA.start();
		threadB.start();
		threadC.start();

		
		Systoemeeee.
		System.out.println("end");

	}

}
