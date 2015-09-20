package thread;

class Outer{
	
	private int outer1 = 100;
	Inner inner;
	
	class Inner{
		
		String str = "hello";
		
		public void test(){
			
			System.out.println(str);
			System.out.println(outer1);
		}
		
	}
	
	public Outer()
	{
		inner = this.new Inner();
	}
	
	public void outTest()
	{
		inner.test();
	}
	
	public Runnable getRunnable()
	{
		int i = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println("runnable");
				
			}
		};
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
	
		Outer outer = new Outer();
		Runnable in = outer.getRunnable();
		in.run();
		
	}

}
