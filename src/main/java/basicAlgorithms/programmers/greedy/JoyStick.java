package basicAlgorithms.programmers.greedy;

import java.util.ArrayList;
import java.util.List;

public class JoyStick {

    public static void main(String[] args) {
        int result = solution3("ABABAAAAAAABA");
        System.out.println(result);
    }

    public static int solution2(String name) {
        int answer = 0, n = name.length(),
                leftOrRight = name.length() - 1;
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            char target = name.charAt(i);
            if (target <= 'N') answer += target - 'A';
            else answer += 'Z' - target + 1;
            while (next < n && name.charAt(next) == 'A') next++;
            leftOrRight = Math.min(leftOrRight, i + n - next + Math.min(i, n - next));
        }
        answer += leftOrRight;
        return answer;
    }

    public int solution(String name) {
        int answer = 0;
        String make = "";
        for (int i = 0; i < name.length(); i++) {
            make += "A";
        }

        int now = 0;
        while (make != name) {
            int i = 0;
            int temp1 = 0;
            int temp2 = 0;
            int j, k;

            for (k = 0; k < name.length(); k++) {
                int idx = (now + k) % name.length();
                if (make.charAt(idx) != name.charAt(idx)) {
                    if ((idx - now) < 0) {
                        temp1 = name.length() - now + idx;
                        break;
                    } else {
                        temp1 = idx - now;
                        break;
                    }
                }
            }

            for (j = 0; k < name.length(); j++) {
                int idx = (now - j + name.length()) % name.length();
                if (make.charAt(idx) != name.charAt(idx)) {
                    if ((now - idx) < 0) {
                        temp2 += name.length() - idx + now;
                        break;
                    } else {
                        temp2 = now - idx;
                        break;
                    }
                }
            }

            if (temp1 <= temp2) {
                i = (now + k) % name.length();
                answer += temp1;
            } else {
                i = (now - j + name.length()) % name.length();
                answer += temp2;
            }

            now = i;

            if (name.indexOf(i) - 'A' < 13) {
                answer += name.indexOf(i) - 'A';
                //make.charAt(i) = name.charAt(i);
            } else {
                answer += 'Z' - name.indexOf(i) + 1;
                //make.charAt(i) = name.charAt(i);
            }
        }

        return answer;
    }

    public static int solution3(String name) {
        int answer = 0;
        int[] diff = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (char c : name.toCharArray())
            answer += diff[c - 'A'];

        int length = name.length();
        int min = length - 1;

        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            min = Math.min(min, i + length - next + Math.min(i, length - next));
        }

        return answer + min;
    }

    public static int solution4(String name) {
        int answer = 1000000;
        int tmp = 0;
        char[] chars = name.toCharArray();
        boolean[] checkA = new boolean[chars.length];
        List<Integer> indexs = new ArrayList<>();
        int cnt = 0;
        int cntTmp = 0;
        int index = 0;
        boolean checkFirst = false;
        for (int i = 0; i < checkA.length; i++) {
            if (!checkFirst && chars[i] != 'A') {
                index = i;
                checkFirst = true;
            }
            if (chars[i] == 'A') {
                checkA[i] = true;   // A는 패스
                cnt++;
            }
        }

        for (int i = 0; i < checkA.length; i++) {
            if (!checkA[i]) {
                indexs.add(i);
            }
        }

        for (int firstIndex : indexs) {
            cntTmp = name.length() - cnt - 1;
            index = firstIndex;
            tmp = (name.length() / 2 < index) ? name.length() - index : index;
            boolean[] checkTmp = checkA.clone();
            while (cntTmp > 0) {
                // 계산
                tmp += Math.min(chars[index] - 'A', 'Z' - chars[index] + 1);
                checkTmp[index] = true;
                int[] next = whereNext(checkTmp, index);
                tmp += next[1];
                index = next[0];
                cntTmp--;
            }
            tmp += Math.min(chars[index] - 'A', 'Z' - chars[index] + 1);
            if (tmp < answer) {
                answer = tmp;
            }
        }
        return answer;
    }

    // 0 -> next index , 1 -> 이동한 칸 수
    public static int[] whereNext(boolean[] checkA, int now) {
        int left = 100;
        int leftNextIndex = -1;
        int rightNextIndex = -1;
        int right = 100;
        int[] result = new int[2];


        for (int i = now + 1; i < checkA.length; i++) {
            if (!checkA[i]) {
                right = i - now;
                rightNextIndex = i;
                break;
            }
        }

        for (int i = 0; i < checkA.length; i++) {
            if (!checkA[i]) {
                if (right > checkA.length - now + i) {
                    right = checkA.length - now + i;
                    rightNextIndex = i;
                    break;
                }
            }
        }

        for (int i = checkA.length - 1; i > 0; i--) {
            if (!checkA[i]) {
                left = now + checkA.length - i;
                leftNextIndex = i;
                break;
            }
        }

        for (int i = now - 1; i >= 0; i--) {
            if (!checkA[i]) {
                if (left > now - i) {
                    left = now - i;
                    leftNextIndex = i;
                    break;
                }
            }
        }

        if (left < right) {
            result[0] = leftNextIndex;
            result[1] = left;
        } else {
            result[0] = rightNextIndex;
            result[1] = right;
        }

        return result;
    }
}
