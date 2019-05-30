package basicAlgorithms.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Athelete {
    //Arrays.sort()를 써서 정렬
    public String solution(String[] participant, String[] completion){
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<participant.length; i++){

                if(!participant[i].equals(completion[i])){
                    answer = participant[i];
                }

        }

        return answer;
    }

    public String solution1(String[] participant, String[] completion){
        String answer = "";
        Map<String,Integer> participants = new HashMap<>();

//        for(String par : participant){
//            participants.put(par,1);
//        }
        for(String par : participant) participants.put(par, participants.getOrDefault(par, 0) + 1);

//        for(String com : completion){
//            if(participants.containsKey(com)) {
//                participants.put(com, 0);
//            }
//        }
        for(String com : completion) participants.put(com, participants.get(com) - 1);

        for(Map.Entry<String, Integer> entry : participants.entrySet()){
            if(entry.getValue().equals(1)){
                answer += entry.getKey();
            }
        }
        return answer;
    }
}
