package basicAlgorithms.recursives;

//암시적 (implicit) 매개변수를 명시적(explicit) 매개변수로 바꿔라.
//Binary Search 이진 탐색
public class Code06 {
    public static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(items, target, begin, middle - 1);
            else
                return binarySearch(items, target, middle + 1, end);
        }
    }
}
