package topcoder;

public class InterestingParty2 {
  /*
  다재다능한 화이트 씨가 있다. 그에게는 친구들이 있다. 각 친구들은 2가지 주제에만 관심이 있고 다른 주제로 이야기하는 것을 싫어한다.
  그래서 파티를 열 때마다 모두가 즐겁게 파티를 보내려면 어떤 친구를 초대할지가 문제다ㅏ.
  공통의 화재가 있을 때 파티를 즐긴다는 것을 알았다.
  문자열 배열 first, second가 주어진다. 화이트 씨의 i번째 친구가 흥미있는 화제는 first[i]와 second[i]이다.
  즐거운 파티가 되려면 화이트씨가 초대할 수 있는 친구는 최대 몇 명인지 리턴해라.
  가장 많은 것을 답하세요 -> 라는 문제를 보면 직감적으로 전체 탐색을 머리 속에 떠올려야 한다.
   */
  public int bestInvitation(String[] first, String[] second){
    int check = 0;
    for(int i = 0; i < first.length; i++){
      int f = 0;
      int s = 0;
      for(int j = 0; j < first.length; j++){
        if(first[i].equals(first[j])) f++;
        if(first[i].equals(second[j])) f++;
        if(second[i].equals(first[j])) s++;
        if(second[i].equals(second[j])) s++;
      }
      check = Math.max()
    }
  }

  /*
  전체 탐색
  과정을 물어보지 않고 "가장 좋은 결과는 무엇인가?"라고 물어보는 문제
  "선택 사항이 몇 개 있고 어떤 것을 선택해야 할지 모른다면 모든 경우를 테스트 하자"
  패턴 1) 모든 패턴을 찾고 가장 좋은 답을 찾는 것 ex> 배열 {1,2,3,5}가 주어졌을 때 가장 큰 숫자를 리턴
  패턴 2) 모든 패턴을 찾고 조건을 충족하는 패턴이 몇 개 인지 찾는 것 ex> 배열 {1,2,3,5}가 주어졌을 때 짝수가 몇 개 있는지 리턴

  전체 탐색과 시뮬레이션의 차이
  - 시물레이션은 수행해야 하는 과정이 모두 나와있는 문제
  - 전체 탐색은 모든 패턴을 조사해야 하는것과 그것을 필요로 하는 문제
   */
}
