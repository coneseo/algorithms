package basicAlgorithms.sorts;

public class MergeSortTest {
    private static void mergeSort(int[] arr){
        //mergesort는 저장공간이 필요하다. 그래서 입력받는 배열의 크기 만큼 임시 공간을 만들어준다.
        int[] tmp = new int[arr.length];
        //정렬할 배열, 임시 저장소, 시작과 끝 index를 넘겨줘서 본격적인 재귀호출을 시작한다.
        mergeSort(arr, tmp, 0, arr.length -1 );
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        //시작 인덱스가 끝 인덱스보다 작은 동안만 호출을 할 것이다.
        if(start < end){
            int mid = (start + end) / 2;
            //배열의 앞 부분으로 start와 end 포인트를 조정해서 호출하고
            mergeSort(arr, tmp, start, mid);
            //배열의 뒷 부분을 호출한다.
            mergeSort(arr, tmp, mid +1, end );
            //재귀함수가 돌아왔을 때는 가운데를 기준으로 왼, 오른쪽이 정렬이 되어있는 상태겠죠?
            //그러면 merge 함수로 두 개로 나뉜 방을 합친다. 
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        //우선 임시 저장소에 정렬이된 배열을 필요한 크기만큼 복사해준다.
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        //배열 2개가 중간 지점을 기준으로 하나로 붙어 있으니깐
        //첫번재 배열의 첫번재 방이랑 두번째 배열의 두번째 방을
        //각각 part1, part2로 저장해준다.
        int part1 = start;
        int part2 = mid + 1;
        //그리고 양 쪽 배열방에서 작은 값을 하나씩 복사할 때 마다
        //결과 배열 방의 어디에 저장해야하는지도 알아야하니깐?
        //복사 후에 하나씩 늘려줘서 다음에 저장할 곳을 기억하고 있도록 한다?
        int index = start;
        //첫번째 배열이 끝까지 가거나 두번째 배열이 끝까지 갈때까지 반복문을 돌린다.
        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        // 뒤쪽 배열은 비었고, 앞에 배열의 데이터는 남아 있는 경우를 대비
        // 앞쪽 포인터가 배열의 끝에서 남은 만큼을 돌면서
        // 최종적으로 저장할 배열에 남은 값들을 붙여준다.
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }
        //뒤쪽 배열은 최종 배열의 뒤쪽에 이미 자리하고있기때문에 뒤쪽에 남은 데이터는 신경안써도 된다.

        private static void printAway(int[] arr){
            for(int data : arr){
                System.out.print(data + ",");
            }
            System.out.println();
        }


    public static void main(String[] args) {
        int[] arr = {3,6,2,8,4,11,7,1,9,10};
        printAway(arr);
        mergeSort(arr);
        printAway(arr);
    }
}
