import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResourceDemo {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("/Users/Inampudi/Spring/test1.txt");
				BufferedReader br = new BufferedReader(fr);) {

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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
