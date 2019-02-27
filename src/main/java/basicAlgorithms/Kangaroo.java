package basicAlgorithms;
/*
출처 : https://www.hackerrank.com/challenges/kangaroo/problem

import java.io.*;
import java.util.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    public  static String kangarooo(int x1, int v1, int x2, int v2) {
        String result = null;
        float a = (float)(x1-x2)/(float)(v2-v1);

        if(a<0 || a !=Math.floor(a)){
            result = "NO";
        }else{
            result = "YES";
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangarooo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

 */