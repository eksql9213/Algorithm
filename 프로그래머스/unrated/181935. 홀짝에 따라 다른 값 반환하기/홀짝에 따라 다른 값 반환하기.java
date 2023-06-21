class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n%2 == 1 ? 1 : 2;
        
        for(int i=num; i<=n; i+=2) {
            if(num == 1) {
                answer += i;
            } else {
                answer += i*i;
            }
        }
        return answer;
    }
}