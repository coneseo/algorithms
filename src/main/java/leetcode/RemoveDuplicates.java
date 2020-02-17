package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicates {

  public static void main(String[] args) {
    RemoveDuplicates rd = new RemoveDuplicates();
    int[] a = {1,2,2,3,3,4,4,5};

    int i = rd.removeDuplicates(a);
    System.out.println(i);
  }
  public int removeDuplicates(int[] nums) {
    int length = nums.length;
    if(length == 0) return 0;
    int current = nums[0];
    int uniq = 1;
    for (int i=1;i<length;i++) {
      if(nums[i] == current) continue;
      current = nums[i];
      nums[uniq] = current;
      uniq++;
    }
    return uniq;

  }
}
