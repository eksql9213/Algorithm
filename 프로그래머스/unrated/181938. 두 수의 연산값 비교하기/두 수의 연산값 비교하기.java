class Solution {
    public int solution(int a, int b) {
        
        int num = b;
        int digit_num = 10;
        while(num>=10) {
            digit_num *= 10;
            num /= 10;
        }
        
        int answer = 0;
        int a_b = a*digit_num + b;
        int a_b_2 = 2*a*b;
        
        if(a_b == a_b_2) {
            answer = a_b;
        } else {
            answer = a_b > a_b_2 ? a_b : a_b_2;
        }
        
        return answer;
    }
}