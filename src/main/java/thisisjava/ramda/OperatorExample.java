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
}
