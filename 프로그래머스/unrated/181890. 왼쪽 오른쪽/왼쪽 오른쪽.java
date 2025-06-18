class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int index = 0;
        int length = 0;
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                length = i;
                break;
            }
            else if(str_list[i].equals("r")) {
                index = i+1;
                length = str_list.length-1-i;
                break;
            }
        }
        
        if(length != 0) {
            answer = new String[length];
            System.arraycopy(str_list, index, answer, 0, length);
        }
        
        return answer;
        
    }
}