package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i;
			int len = 0;
			long pseconds = System.currentTimeMillis();
			
			while((i = bis.read())!=-1){
				bos.write(i);
				len++;
			}
			
			pseconds = System.currentTimeMillis() - pseconds;
			
			System.out.println("len = " + len + "bytes," + pseconds + "secodns");
			
			fis.close();
			fos.close();
	}

}
