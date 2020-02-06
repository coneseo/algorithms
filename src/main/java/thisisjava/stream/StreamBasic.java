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

    내부 반복자를 사용하므로 병렬 처리가 쉽다.
    - 외부 반복자란 개발자가 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드 패턴을 말한다. index를 사용하는 for문 그리고
    iterator를 사용하는 while문은 모두 외부 반복자를 이용하는 것이다.
    반면에 내부 반복자는 컨렉션 내부에서 요소들을 반복시키고, 개발자는 요소당 처리해야 할 코드만 제공하는 패턴을 말한다.
    iterator는 컬렉션의 요소를 가져오는 것부터 처리하는 것까지 모두 개발자가 작성해야 하지만, 스트림은 람다식으로 요소 처리 내용만
    전달할 뿐, 반복은 컬렉션 내부에서 일어난다.
     */
  }

}
