class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++) {
            char chr = my_string.charAt(i);
            
            if('A' <= chr && chr <= 'Z') {
                answer[chr-'A'] ++;
            }
            else {
                answer[chr-'A'-6] ++;
            }
        }
        
        return answer;
    }
}