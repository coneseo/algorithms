package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import thisisjava.stream.Student.City;
import thisisjava.stream.Student.Sex;

public class GroupingExample {

  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Sex.MALE, City.Seoul),
        new Student("김수애", 6, Sex.FEMALE, City.Pusan),
        new Student("신용권", 10, Sex.MALE, City.Pusan),
        new Student("박수미", 6, Sex.FEMALE, City.Seoul)
    );
  }
}
