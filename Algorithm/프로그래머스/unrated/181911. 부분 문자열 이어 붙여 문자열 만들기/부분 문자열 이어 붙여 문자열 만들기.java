class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<parts.length; i++) {
            int[] part = parts[i];
            String my_string = my_strings[i];
            
            answer.append(my_string.substring(part[0], part[1]+1));
        }
        
        return answer.toString();
    }
}