import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {n};
        
        while(n>1) {
            n = n%2 == 0 ? n/2 : 3*n+1;
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length-1] = n;
        }
        
        return answer;
    }
}