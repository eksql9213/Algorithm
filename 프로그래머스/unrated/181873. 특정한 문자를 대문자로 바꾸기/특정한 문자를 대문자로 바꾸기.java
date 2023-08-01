class Solution {
    public String solution(String my_string, String alp) {
        StringBuffer answer = new StringBuffer(my_string);
        
        for(int i=0; i<my_string.length(); i++) {
            char chr = my_string.charAt(i);
            
            if(String.valueOf(chr).equals(alp))
                answer.setCharAt(i, (char)(chr-32));
        }
        
        return answer.toString();
    }
}