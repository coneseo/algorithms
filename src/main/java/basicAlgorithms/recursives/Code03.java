package basicAlgorithms.recursives;

// Factorial : n!  n부터 1까지의 곱
// 0! = 1
// n! = nx(n-1)! n > 0
public class Code03 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
        System.out.println(fibonacci(n));
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //최대공약수를 구하는 유클리드 정의
    //m>=n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n)=n이고,
    //그렇지 않으면 gcd(m,n) = gcd(n,m%n)이다.
    private static double gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp; //swap m and n
        }
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

    private static double gcdmoresimple(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcdmoresimple(q, p % q);
    }
}
