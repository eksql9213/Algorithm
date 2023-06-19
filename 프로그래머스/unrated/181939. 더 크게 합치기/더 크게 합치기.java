class Solution {
    public int solution(int a, int b) {
        int a_b = a*digit_num(b) + b;
        int b_a = b*digit_num(a) + a;

        return a_b > b_a ? a_b : b_a;
    }
    
    int digit_num(int num) {
        int digit = 10;
        while(num>=10){
            digit *= 10;
            num /= 10;
        }
        return digit;
    }
}