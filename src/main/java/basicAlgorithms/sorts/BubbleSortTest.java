package basicAlgorithms.sorts;

public class BubbleSortTest {
    private static void bubbleSort(int[] arr){//메소드를 정의하고 배열을 받아서 재귀함수를 호출
        bubbleSort(arr, arr.length - 1);//배열의 주소와 배열에서 정렬이 안된부분의 마지막 인덱스를 같이 넘긴다.

    }
    //
    private static void bubbleSort(int[] arr, int last) {
        //마지막 인덱스가 0보다 클때까지 재귀호출을 한다.
        if(last > 0){
            //1번 인덱스 부터 정렬해야하는 부분의 마지막 인데스까지 돌린다.
            for(int i = 1; i <= last; i++){
                //돌면서 비교한다. 앞의 친구가 나보다 큰가?
                if( arr[i - 1] > arr[i]){
                    //크다면 자리를 바꾼다.
                    swap(arr, i - 1, i);
                }
            }
            //마지막 인덱스까지 반복적으로 swap을 하고 나오면 맨 마지막 1개는 정렬이 되었으니깐
            //다시 호출할 때 마지막 인덱스는 빼고 정렬을 해야겠죠?
            bubbleSort(arr, last - 1);
        }
    }

    private static void swap(int[] arr, int source, int target) {
        int tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }

    private static void printAway(int[] arr){
        for(int data : arr){
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9,4,7,2,5,2};
        printAway(arr);
        bubbleSort(arr);
        printAway(arr);
    }
}
