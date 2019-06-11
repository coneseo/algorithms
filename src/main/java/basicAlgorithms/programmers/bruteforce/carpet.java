package basicAlgorithms.programmers.bruteforce;

public class carpet {
    public static void main(String[] args) {
        System.out.println(solution(10, 2));
    }

    public static int[] solution(int brown, int red) {
        int total = brown + red;
        int w = 0;
        int h = 0;
        for (int i = 3; i <= total / 3; i++) {
            if (total % i == 0) {
                if (red == (i - 2) * ((total / i) - 2)) {
                    h = i;
                    w = total / i;
                    break;
                }
            }
        }
        return new int[]{w, h};
    }
}
