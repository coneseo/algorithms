package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
  public static class Student{
    private String name;
    private int score;
    public Student(String name, int score){
      this.name = name;
      this.score = score;
    }
    public String getName(){return name;}
    public int getScore(){return score;}
  }
  public static void main(String[] args) {
    List<Student> studentList = Arrays.asList(
        new Student("hong", 11),
        new Student("kim", 10),
        new Student("lee", 20)
    );
    //컬렉션으로 부터 스트림 얻기
    Stream<Student> stream = studentList.stream();
    stream.forEach(s -> System.out.println(s.getName()));
  }
}
