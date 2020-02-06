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

    스트림의 특징
    Stream은 Iterator와 비슷한 역할을 하는 반복자이지만, 람다식으로 요소 처리 코드를 제공하는 점과 내부 반복자를
    사용하므로 병렬 처리가 쉽다는 점 그리고 중간 처리와 최종 처리 작업을 수행하는 점에서 많은 차이를 가지고 있다.

    람다식으로 요소 처리 코드를 제공한다.
    - Stream이 제공하는 대부분의 요소 처리 메소드는 함수적 인터페이스 매개 타입을 가지기 때문에 람다식 또는 메소드 참조를
    이용해서 요소 처리 내용을 매개값으로 전달할 수 있다.
     */
  }

}
