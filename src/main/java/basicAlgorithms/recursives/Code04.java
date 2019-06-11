package basicAlgorithms.recursives;

public class Code04 {
    public static void main(String[] args) {

    }

    //문자열의 길이를 구하는 메서드
    //첫 번째 문자를 빼고 나머지 문자열을 파라미터로 넣어서 계속 호출하면
    //호출 될 때 마다 1이 더해지고 마지막엔 0이 호출돼서 문자열의 길이가 나온다.
    public static int length(String str) {
        if (str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    //문자열을 화면에 출력하는 메서드
    public static void printChars(String str) {
        if (str.length() == 0)
            return;
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    //문자열을 화면에 거꾸로 출력하는 메서드
    public static void printCharReverse(String str) {
        if (str.length() == 0)
            return;
        else {
            printCharReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    //음이 아닌 정수 n을 2진수로 변환하여 출력
    public static void printBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else
            printBinary(n / 2); //n을 2로 나눈 몫을 먼저 2진수로 변환하여 인쇄한 후
        System.out.print(n % 2); //n을 2로 나눈 나머지를 인쇄한다.
    }

    //배열의 합 구하기 data[0] 에서 data[n-1]까지의 합을 구하여 반환한다.
    public static int sum(int n, int[] data) {
        if (n <= 0)
            return 0;
        else
            return sum(n - 1, data) + data[n - 1];
    }

    /*
                Recursion vs Iteration

    * 모든 순환함수는 반복문(iteration)if 나 while 문으로 변경 가능
    * 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현 가능
    * 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
    * 하지만 함수 호출에 따른 오버헤드가 있음(매개 변수 전달, 액티베이션 프레임 생성 등)
     */

}
