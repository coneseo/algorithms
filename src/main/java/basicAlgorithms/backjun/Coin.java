package basicAlgorithms.backjun;

public class Coin{
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int i, N = sc.nextInt(), K = sc.nextInt();
        int arr[] = new int[N];
        for(i=0; i<N; i++) arr[i] = sc.nextInt();*/
        int N = 10;
        int K = 4790;
        int[] arr = {1,5,10,50,100,500,1000,5000,10000,50000};
        System.out.println(solution(N,K,arr));
    }

    public static int solution(int N, int K, int[] arr){
        int answer = 0;

        for(int i=arr.length - 1; i>=0; i--){
            if(K % arr[i] == 0){
                return answer + K / arr[i];
            } else if(K >= arr[i]){
                answer += K / arr[i];
                K = K % arr[i];
            }
        }
        return answer;
    }
}