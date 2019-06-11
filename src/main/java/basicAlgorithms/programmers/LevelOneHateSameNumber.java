package basicAlgorithms.programmers;

import java.util.ArrayList;
import java.util.List;

public class LevelOneHateSameNumber {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int k = -1;
        for (int a : arr) {
            if (a != k) {
                list.add(a);
                k = a;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
