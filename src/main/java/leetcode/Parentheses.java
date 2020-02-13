package leetcode;

public class Parentheses {
  public boolean isValid(String s) {
    String[] array = s.split("");
    int length = array.length;
    if(length%2 > 0){
      return false;
    }
    boolean flag = false;
    for(String a : array){
      if(a.equals("{") && a.equals("[") && flag == false){
        flag = true;
      }else if(a.equals("}") && a.equals("]") && flag == true){
        flag = false;
      }
    }
    return flag;
  }
}
