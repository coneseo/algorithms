package basicAlgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Army {
    public static int solution(int[] ranks) {

        Map<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < ranks.length; i++) {
            Integer count = rankMap.get(ranks[i]);
            if (count == null) {
                count = 0;
            }
            rankMap.put(ranks[i], count + 1);
        }


        int count = 0;
        for (Map.Entry<Integer, Integer> e : rankMap.entrySet()) {
            int num = e.getKey();
            if (rankMap.containsKey(num + 1) == rankMap.containsKey(num)) {
                count += rankMap.get(num);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7,};
        System.out.println(solution(arr));


    }
}
