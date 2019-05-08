package basicAlgorithms.programmers;
import java.util.*;

public class LevelOneDivideArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int a = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[a++] = arr[i];
                count++;
            }
        }

        if(count==0){
            answer[a] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
