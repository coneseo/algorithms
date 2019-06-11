import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2차원 배열을 입력 받고 대각선의 차이를 구하는 알고리즘 문제이다.
public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {

        int arry1 = 0;
        int arry2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arry1 += arr[i][i];
            arry2 += arr[i][arr.length - i - 1];
        }

        int result = arry1 - arry2;
        return Math.abs(result);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][i] = in.nextInt();
            }
        }

        int result = diagonalDifference(matrix);

        System.out.println(result);
    }
}
