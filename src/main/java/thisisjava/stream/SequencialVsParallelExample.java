package thisisjava.stream;

import java.util.List;

public class SequencialVsParallelExample {
  //요소처리
  public static void work(int value) {
    try{Thread.sleep(100);}catch(InterruptedException e){}
  }

  //순차처리
  public static long testSequecial(List<Integer> list){
    long start = System.nanoTime();
    list.stream().forEach((a) -> work(a));
    long end = System.nanoTime();
    long runTime = end - start;
    return runTime;
  }

  //병렬처리
  public static long testParallel(List<Integer> list){
    long start = System.nanoTime();
    list.stream().parallel().forEach((a)-> work(a));
    long end = System.nanoTime();
    long runTime = end - start;
    return runTime;
  }
}
