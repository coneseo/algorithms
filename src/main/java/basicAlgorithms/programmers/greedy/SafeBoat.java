package basicAlgorithms.programmers.greedy;

import java.util.Arrays;

public class SafeBoat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80};
        int lim = 100;
        int result = solution(people, lim);
        System.out.println(result);

    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i];
            if (sum < limit) {
                continue;
            } else if (sum > limit && i == 1) {
                answer = people.length;
                break;
            } else {
                answer = people.length - i;
                break;
            }
        }

        return answer;
    }
}
