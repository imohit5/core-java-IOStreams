import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String a = "Hello from core java application";
		String b = "Hello,from,core,java,application";
		
		//StringTokenizer st = new StringTokenizer(a);
		
		//StringTokenizer st = new StringTokenizer(b,",");
		
		StringTokenizer st = new StringTokenizer(b,",", true);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
