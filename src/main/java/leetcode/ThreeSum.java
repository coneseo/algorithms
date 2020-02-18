package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums){
    if(nums == null || nums.length < 3){
      return new ArrayList<>();
    }
    Set<List<Integer>> triplets = new HashSet<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int start = i + 1;
      int end = nums.length - 1;

      while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];

        if (sum == 0) {
          List<Integer> sumZero = Arrays.asList(nums[i], nums[start], nums[end]);
          if (!triplets.contains(sumZero)) {
            triplets.add(sumZero);
          }
        }

        if (sum < 0) {
          start++;
        } else {
          end--;
        }
      }
    }

    return new ArrayList<>(triplets);
  }
}
