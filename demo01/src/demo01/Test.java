package demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("D:/javaSVN/copy.txt");
			os = new FileOutputStream("D:/Program Files/copy_temp.txt");
			
			byte[] b = new byte[1024];
			while(is.read(b) != -1) {
				os.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {is.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

		
}