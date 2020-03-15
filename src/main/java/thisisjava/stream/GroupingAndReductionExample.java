package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import thisisjava.stream.Student.Sex;

public class GroupingAndReductionExample {

  public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Sex.MALE),
        new Student("김수애", 12, Sex.FEMALE),
        new Student("신용권", 10, Sex.MALE),
        new Student("박수미", 12, Sex.FEMALE)
    );

    //성별로 평균 점수를 저장하는 Map 얻기
    Map<Sex, Double> mapBySex = totalList.stream()
        .collect(
            Collectors.groupingBy(
                Student :: getSex,
                Collectors.averagingDouble(Student :: getScore)
            )
        );

    System.out.println("남학생 평균 점수 : "+mapBySex.get(Sex.MALE));
    System.out.println("여학생 평균 점수 : "+mapBySex.get(Sex.FEMALE));

    //성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
    Map<Student.Sex, String> mapByName = totalList.stream()
        .collect(
            Collectors.groupingBy(
                Student :: getSex,
                Collectors.mapping(
                    Student::getName,
                    Collectors.joining(",")
                )
            )
        );

    System.out.println("남학생 전체 이름 : "+mapByName.get(Sex.MALE));
    System.out.println("여학생 전체 이름 : "+mapByName.get(Sex.FEMALE));
  }
}
