package thisisjava.stream;

import java.util.Arrays;
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

  public static void main(String[] args) {
    //소스 컬렉션
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    //순차 스트림 처리 시간 구하기
    long timeSequencial = testSequecial(list);
    //병렬 스트림 처리 시간 구하기
    long timeParallel = testParallel(list);

    if(timeSequencial < timeParallel){
      System.out.println("성능 테스트 결과 : 순차 처리가 더 빠름 ");
    }else{
      System.out.println("성능 테스트 겨로가 : 병렬 처리가 더 빠름 ");
    }
  }
}