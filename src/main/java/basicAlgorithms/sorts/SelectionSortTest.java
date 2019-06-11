package basicAlgorithms.sorts;

public class SelectionSortTest {
    private static void selectionSort(int[] arr) {// 함수를 선언하고 배열을 인자로 받는다.
        selectionSort(arr, 0); //재귀함수를 호출하는데, 정렬이 안된 부분의 시작위치를 같이 넘긴다.
        //처음에는 정렬이 안된 상태니깐 첫번째 방이 시작점이 된다. 그래서 index 0을 넣는다.
    }

    private static void selectionSort(int[] arr, int start) { //재귀함수가 실행되면 배열과 시작점을 인자로 받고
        if (start < arr.length - 1) {//시작점이 배열의 마지막 방보다 작은 동안 재귀함수를 호출한다.
            int min_index = start; //가장 작은 방의 인덱스를 저장할 변수를 선언하고 초기값으로 start(시작 인덱스)를 넣는다.
            for (int i = start; i < arr.length; i++) {//시작점 부터 배열의 마지막 방까지 돌면서
                if (arr[i] < arr[min_index]) min_index = i; //해당 배열방의 값이 작은값이라고 생각했던 값보다 더 작으면
                //작은 방의 인덱스를 해당 배열 방의 인덱스로 업데이트 해준다.
            }
            swap(arr, start, min_index); //가장 작은 방의 인덱스를 swap함수로 호출해서 맨 앞의 애랑 맞바꾼다.
            //그러면 맨 앞의 하나는 정렬이 된거니깐 시작점부터 하나 더가서 시작점을 찾으면 되니깐 start + 1헤서 다시 재귀함수를 호출한다.
            selectionSort(arr, start + 1);
        }
    }

    //index값을 받아서 값을 스왑해주는 메소드
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    // 배열을 출력해주는 메소드
    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 7, 2, 4};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);

        //결과
        //3,6,1,8,7,2,4,
        //1,2,3,4,6,7,8,
    }
}
