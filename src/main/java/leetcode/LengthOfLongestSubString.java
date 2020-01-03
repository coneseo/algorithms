package leetcode;

import java.util.Arrays;

public class LengthOfLongestSubString {
  public int lengthOfLongestSubstring(String s) {
    boolean[] mem = new boolean[256];
    int max = 0;
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      while (mem[c]) {
        char cc = s.charAt(j);
        mem[cc] = false;
        j++;
      }
      mem[c] = true;
      max = Math.max(max, i - j + 1);
    }
    return max;
  }

  public static int lengthOfLongestSubstring2(String s){
    int res = 0;
    int[] lastIndex = new int[128];
    Arrays.fill(lastIndex, -1);
    int i =0,j = 0;
    for(; i < s.length(); i++){
      char c = s.charAt(i);
      if(lastIndex[c] >= j){
        res = Math.max(res, i - j);
        j = lastIndex[c] + 1;
      }
      lastIndex[c] = i;
    }
    return Math.max(res, i - j);
  }
}
