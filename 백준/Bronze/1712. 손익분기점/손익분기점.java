import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String [] input = bf.readLine().split(" ");
		long fixed_costs = Integer.parseInt(input[0]);
		long variable_costs = Integer.parseInt(input[1]);
		long price = Integer.parseInt(input[2]);
		
		int bep = break_even_point(fixed_costs, variable_costs, price);
		System.out.println(bep);
	}
	
	public static int break_even_point(long fixed_costs, long variable_costs, long price) {
		int amount = 0;
		boolean run = true;
		
		while(run) {
			if(price - variable_costs > 0) {
				amount++;
				long total_cost = fixed_costs + variable_costs*amount;
				long total_price = price * amount;
				if(total_cost < total_price) {
					run = false;
				}
			}
			else {
				amount = -1;
				run = false;
			}
		}
		
		return amount;
		
	}
}
