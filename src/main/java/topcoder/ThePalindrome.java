package topcoder;

public class ThePalindrome {
  public int find(String s){
    //답의 문자 길이를 결정합니다.
    for(int i=s.length(); ; i++){
      boolean flag = true;
      for(int j=0;j<s.length(); j++){
        //반대쪽에 문자가 존재하는 데 다를 경우 플래그를 변경합니다.
        if((i-j-1)<s.length() && s.charAt(j) != s.charAt(i-j-1)){
          flag = false;
          break;
        }
      }
      //조건을 모두 만족하면 답을 리턴합니다.
      if(flag) return i;
    }
  }
}
