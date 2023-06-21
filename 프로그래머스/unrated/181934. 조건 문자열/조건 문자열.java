class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String str = ineq + eq;
        int answer = 0;
        
        switch(str) {
            case ">=" :
                answer = n >= m ? 1 : 0;
                break;
            case "<=" :
                answer = n <= m ? 1 : 0;
                break;
            case ">!" :
                answer = n > m ? 1 : 0;
                break;
            case "<!" :
                answer = n < m ? 1 : 0;
                break;
        }
        
        return answer;
    }
}