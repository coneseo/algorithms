package basicAlgorithms.programmers.summercoding;

import java.util.Arrays;
import java.util.Scanner;

public class Jumper {
    public static void main(String[] args) {
       // System.out.println(Solution(5000));
        System.out.println(solution2(5000));
    }
    public static int Solution(int n){

        String arr = Integer.toBinaryString(n);
        char[] temp = null;
        temp = arr.toCharArray();
        int count =0;
        for(int i=0; i< temp.length; i++){
            if(temp[i] == '1'){
                count++;
            }
        }

        return count;
    }

    public static int solution2(int n){
        int sub = 1;
        int ans = 0;
        while(n != 0){
            if(n % 2 == 1){
                //n -= sub;
                ans += 1;
            }
            n /= 2;
        }
        return ans;


    }
}
