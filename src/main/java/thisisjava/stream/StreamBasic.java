package thisisjava.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasic {

  public static void main(String[] args) {
    //자바 7이전
    List<String> list = Arrays.asList("hong","kim","seo");
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
      String name = iterator.next();
      System.out.println(name);
    }

    //자바 8
    Stream<String> stream = list.stream();
    stream.forEach(name -> System.out.println(name));

    /*
    컬렉션(java.util.Collection)의 stream() 메소드로 스트림 객체를 얻고 나서 stream.forEach(name
    ->System.out.println(name)); 메소드를 통해 컬렉션의 요소를 하나씩 콘솔에 출력한다.
     */
  }

}
