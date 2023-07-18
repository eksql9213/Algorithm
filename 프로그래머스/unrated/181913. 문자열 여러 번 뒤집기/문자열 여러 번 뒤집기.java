import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        String answer = my_string;
        
        for(int[] query : queries) {
            char[] charArr = new char[query[1]-query[0]+1];
            
            for(int i=0; i<charArr.length; i++) {
                charArr[i] = answer.charAt(query[1]-i);
            }
            
            answer = answer.substring(0, query[0]) + String.valueOf(charArr) + answer.substring(query[1]+1);
        }        
        
        return answer;
    }
}