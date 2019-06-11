package basicAlgorithms.programmers;

public class GetMiddleNumber {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int index = length / 2;
        return (length % 2 == 0) ? s.substring(index - 1, index + 1) : s.substring(index, index + 1);
    }

    public String solution2(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return Character.toString(s.charAt(len / 2));
        } else {
            return s.substring(len / 2 - 1, len / 2 + 1);
        }
    }
}
