class Solution {
    public int solution(int[] num_list) {
        int odd_sum = 0;
        int even_sum = 0;
        
        for(int i=0; i<num_list.length; i++) {
            int num = num_list[i];
            if(i%2 != 0) odd_sum += num;
            else even_sum += num;
        }
        
        
        return odd_sum > even_sum ? odd_sum : even_sum;
    }
}