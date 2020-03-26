package topcoder;

public class Kiwijuice2 {
/*
  타로라는 친구가 키위 주스를 준비했다. 0부터 N-1이라 이름을 붙인 N개의 병에 키위 주스를 넣는다. i번째 병의 용량은 capacities[i]리터이다.
  타로가 i번째 병에 넣은 키위 주스의 양을 bottles[i]리터라고 한다.
  타로는 병에 키위 주스를 재분배 하려고 하며, 0부터 M-1까지 M회 조작한다. i번째 조작은 fromId[i]부터 병 toId[i]에 키위 주스를 넣는 것을 의미한다.
  병 fromId[i] 가 비어있거나 병 toId[i]가 꽉 차 있는 순간, 타로는 더 이상 키위 주스를 넣지 않는다.
  N개의 요소를 가진 정수 배열 int[]를 리턴해주세요. 배열의 i번째 요소는 모든 주스를 쏟는 작업이 완료되고 i번째 병에 남아있는 키위 주스의 양입니다.
 */

  public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
    int[] result = new int[bottles.length];
    for(int i = 0; i < fromId.length; i++){
      int from = fromId[i];
      int to = toId[i];
      int fromAmount = bottles[from];
      int toAmount = bottles[to];
      int sum = fromAmount + toAmount;
      int capacityOfto = capacities[to];
      if(sum > capacityOfto){
        bottles[from] = sum - capacityOfto;
        bottles[to] = capacityOfto;
      }else{
        bottles[from] = 0;
        bottles[to] = sum;
      }
    }
    return bottles;
  }

  public int[] thePouring2(int[] capacities, int[] bottles, int[] fromId, int[] toId){
    for(int i = 0; i < fromId.length; i++){
      int from = fromId[i];
      int to = toId[i];
      int val = Math.min(bottles[from], capacities[to] - bottles[to]);
      bottles[from] -= val;
      bottles[to] += val;
    }
    return bottles;
  }

  public static void main(String[] args) {
    Kiwijuice2 kiwijuice2 = new Kiwijuice2();
//    int[] capacities = {20, 20};
//    int[] bottles = {5, 8};
//    int[] fromId = {0};
//    int[] toId = {1};
//    int[] capacities = {30, 20, 10};
//    int[] bottles = {10, 5, 5};
//    int[] fromId = {0, 1, 2};
//    int[] toId = {1, 2, 0};
    int[] capacities = {14, 35, 86, 58, 25, 62};
    int[] bottles = {6, 34, 27, 38, 9, 60};
    int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
    int[] toId = {0, 1, 2, 4, 2, 5, 3, 1};
    int[] ints = kiwijuice2.thePouring2(capacities, bottles, fromId, toId);
    for(int i : ints){
      System.out.println(i);
    }
  }
}
