class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<todo_list.length; i++) {
            if(!finished[i]) {
                answer.append(todo_list[i]+" ");
            }
        }
        
        return answer.toString().split(" ");
    }
}