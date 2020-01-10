package leetcode;

import java.util.HashMap;

public class RomanToInteger {
  HashMap<String, Integer> map = new HashMap<>();
  HashMap<String, Integer> list = new HashMap<>();
  public int romanToInt(String s) {
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);

    list.put("IV",4);list.put("IX",9);list.put("XL",40);
    list.put("XC",90);list.put("CD",400);list.put("CM",900);

    int sum = 0;
    int i=0;
    String temp;
    while(i<s.length()){
      if(i+1 < s.length())
        temp = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
      else
        temp = "";
      if(list.containsKey(temp)){
        sum = sum + list.get(temp);
        i = i+2;
        continue;
      }
      sum = sum + map.get(String.valueOf(s.charAt(i)));
      i++;
    }
    return sum;
  }
}
