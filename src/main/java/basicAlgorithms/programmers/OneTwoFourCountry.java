package basicAlgorithms.programmers;

public class OneTwoFourCountry {

    public static String solution(int n) {
        String answer = "";
        StringBuilder sb = null;
        int[] nums = {1, 2, 4};
        int remain = 0;
        int mock = 1;
        while (mock < 0) {
            mock = n / 3;
            remain = n % 3;
            if (mock > 3) {
                mock = mock / 3;

            } else {
                sb.append(nums[mock - 1]);
                sb.append(nums[remain - 1]);
            }


        }


        return answer;
    }
}
