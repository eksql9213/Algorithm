import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		sc.nextLine();
		
		String [] score_input = sc.nextLine().split(" ");
		int [] scores = new int[cnt];
		double sum = 0.0;
		double max_score = 0.0;
		for(int i=0; i<cnt; i++) {
			scores[i] = Integer.parseInt(score_input[i]);
			if (max_score < scores[i]) {
				max_score = scores[i];
			}
			sum += scores[i];
		}
		
		System.out.println(sum/max_score*100/cnt);

	}

}
