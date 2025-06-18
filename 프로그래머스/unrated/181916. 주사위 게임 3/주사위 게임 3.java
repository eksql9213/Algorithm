import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = { a, b, c, d };
        Arrays.sort(num);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i: num) {
            if(map.containsKey(i)) {
                map.put(i, (int)map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        
        int p = 0;
        int q = 0;
        int answer = 0;
        
        switch(map.size()) {
            case 1 :
                answer = 1111*a;
                System.out.println(map);
                break;
            case 2 :   
                if(map.containsValue(3)) {
                    for(Integer key : map.keySet()) {
                        int value = map.get(key);
                        if(value == 3) {
                            p = key;
                        }
                        else {
                            q = key;
                        }
                    }
                    answer = (int)Math.pow((10*p+q), 2);
                }
                else {
                    for(Integer key : map.keySet()) {
                        int value = map.get(key);
                        if(p == 0) {
                            p = key;
                        }
                        else {
                            q = key;
                        }
                    }
                    answer = (p+q)*Math.abs(p-q);
                }
                break;
            case 3 :
                for(Integer key : map.keySet()) {
                    int value = map.get(key);
                    if(value != 2) {
                        if(p == 0) {
                            p = key;
                        }
                        else {
                            q = key;
                        }
                    }
                }
                answer = p*q;
                break;
            case 4 :
                answer = num[0];
                break;
        }
        
        return answer;
    }
}