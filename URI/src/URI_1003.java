import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI_1003 {
	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("SOMA = " + (a + b));
	}
}