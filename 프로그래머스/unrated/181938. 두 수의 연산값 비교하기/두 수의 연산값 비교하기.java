class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_b = Integer.parseInt(""+a+b);
        int a_b_2 = 2*a*b;
        
        if(a_b == a_b_2) {
            answer = a_b;
        } else {
            answer = a_b > a_b_2 ? a_b : a_b_2;
        }
        
        return answer;
    }
}