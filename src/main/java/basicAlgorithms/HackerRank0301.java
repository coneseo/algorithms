package basicAlgorithms;

import java.util.Arrays;

public class HackerRank0301 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,-1,-1};
        //plusMinus(arr);

        int n = 6;
        //staircase(n);

        long[] ar = {256741038, 623958417 ,467905213, 714532089,938071625};
        miniMaxSum1(ar);

    }
    static void plusMinus(int[] arr) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                a++;
            }else if(arr[i] < 0){
                b++;
            }else{
                c++;
            }
        }
        double f = a/(double)d;
        double z = b/(double)d;
        double y = b/(double)d;
        System.out.println(String.format("%.6f", f));
        System.out.println(String.format("%.6f", z));
        System.out.println(String.format("%.6f", y));
    }

    static void staircase(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    static void miniMaxSum1(long[] arr) {
        Arrays.sort(arr);
        System.out.print((arr[0]+arr[1]+arr[2]+arr[3]));
        System.out.print(" "+(arr[4] + arr[3] +arr[2]+arr[1]));


    }

    static void miniMaxSum(int[] arr) {
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int max = 0;
        int min = sum;

        for(int i=0; i<arr.length; i++){
            int a = sum - arr[i];

            if(min > a)
                min = a;

            if(max < a)
                max = a;
        }
        System.out.println(min);
        System.out.println(max);


    }
}
