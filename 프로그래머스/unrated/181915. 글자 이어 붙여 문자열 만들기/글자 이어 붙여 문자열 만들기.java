class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] answer = new char[index_list.length];
        
        for(int i=0; i<index_list.length; i++) {
            answer[i] = my_string.charAt(index_list[i]);
        }
        
        return String.valueOf(answer);
    }
}