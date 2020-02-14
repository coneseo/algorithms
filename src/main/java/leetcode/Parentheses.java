package leetcode;

import java.util.Stack;

public class Parentheses {

  public static void main(String[] args) {
    String s = "{{}}";
    Parentheses parentheses = new Parentheses();
    boolean valid = parentheses.isValid2(s);

  }

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

  public boolean isValid2(String s) {
    Stack<Integer> st = new Stack<>();

    for (char c : s.toCharArray()) {
      switch (c) {
        case '(':
        case '{':
        case '[':
          st.push(Integer.valueOf(c));
          break;
        default:
          if (st.empty() || Math.abs(st.pop()-c) > 2) //small cheat to use ASCI codes :)
            return false;
      }
    }
    return st.empty();
  }

  public boolean isValid3(String s) {
    Stack p = new Stack();
    for(int i=0;i<s.length();i++)
    {

      if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
        p.push(s.charAt(i));
      else
      {
        if(p.isEmpty())
          return false;
        else{
          if(s.charAt(i)==')' && p.pop()!='(') {
            return false;
          }
          if(s.charAt(i)=='}' && p.pop()!='{') {
            return false;
          }
          if(s.charAt(i)==']' && p.pop()!='[') {
            return false;
          }

        }
      }
    }
    if(p.isEmpty())
      return true;
    return false;
  }

}
