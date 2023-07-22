class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<answer.length; i++) {
            int cnt = 0;
            
            for(int j=0; j<my_string.length(); j++) {
                char chr = (char)('A' + i);
                
                if(i>25) {
                    chr = (char)(chr + 6);
                }
                
                if(my_string.charAt(j) == chr) {
                    cnt++;
                }
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}