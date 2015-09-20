package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftError {

	public URL makeUrl(String filename, String url) throws FileNotFoundException, MalformedURLException{
		
		FileInputStream fis = new FileInputStream(filename);
		return new URL(url);
	}
	
	public static void main(String[] args) {
		
		ShiftError sh = new ShiftError();
		try {
			sh.makeUrl("a.txt", "http://www.naver.com");				
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (Exception e){ // 디폴트 예외는 항상 맨 마지막에 써야 다른 세부 예외들이 처리됨.
			
		} finally {
			
		}
		

	}

}
