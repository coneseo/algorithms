package basicAlgorithms.backjun;

import java.util.Scanner;

public class ChickenHalfShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = x*a+y*b;
        for (int i=1; i<=100000; i++) {
            //2*i(for문에서의 i변수)*c(반값치킨의 가격) + 양념치킨 수량-i랑 0이랑 비교해서 큰거 * 양치가격
            // + 후라이드 치킨 수량-i랑 0이랑 비교해서 큰거 *  후라이드 가격
            int price = 2*i*c + Math.max(0, x-i)*a + Math.max(0, y-i)*b;
            //
            if (ans > price) ans = price;
        }
        System.out.println(ans);
    }

}
