package mailprogramming;

public class IntArrayLargestSum_DAY_1 {
/*
  정수 배열이 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간 복잡도는 O(n).

  ex>
  Input : [-1,3,-1,5]
  Output : 7 // 3 +(-1)+5

  Input : [-5,-3,-1]
  Output : -1 // -1

  Input : [2,4,-2,-3,8]
  Output : 9 // 2 + 4 + (-2) + (-3) + 8

 */
  public int solution(int[] array){
    int maxSum = array[0];
    int currentSum = array[0];
    for(int i = 1; i < array.length; i++){
      currentSum = Math.max(currentSum + array[i], array[i]);
      maxSum = Math.max(currentSum, maxSum);
    }
    return maxSum;
  }
}
