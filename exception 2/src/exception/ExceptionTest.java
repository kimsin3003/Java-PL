package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		String greetings[] = {"�ȳ��ϼ���.", "�ݰ����ϴ�.", "�߰���."};
		
		for (int i = 0; i < 4 ; i++){
		
			try {
				System.out.println(greetings[i]);
				
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e); // e�� toString�� ��µ�.
				return;
			}finally{
				System.out.println("always printed.");
			}
		} 
		System.out.println("hello");
		
		
	}

}
