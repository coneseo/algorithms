package basicAlgorithms.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었습니다.
예를 들어 browoanoommnaon이라는 암호문은 다음과 같은 순서로 해독할 수 있습니다.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"
임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성해주세요.

 */
public class Cryptogram {
    public String solution(String cryptogram){
        String answer = "";
        //문자열 배열로 바꿔서
        //연속으로 같은 문자열이 있으면 제거하는데,
        //while문을 돌려서 중복되는 숫자가 없을 때까지라는 조건을 걸어주면 되겠다.
        String[] temp = null;
        temp = cryptogram.split("");
        List<String> list = Arrays.asList(temp);
        boolean isGood = true;
        int check = 0;

        while(isGood) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).equals(list.get(i + 1))) {
                    list.remove(i);
                    list.remove(i + 1);
                }
            }
        }


        return answer;
    }
}
