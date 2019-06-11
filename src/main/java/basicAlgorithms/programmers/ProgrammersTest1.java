package basicAlgorithms.programmers;

public class ProgrammersTest1 {
    public int solution(int[] s) {
        int answer = 0;
        int[] count = new int[4];
        for (int i = 0; i < s.length; i++) {
            count[s[i] - 1]++;
        }
        while (true) {
            boolean flag = false;
            if (count[0] != 0 && count[2] != 0) {// 1, 3
                count[0]--;
                count[2]--;
                answer++;
                flag = true;
            } else if (count[1] > 1) {
                count[1] -= 2;
                answer++;
                flag = true;
            } else if (count[0] > 0 && count[1] > 0) {
                if (count[0] == 1) { // 2, 1
                    answer++;
                    count[0]--;
                    count[1]--;
                } else {  // 2 , 1 , 1
                    count[0] -= 2;
                    count[1]--;
                    answer++;
                }
                flag = true;
            } else if (count[0] > 3) {
                count[0] -= 4;
                answer++;
                flag = true;
            } else {
                if (count[0] != 0) answer++;
                if (count[1] != 0) answer++;
                answer += count[2];
                answer += count[3];
            }
            if (flag == false) break;
        }
        return answer;
    }
}