package leetcode;

public class Parentheses {
  public boolean isValid(String s) {
    String[] array = s.split("");
    int length = array.length;
    if(length%2 > 0){
      return false;
    }
  }
}
