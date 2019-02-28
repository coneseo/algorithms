package basicAlgorithms.recursives;

public class Code05 {
    //매개변수의 명시화 : 순차 탐색
    // 이 함수의 미션은 data[begin]에서 data[end] 사이에서  target을 검색한다.
    // 즉 검색구간의 시작점을 명시적(explicit)으로 지정한다.

    public static int search(int[] data, int begin, int end, int target){
        if(begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        else
            return search(data,begin+1,end, target);

    }

    public static int search2(int[] data, int begin, int end, int target){
        if(begin > end)
            return -1;
        else if (target == data[end])
            return end;
        else
            return search(data,begin,end-1, target);

    }

    public static int search3(int[] data, int begin, int end, int target){
        if(begin > end)
            return -1;
        else{
            int middle = (begin + end)/2;
            if (data[middle] == target)
                return middle;
            int index = search(data, begin,middle-1, target);
            if (index != -1)//찾았으면
                return index;
            else// 못 찾았으면
                return search(data, middle+1, end, target);
        }

    }

    //매개 변수의 명시화 : 최대값 찾기
    int findMax(int [] data, int begin, int end){
        if(begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin +1, end));
    }

    int findMax2(int [] data, int begin, int end){
        if(begin == end)
            return data[begin];
        else{
            int middle = (begin + end)/2;
            int max1 = findMax2(data, begin, middle);
            int max2 = findMax2(data, middle+1, end);
            return Math.max(max1, max2);
        }

    }
}
