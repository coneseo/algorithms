package leetcode;

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
}
