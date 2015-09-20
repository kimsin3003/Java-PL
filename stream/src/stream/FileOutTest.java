package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileOutTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileWriter fw = null;
		OutputStreamWriter ow = null;
		try {
			 fos = new FileOutputStream("out.txt", true);
			 ow = new OutputStreamWriter(fos);
			fos.write(101);
			fos.write(102);
			fos.write(103);
			ow.write("∏ﬁ∑’~~~");
			
			fw = new FileWriter("write.txt", true);
			fw.write("æ»≥Á«œººø‰\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		FileReader fr = null;
		InputStreamReader isr = null;
		int i;
		
		try {
			fis = new FileInputStream("out.txt");
			fr = new FileReader("write.txt");
			isr = new InputStreamReader(fis, "write.txt");
			while((i = fis.read()) != -1)
				System.out.print((char)i);
			
			while((i = fr.read()) != -1)
				System.out.print((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
