package basicAlgorithms.programmers;

import java.util.*;

public class LevelOneDivideArray {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
            }
        }

        if (temp.size() == 0) {
            temp.add(-1);
        }
        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 10};
        int divisor = 5;
        int[] result = solution(arr, divisor);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + ",");
        }
        System.out.println(result);
    }
}
