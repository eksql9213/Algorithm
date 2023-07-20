class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer(my_string.substring(0,s));
        
        for(int i=0; i<=e-s; i++) {
            answer.append(my_string.substring(e-i,e-i+1));
        }
        return answer.toString() + my_string.substring(e+1);
    }
}