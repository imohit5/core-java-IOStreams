import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		
		fr = new FileReader("/Users/Inampudi/Spring/test1.txt");
		br = new BufferedReader(fr);
		
		String line;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				counter++;
			}
		}
		
		System.out.println(counter);
		
		fr.close();
		br.close();
		
	}

}
