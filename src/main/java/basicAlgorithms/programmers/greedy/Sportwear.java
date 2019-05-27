package basicAlgorithms.programmers.greedy;

import java.util.HashMap;
import java.util.Map;

public class Sportwear {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.put(i+1, 1);
        }
        for(int i=0; i<lost.length; i++){
            if(hm.containsKey(lost[i])){
                hm.put(lost[i], hm.get(lost[i]) -1 );
            }
        }
        for(int i=0; i<reserve.length; i++){
            if(hm.containsKey(reserve[i])){
                hm.put(reserve[i], hm.get(reserve[i])+1 )
            }
        }

        for(Map.Entry<Integer,Integer> result : hm.entrySet()){
            answer += result.getValue();
        }
        return answer;
    }

}
