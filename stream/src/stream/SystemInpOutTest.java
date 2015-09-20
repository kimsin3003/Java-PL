package stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class SystemInpOutTest {

	public static void main(String[] args) {
		System.out.println("엔터를 '끝' 입력하세요");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			
			int i;
			while((i = isr.read()) != '끝')
				System.out.print((char)i);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
