package basicAlgorithms.programmers;

import java.util.Arrays;

public class JadenCase {
    public static void main(String[] args) {
        String result = solution("3people unFollowed me");
        System.out.println(result);

    }

    public static String solution(String s) {
        String answer = "";
        String[] temp = s.split("");
        boolean check = true;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i].equals(" ")) {
                check = false;
            } else if (check == false) {
                temp[i].toUpperCase();
                check = true;
            } else {
                temp[i].toLowerCase();
            }
        }
        temp[0].toUpperCase();
        answer = Arrays.toString(temp);

        return answer;
    }
}
