import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] alarm = sc.nextLine().split(" ");
		
		int hh = Integer.parseInt(alarm[0]);
		int mm = Integer.parseInt(alarm[1]);
		
		if(mm-45 < 0) {
			hh--;
			mm = (mm+60)-45;
			if(hh < 0) {
				hh = 23;
			}
		}
		else {
			mm -= 45;
		}
		
		System.out.println(hh + " " + mm);
	}

}
