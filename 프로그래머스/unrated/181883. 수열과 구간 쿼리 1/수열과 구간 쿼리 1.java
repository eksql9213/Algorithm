import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] query : queries) {
            for(int j=query[0]; j<=query[1]; j++) {
                answer[j]++;
            }
        }
        return answer;
    }
}