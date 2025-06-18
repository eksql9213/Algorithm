class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        boolean first = true;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                if(first) {
                    start = i;
                    first = !first;
                }
                
                end = i;
            }
        }
        
        int[] answer = new int[end-start+1];
        
        if(first)
            answer[0] = -1;
        else
            System.arraycopy(arr, start, answer, 0, answer.length);

        return answer;
    }
}