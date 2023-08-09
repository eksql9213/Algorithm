class Solution {
    public int[] solution(int n) {
        
        int[] answer = new int[(int)(Math.ceil(n/2.0))];
        int index = 0;
        
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}