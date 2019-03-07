package basicAlgorithms;

public class Example01 {
    static int [] result = new int [3];
    static int [] arr = {1,2,3};

    public static void dfs(int n){
        if(n == arr.length){
            for(int i= 0;i<result.length;i++){
                System.out.print(result[i] + " ");
            }System.out.println();
        }else{
            for(int i =0;i<arr.length;i++){
                result[n] = arr[i];
                dfs(n + 1);
            }
        }
    }

    public static void main(String[] args) {
        dfs(2);
    }
}
