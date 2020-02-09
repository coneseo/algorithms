package thisisjava.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
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
        new Student("hong", 11),
        new Student("seo", 12),
        new Student("kim", 13)
    );

    double avg = list.stream().mapToInt(Student::getScore)
        //최종처리(평균 점수)
        .average().getAsDouble();
    System.out.println("avg : "+avg);
  }
}
