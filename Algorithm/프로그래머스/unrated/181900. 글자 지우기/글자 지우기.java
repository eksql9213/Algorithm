class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer(my_string);
        
        for(int indice : indices) {
            answer.replace(indice, indice+1, " ");
        }
        
        return answer.toString().replace(" ", "");
    }
}