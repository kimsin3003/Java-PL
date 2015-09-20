

class A{
	public void m(){
		System.out.println("A.m()");
	}
}

class B extends A{
	public void m(){
		System.out.println("B.m()");
	}
}

public class ShowInfo {

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		Class c  = Class.forName("B");
		
		Object obj = c.newInstance();

		((A)obj).m();
		System.out.println(obj);
	}
}
