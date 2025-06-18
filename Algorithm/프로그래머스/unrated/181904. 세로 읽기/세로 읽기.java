class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=c-1; i<my_string.length(); i+=m) {
            answer.append(my_string.substring(i, i+1));
        }
        
        return answer.toString();
    }
}