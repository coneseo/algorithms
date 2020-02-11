package thisisjava.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("hong", Member.MALE, 20),
        new Member("seo", Member.MALE, 30),
        new Member("park", Member.FEMALE, 29)
    );

    double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE)
        .mapToInt(Member::getAge)
        .average()
        .getAsDouble();

    System.out.println("평균 나이 : "+ageAvg);
  }

  public static class Member{
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    public Member(String name, int sex, int age){
      this.name = name;
      this.sex = sex;
      this.age = age;
    }

    public int getSex(){return sex;}
    public int getAge(){return age;}
  }
}
