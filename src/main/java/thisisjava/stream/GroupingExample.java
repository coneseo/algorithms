package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
    Map<Sex, List<Student>> mapBySex = totalList.stream().collect(Collectors.groupingBy(Student :: getSex));

    System.out.println("[남학생]");
    mapBySex.get(Sex.MALE).stream().forEach(s -> System.out.println(s.getName() + " "));

    System.out.println("[여학생]");
    mapBySex.get(Sex.FEMALE).stream().forEach(s -> System.out.println(s.getName() + " "));

    System.out.println();

    Map<Student.City, List<String>> mapByCity = totalList.stream()
        .collect(
            Collectors.groupingBy(
                Student::getCity,
                Collectors.mapping(Student::getName, Collectors.toList())
            )
        );

    System.out.println("\n[서울]");
    mapByCity.get(City.Seoul).stream().forEach(s-> System.out.println(s + " "));

    System.out.println("\n[부산]");
    mapByCity.get(City.Pusan).stream().forEach(s -> System.out.println(s + " "));
  }
}
