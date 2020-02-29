package thisisjava.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import thisisjava.stream.ToListExample.Student.Sex;

public class ToListExample {
  public static class Student{
    public enum Sex{MALE, FEMALE}
    public enum City {Seoul, Pusan}

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student(String name, int score, Sex sex){
      this.name = name;
      this.score = score;
      this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city){
      this.name = name;
      this.score = score;
      this.sex = sex;
      this.city = city;
    }

    public String getName(){return name;}
    public int getScore(){return score;}
    public Sex getSex(){return sex;}
    public City getCity(){return city;}
  }
  public static void main(String[] args) {

    List<Student> totalList = Arrays.asList(
        new Student("hong", 11, Sex.MALE),
        new Student("kim",12, Sex.FEMALE),
        new Student("sin",13, Sex.MALE),
        new Student("park", 14, Sex.FEMALE)
    );
    //남학생만 묶어 List 생성
    List<Student> maleList = totalList.stream()
        .filter(s->s.getSex()==Student.Sex.MALE).collect(Collectors.toList());
    maleList.stream().forEach(s -> System.out.println(s.getName()));

    System.out.println();

    //여학생들만 묶어 HashSet 생성
    Set<Student> femaleList = totalList.stream().filter(s -> s.getSex() == Sex.FEMALE)
        .collect(Collectors.toCollection(HashSet::new));
    femaleList.stream().forEach(s -> System.out.println(s.getName()));
  }
}
