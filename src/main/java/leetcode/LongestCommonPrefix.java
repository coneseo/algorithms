package leetcode;

public class LongestCommonPrefix {
  public  String longestCommonPrefix(String[] strs) {
    String ans = "";
    try{
      outer:
      for (int i=0; i<strs[0].length();i++){
        for (int j=1; j<strs.length;j++){
          if (strs[j].charAt(i) != strs[0].charAt(i)){
            break outer;
          }
        }
        ans +=  strs[0].charAt(i);
      }
    }
    catch (Exception e){

    }
    return ans;
  }
}
