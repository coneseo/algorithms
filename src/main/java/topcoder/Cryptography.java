package topcoder;

import java.util.Arrays;

public class Cryptography {
    public static void main(String[] args){
        Cryptography cryptography = new Cryptography();
        int[] intArr = {1,3,2,1,1,3};
        long result = cryptography.encrypt(intArr);
        System.out.println(result);
    }
    public long encrypt(int[] numbers) {
        long ans = 0;
        for(int i=0; i<numbers.length; i++){
            int temp = 1;
            for(int j=0; j<numbers.length; j++){
                if(i == j){
                    temp *= (numbers[j]+1);
                }else{
                    temp *= numbers[j];
                }
            }
            ans = Math.max(ans, temp);
        }

        return ans;
    }
    //간단한 수학적 지식이라는데
    //이런 경우에는 가장 작은 수를 증가시키면 최대 곱이 나온다고 한다.
    //간단하게 증명하면 +1 하면 곱의 증가율이 (n+1)/n이다.
    //그래서 정렬을 한 다음에 가장 작은 수에 +1을 하고
    //for문을 한번만 돌면 가장 큰 곱이 나온다.
    public long encryptWithSort(int[] numbers){
        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for(int i=0; i< numbers.length; i++){
            ret *= numbers[i];
        }
        return ret;
    }
}
