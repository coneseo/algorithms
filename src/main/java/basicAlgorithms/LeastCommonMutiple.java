package basicAlgorithms;

import java.util.Arrays;

public class LeastCommonMutiple {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        int result = solution(arr);
        System.out.println(result);
    }
//    public static int solution(int[] arr) {
//        int answer = 0;
//
//        Arrays.sort(arr);
//
//        int n = arr[arr.length - 1];
//        if(n == 1){
//            answer = n;
//        } else{
//            for (int i = n; i <= (n - 1) * n; i++) {
//                int cnt = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (i % arr[j] == 0) {
//                        cnt++;
//                    }
//                }
//                if (cnt == arr.length) {
//                    answer = i;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
    public static int solution(int[] arr){
        int answer = 0;

        int gcd = gcdlm(arr[0], arr[1]);

        for(int i=2; i<arr.length; i++){
            gcd = gcdlm(gcd, arr[i]);
        }

        return gcd;
    }

    public static int gcdlm(int a, int b){
        int answer = 0;

        int big, small ;
        int remain = 1;
        if(a >= b){
            big = a;
            small = b;
        }else{
            big = b;
            small = a;
        }
        while(remain>0){
            remain = big%small;
            big = small;
            small = remain;
        }
        answer = a*b/big;
        return answer;
    }
}
