package thisisjava.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import thisisjava.stream.FromCollectionExample.Student;

public class SortingExample {

  public static void main(String[] args) {
    //숫자 요소일 경우
    IntStream intStream = Arrays.stream(new int[]{5,3,2,1,4});
    intStream.sorted().forEach(n -> System.out.println(n + ","));
    System.out.println();

    //객체 요소일 경우
    List<Student> studentList = Arrays.asList(
        new Student("hong", 11),
        new Student("kim", 21),
        new Student("lee", 31)
    );

    studentList.stream().sorted().forEach(s -> System.out.println(s.getScore()+","));
    System.out.println();

   // studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s.getScore()+","));

  }
}
