class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int[] query = queries[i];
            int min = Integer.MAX_VALUE;
            
            for(int j=query[0]; j<=query[1]; j++) {
                if(query[2] < arr[j] && arr[j] < min) {
                    min = arr[j];
                }
            }
            
            answer[i] = min != Integer.MAX_VALUE ? min : -1;
        }
        return answer;
    }
}