package basicAlgorithms.programmers;


import java.util.Arrays;


public class LevelOneKthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = {};
        for (int i = 0; i < commands.length; i++) {
            temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }

    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = {};
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            temp = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(temp);
            answer[i] = temp[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {5, 6, 3}};
        LevelOneKthNumber kthNumber = new LevelOneKthNumber();
        int[] results = kthNumber.solution(array, commands);
        System.out.println(results.toString());
    }
}
