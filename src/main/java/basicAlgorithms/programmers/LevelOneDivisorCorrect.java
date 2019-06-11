package basicAlgorithms.programmers;

import java.util.Arrays;

public class LevelOneDivisorCorrect {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int a = 0;
        int count = 0;
        for (int num : arr) {
            if ((num % divisor) == 0) {
                answer[a++] = num;
                count++;
            }
        }
        if (count == 0) {
            answer[0] = -1;
        } else {
            Arrays.sort(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        LevelOneDivisorCorrect lv = new LevelOneDivisorCorrect();
        int[] arr = {5, 9, 7, 10};
        int div = 5;
        int[] result = lv.solution(arr, div);
        System.out.println(result.toString());
    }
}
