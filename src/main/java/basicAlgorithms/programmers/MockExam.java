package basicAlgorithms.programmers;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    //    public int max(int k , int v){
//        return k < v ? v : k;
//    }
    public int[] solution(int[] answers) {

        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] count = new int[3];

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (patterns[i][j % patterns[i].length] == answers[j]) count[i]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) list.add(i + 1);
        }

        int[] answer = new int[list.size()];

        int cnt = 0;
        for (int num : list) {
            answer[cnt++] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 3, 2, 1, 2, 2, 4, 3};
        MockExam me = new MockExam();
        int[] result = me.solution(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print("[" + result[i] + "]");
        }

    }

}
