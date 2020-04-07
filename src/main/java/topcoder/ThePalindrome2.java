package topcoder;

public class ThePalindrome2 {
  public int find(String s){
    //답의 문자 길이를 결정합니다.
    for(int i = s.length(); ; i++){
      boolean flag = true;
      for(int j = 0; j < s.length(); j++){
        //반대쪽 문자가 존재하는데 다를 경우 플래그를 변경
        if((i - j - 1) < s.length() && s.charAt(j) != s.charAt((i - j - 1))){
          flag = false;
          break;
        }
      }
      //조건을 모두 만족할 경우 답을 리턴
      if(flag) return i;
    }
  }
}
