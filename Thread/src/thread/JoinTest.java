package thread;

public class JoinTest extends Thread {

	int first;
	int last;
	static int total;
	
	public JoinTest(int first, int last){
		this.first = first;
		this.last = last;
	}
	
	public void run(){
		for(int i = first; i <= last; i++)
			total+=i;
		
	}
	
	public static void main(String[] args){
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		jt1.start();
		jt2.start();
		
		try {
			jt1.wait();
			jt2.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(jt1.total) ;
		System.out.println(jt1.total) ;
		
		

	}

}
