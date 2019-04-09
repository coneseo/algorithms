package basicAlgorithms.programmers;

import java.util.HashMap;

public class SkillTree {
    public int skillTree(String skill, String[] skill_trees){
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            int idx = 0;
            boolean flag = true;
            for(int j=0; j< skill_trees[i].length(); j++){
                for(int k=idx; k< skill.length(); k++){
                    if(skill.charAt(k) == skill_trees[i].charAt(j)){
                        if(k!=idx) flag = false;
                        else{
                            idx++;
                        }
                    }
                }
            }
            if(flag) answer++;
        }

        return answer;

    }

//    public int skillTree2(String skill, String[] skill_trees){
//        int answer = 0;
//        //해시 맵을 하나 만든다.
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        //skill 문자열을 탐색하며 charAt()을 통해 문자를 뽑아낸다.
//        for(int i=0; i<skill.length(); i++){
//            map.put(skill.charAt(i), i+1);
//        }
//
//        for(int i=0; i<skill_trees.length; i++)
//
//
//
//        return answer;
//    }
}
