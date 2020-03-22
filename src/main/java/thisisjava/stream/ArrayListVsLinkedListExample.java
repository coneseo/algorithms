package thisisjava.stream;

import java.util.List;

public class ArrayListVsLinkedListExample {
  //요소처리
  public static void work(int value){}

  //병렬처리
  public static long testParallel(List<Integer> list){
    long start = System.nanoTime();
    list.stream().parallel().forEach((a) -> work(a));
    long end = System.nanoTime();
    long runTime = end - start;
    return runTime;
  }

}
