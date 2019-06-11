package basicAlgorithms.programmers.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int[] array = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(array, location));

    }

    public static int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();
        for (int p : priorities) {
            q.offer(p);
        }
        int count = 0;
        while (!q.isEmpty()) {
            int item = q.poll();
            boolean check = true;
            for (int s : q) {
                if (item < s) {
                    check = false;
                }
            }
            if (check) {
                count++;
                if (location == 0) {
                    return count;
                }
            } else {
                q.offer(item);
            }
            location--;
            if (location < 0) {
                location += q.size();
            }
        }
        return count;
    }
}
