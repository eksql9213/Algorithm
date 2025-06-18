class Solution {
    public String solution(String myString) {
        StringBuffer answer = new StringBuffer(myString.toLowerCase());        
        
        for(int i=0; i<answer.length(); i++) {
            char chr = answer.charAt(i);
            if(chr == 'a') answer.setCharAt(i, (char)(chr-32));
        }
        return answer.toString();
    }
}