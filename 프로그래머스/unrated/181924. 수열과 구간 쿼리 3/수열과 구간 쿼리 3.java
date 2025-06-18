import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] query : queries) {
            int tmp = answer[query[0]];
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = tmp;
        }
        
        return answer;
    }
}