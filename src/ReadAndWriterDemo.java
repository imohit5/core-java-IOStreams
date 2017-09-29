import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriterDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("/Users/Inampudi/Spring/test1.txt");
		fw = new FileWriter("/Users/Inampudi/Spring/test2.txt");
		System.out.println("opening files");
		int textData;
		
		while ((textData = fr.read()) != -1) {
			fw.write(textData);
		}
		
		fr.close();
		fw.close();
		System.out.println("closing files");
	}

}
