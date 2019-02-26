package basicAlgorithms.recursives;

//재귀로 0에서 n까지의 합 구하기
public class Code02 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }
    //이 함수의 mission은 0부터 n까지의 합을 구하는 것이다.
    private static int func(int n) {
        if(n==0)
            return 0;//n이 0이라면 합은 0이다.
        else
            return n + func(n-1); //n이 0보다 크면 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.
    }

}
