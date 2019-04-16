package basicAlgorithms.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LevelOneUnfinishedRunner {
    /*
    수많은 마라톤 선수들이 마라톤에 참여하였습니다.
    단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의
    이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록
    solution 함수를 작성해주세요

    [leo, kiki, eden]	[eden, kiki]	  leo
    [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
    [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
     */
    public String solution(String[] participant, String[] completion){
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";

        for(int i=0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }

        if(answer.equals("")){
            answer = participant[participant.length - 1];
        }

        return answer;
    }

    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] arrP = {"leo", "kiki", "eden"};
        String[] arrC = {"eden", "kiki"};

        LevelOneUnfinishedRunner ufin = new LevelOneUnfinishedRunner();
        System.out.println(ufin.solution(arrP, arrC));

    }
}
