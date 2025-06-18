import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        
        int piece = 6;
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        
        for(int i=1; i<=piece; i++) {
            if(piece%i == 0) divisor.add(i);
        }
        
        int answer = 0;
        
        for(int i : divisor) {
            if(n%i == 0) answer = n/i;
        }
        
        return answer;
    }
}