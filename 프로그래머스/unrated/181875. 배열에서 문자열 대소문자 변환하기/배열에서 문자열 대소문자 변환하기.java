class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i=0; i<answer.length; i++) {
            String str = "";
            
            if(i%2==0) str = strArr[i].toLowerCase();
            else str = strArr[i].toUpperCase();
            
            answer[i] = str;
        }
        
        return answer;
    }
}