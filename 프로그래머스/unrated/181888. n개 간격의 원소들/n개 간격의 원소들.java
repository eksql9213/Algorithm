class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil(num_list.length/(n*1.0))];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[i*n];
        }
        
        return answer;
    }
}