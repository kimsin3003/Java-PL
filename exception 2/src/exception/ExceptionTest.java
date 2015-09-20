package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		String greetings[] = {"안녕하세요.", "반갑습니다.", "잘가요."};
		
		for (int i = 0; i < 4 ; i++){
		
			try {
				System.out.println(greetings[i]);
				
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e); // e의 toString이 출력됨.
				return;
			}finally{
				System.out.println("always printed.");
			}
		} 
		System.out.println("hello");
		
		
	}

}
