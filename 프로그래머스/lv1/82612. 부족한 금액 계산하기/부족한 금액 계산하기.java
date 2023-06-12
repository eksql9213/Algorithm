class Solution {
    public long solution(int price, int money, int count) {
        long total_price = 0;
        for(int i=1; i<=count; i++) {
            total_price += price*i;
        }
        
        if(total_price - money < 0) {
            return 0;
        } else {
            return total_price - money;
        }

    }
}