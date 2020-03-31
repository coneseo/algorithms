package topcoder;

public class Cryptography2 {
  /*
  새로운 암호화 시스템을 개발한다. 이 시스템은 암호화하려고 숫자 리스트를 입력받는다.
  입력 리스트에서 1개의 값을 선택하고 값을 1 증가시킨다. 이때 리스트 내부의 모든 숫자 곱이 가장 커져야 한다.
  int[] numbers 형태로 숫자 배열이 주어질 때 곱의 최댓값을 리턴하시오. 리턴값이 2^62를 넘는 문제는 나오지 않는다.
   */
  public long encrypt(int[] numbers){
    int ans = 0;
    for(int i = 0; i < numbers.length; i++){
      int mul = 1;
      for(int j = 0; j < numbers.length; j++){
        if(j == i){
          mul *= (numbers[j]+1);
        }else{
          mul *= numbers[j];
        }
      }
      ans = Math.max(mul, ans);
    }
    return ans;
  }

  public static void main(String[] args) {
    Cryptography2 cryptography2 = new Cryptography2();
    int[] array = {1,1,1,1};
    long encrypt = cryptography2.encrypt(array);
    System.out.println(encrypt);
  }
}
