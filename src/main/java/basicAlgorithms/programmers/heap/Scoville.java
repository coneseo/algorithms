package basicAlgorithms.programmers.heap;

import java.util.*;

public class Scoville {

    public int solution(int[] scoville, int K) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (pq.size() < 2 && pq.peek() < K) {
                result = -1;
                break;
            }
            if (pq.peek() >= K) {
                break;
            }
            n1 = pq.poll();
            n2 = pq.poll();
            n3 = n1 + n2 * 2;
            pq.add(n3);
            result++;
        }

        return result;
    }

}



