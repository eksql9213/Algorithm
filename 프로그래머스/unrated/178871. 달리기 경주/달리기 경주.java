import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++) {
            int rank = map.get(callings[i]);
            String tmp = players[rank];
            players[rank] = players[rank-1];
            players[rank-1] = tmp;
            map.replace(players[rank], rank);
            map.replace(players[rank-1], rank-1);
        }

        return players;
    }
}