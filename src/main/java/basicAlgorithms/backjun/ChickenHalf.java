package basicAlgorithms.backjun;

import java.io.*;
import java.util.*;

public class ChickenHalf{
    public static int chicken(int A, int B, int C, int X, int Y){
        int result = 0;
        if(X == 0){
            result = B*Y;
        }else if(Y == 0){
            result = A*X;
        }
        else if((A+B)/2 > C){
            if(Math.abs(A-B) <= C){
                if(X > Y) {
                    result = (2 * Y * C) + 2 * (X-Y) * C;
                }else{
                    result = (2 * X * C ) + 2 * (Y-X) * C;
                }
            }
            else if(X > Y) {
                result = (2 * Y * C) + A * (X - Y);
            }else
                result = (2 *X * C) + B*(Y-X);
        }else{
            result = A*X + B*Y ;
        }
        return result;

    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int x = arr[3];
        int y = arr[4];

        System.out.println(chicken(a,b,c,x,y));
    }
}