package basicAlgorithms.programmers;

public class Baemin7 {
    public String solution(String cryptogram) {
        StringBuilder str = new StringBuilder(cryptogram);
        String answer = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    length -= 2;
                    i = 0;
                }
            }
        }
        answer = str.toString();
        return answer;
    }

    public static void main(String[] args) {
        Baemin7 b = new Baemin7();
        String result = b.solution("zzyy");
        System.out.println(result);
    }

}

