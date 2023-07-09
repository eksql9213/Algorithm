import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> multiple = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
            if(i%k == 0) {
                multiple.add(i);
            }
        }
        
        int[] answer = new int[multiple.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = multiple.get(i);
        }
        
        return answer;
    }
}