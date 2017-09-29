import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream(new File("/Users/Inampudi/Spring/test1.png"));
			fos = new FileOutputStream(new File("/Users/Inampudi/Spring/test2.png"));
			System.out.println("opening files");
			int picData;
			
			while ((picData = fis.read())!= -1) {
				//System.out.println(picData);
				fos.write(picData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				System.out.println("closing files");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
