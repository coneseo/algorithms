package basicAlgorithms.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                temp.add(arr[i]);
                break;
            } else if (arr[i] != arr[i + 1]) {
                temp.add(arr[i]);
            }
        }
        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
