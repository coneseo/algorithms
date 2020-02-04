package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsExample {
  public static class Student{
    private String name;
    private int score;

    public Student (String name, int score){
      this.name = name;
      this.score = score;
    }

    public String getName(){
      return name;
    }
    public int getScore(){
      return score;
    }
  }
  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
        new Student("jack", 11),
        new Student("kim", 12)
    );

    //스트림 얻기
    Stream<Student> stream = list.stream();
    //List 컬렉션에서 Student를 가져와 람다식의 매개값으로 제공
    stream.forEach(s -> {
      String name = s.getName();
      int score = s.getScore();
      System.out.println(name + "-" + score);
    });
  }

  //내부 반복자를 사용하므로 병렬 처리가 쉽다.
  //외부 반복자란 개발자가 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드 패턴을 말한다.
  //index를 이용하는 for문 그리고 Iterator를 이용하는 while문은 모두 외부 반복자를 이용하는 것이다.
  //반면에 내부 반복자는 컬렉션 내부에서 요소들을 반복시키고, 개발자는 요소당 처리해야 할 코드만 제공하는
  //코드 패턴을 말한다.

}
