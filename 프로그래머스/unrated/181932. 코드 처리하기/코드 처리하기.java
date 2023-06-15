class Solution {
    public String solution(String code) {
        
        StringBuffer sb = new StringBuffer(code);
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char code_chr = code.charAt(i);
            if(code_chr == '1') {
                mode = 1-mode;
                continue;
            }
            if(mode == 0) {
                if(i == 0 || i%2 == 0) {
                    sb.append(code_chr);
                }
            } else {
                if(i%2 != 0) {
                    sb.append(code_chr);
                }
            }
        }
        
        if(sb.length() == code.length()) {
            return "EMPTY";
        }
            
        String answer = sb.substring(code.length());
        return answer;
    }
}