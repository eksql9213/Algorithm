import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> int_list = new ArrayList<Integer>();
        for(String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s+l));
            if(num > k) {
                int_list.add(num);
            }
        }
        
        int[] answer = new int[int_list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = int_list.get(i);
        }
        
        return answer;
    }
}