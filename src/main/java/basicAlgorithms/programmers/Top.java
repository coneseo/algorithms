package basicAlgorithms.programmers;

import basicAlgorithms.Stack;

public class Top {
    public int solution(int number) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            String str = String.valueOf(i);
            boolean bol = false;
            for (int j = 0; j < str.length(); j++) {
                char chk = str.charAt(j);
                if (chk == '3' || chk == '6' || chk == '9') {
                    answer++;
                    bol = true;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Top top = new Top();

        System.out.println(top.solution(14));
    }
}

