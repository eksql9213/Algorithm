class Solution {
    public int solution(int a, int b, int c) {
        
        int num = 0;
        int answer = 1;
        
        if(a!=b && b!=c && c!=a) {
            num = 1;
        }
        
        else if(a==b && b==c && c==a) {
            num = 3;
        }
        
        else {
            num = 2;
        }
            
        for(int i=1; i<=num; i++) {
            answer *= (int) (Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i));
        }
        
        return answer;
    }
}