package topcoder;

public class Cryptography {
    public long encrypt(int[] numbers){
        long ans = 0;
        for(int i = 0; i<numbers.length; i++){
            long temp = 1;
            for(int j=0; j<numbers.length; j++){
                if(i == j){
                    temp *= (numbers[i] + 1);
                }else{
                    temp *= numbers[j];
                }
            }
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}
