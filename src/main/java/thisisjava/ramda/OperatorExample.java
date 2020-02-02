package thisisjava.ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
  private static int[] scores = {92, 95, 87};
  public static int maxOrMin(IntBinaryOperator operator){
    int result = scores[0];
    for(int score : scores){
      //람다식 실행
      result = operator.applyAsInt(result, score);
    }
    return result;
  }

  public static void main(String[] args) {
    //최대값 얻기
    int max = maxOrMin(
        (a,b) -> {
          if(a>=b) return a;
          else return b;
        }
    );
    System.out.println("최대값 : "+max);

    //
  }
}
