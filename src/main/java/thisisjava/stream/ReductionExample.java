package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import thisisjava.stream.FromCollectionExample.Student;

public class ReductionExample {

  public static void main(String[] args) {
    List<Student> studentList = Arrays.asList(
        new Student("hong", 11),
        new Student("seo",12),
        new Student("kim", 12)
    );

    int sum1 = studentList.stream().mapToInt((Student::getScore)).sum();

    int sum2 = studentList.stream().map(Student::getScore).reduce((a,b)->a+b).get();

    int sum3 = studentList.stream().map(Student::getScore).reduce(0,(a,b) -> a+b);

    System.out.println("sum1 : "+sum1);
    System.out.println("sum2 : "+sum2);
    System.out.println("sum3 : "+sum3);
  }

}
