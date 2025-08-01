class Solution {
    public String solution(String myString, String pat) {
        int n = 0;
        int str_length = myString.length();
        int pat_length = pat.length();
        
        for(int i=0; i<str_length; i++) {
            if(i+pat_length <= str_length) {
                if(myString.substring(i, i+pat_length).equals(pat)) {
                    n = i+pat_length;
                }
            } else {
                break;
            }
        }
        
        return myString.substring(0, n);
    }
}