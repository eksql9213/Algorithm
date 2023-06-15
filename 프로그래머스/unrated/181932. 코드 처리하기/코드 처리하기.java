class Solution {
    public String solution(String code) {
        
        StringBuffer answer = new StringBuffer();
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char code_chr = code.charAt(i);
            if(code_chr == '1') {
                mode = 1-mode;
                continue;
            }
            if(mode == 0) {
                if(i == 0 || i%2 == 0) {
                    answer.append(code_chr);
                }
            } else {
                if(i%2 != 0) {
                    answer.append(code_chr);
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}