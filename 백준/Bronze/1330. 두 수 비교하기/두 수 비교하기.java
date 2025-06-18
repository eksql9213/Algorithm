import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numbers = bf.readLine().split(" ");
		
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		if(num1 > num2) System.out.println(">");
		else if(num1 < num2) System.out.println("<");
		else System.out.println("==");
	}

}
