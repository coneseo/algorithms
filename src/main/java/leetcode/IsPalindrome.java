package leetcode;

public class IsPalindrome {
  public boolean isPalindrome(int x) {
    String a = Integer.toString(x);
    String b= new StringBuilder(a).reverse().toString();
    if(a.equals(b)){
      return true;
    }else{
      return false;
    }
  }
}
