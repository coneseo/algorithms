package basicAlgorithms.programmers.programmingmaster;

import java.util.HashSet;

public class Phonekemon {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int poketmon = length/2;
        for(int i=0; i<length; i++){
            set.add(nums[i]);
        }
        int size = set.size();
        if(size > poketmon){
            return poketmon;
        }
        else return size;
    }
}
