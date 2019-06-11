package basicAlgorithms.recursives;

public class Code01 {
    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    private static void func(int n) {
        if (n <= 0) //Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다.
            return;
        else {
            System.out.println("hello");
            func(n - 1); //Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야한다.
        }
    }


}
