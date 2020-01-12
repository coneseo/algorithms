package leetcode;

public class ValidParentheses {
  public boolean isValid(String s) {
    if (s == null || s.equals(""))
      return true;
    if (s.length() == 1)
      return false;

    while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
      if (s.contains("()"))
        s = s.replace("()", "");
      if (s.contains("{}"))
        s = s.replace("{}", "");
      if (s.contains("[]"))
        s = s.replace("[]", "");
    }

    if (s.length() != 0)
      return false;
    return true;
  }
}
