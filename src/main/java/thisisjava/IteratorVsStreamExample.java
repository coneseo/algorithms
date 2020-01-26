package thisisjava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("jeong","cheong","hyeon","kim","lim");

    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
      String name = iterator.next();
      System.out.println(name);
    }
    System.out.println();
    //Stream 이용
    Stream<String> stream = list.stream();
    stream.forEach(name -> System.out.println(name));

    long count = 0;
    //기존의 코딩방식
    for(String name : list){
      if(name.contains("o")){
        count++;
      }
    }
    System.out.println("Count:"+count);

    //stream 적용
    count = 0;
    count = list.stream().filter(x -> x.contains("o")).count();
    System.out.println("Count:"+count);
  }

}
