package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import thisisjava.stream.Student.Sex;

public class MaleStudentExample2 {

  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Sex.MALE),
        new Student("김수애", 6, Sex.FEMALE),
        new Student("신용권", 10, Sex.MALE),
        new Student("박수미",6, Sex.FEMALE)
    );
    //남학생을 MaleStudent에 누적
    MaleStudent maleStudent = totalList.parallelStream()
        .filter(s -> s.getSex() == Sex.MALE)
        .collect(MaleStudent :: new, MaleStudent::accumulate, MaleStudent::combine);

    maleStudent.getList().stream()
        .forEach(s -> System.out.println(s.getName()));
  }
}
