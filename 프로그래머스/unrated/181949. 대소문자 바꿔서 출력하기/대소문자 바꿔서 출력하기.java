import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0; i<a.length(); i++) {
            char alphabet = a.charAt(i);
            if(65<=alphabet && alphabet<=90) {
                alphabet += 32;
                System.out.print(alphabet);
            } else {
                alphabet -= 32;
                System.out.print(alphabet);
            }
        }
    }
}