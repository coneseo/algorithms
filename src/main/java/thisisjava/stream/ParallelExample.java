package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("hong","kin","lee");
    //순차처리
    Stream<String> stream = list.stream();
    stream.forEach(ParallelExample :: print);
    System.out.println();
    //병렬처리
    Stream<String> paralleStream = list.parallelStream();
    paralleStream.forEach(ParallelExample :: print);

  }
  public static void print(String str){
    System.out.println(str + " : "+Thread.currentThread().getName());
  }


}
