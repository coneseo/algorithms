package basicAlgorithms.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
이차원 배열(6x6)을 입력 받아서 i모양의 모레시계를 가져다대서
그 모양대로 있는 인덱스들의 최대값을 리턴하는 알고리즘
 */
public class TwoDivisionArrayEasy {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = -2147483648;
        for(int i=0;i<4; i++){
            for(int j=0; j<4; j++){
                int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                        +arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                if(temp > sum){
                    sum = temp;
                }
            }
        }

        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
