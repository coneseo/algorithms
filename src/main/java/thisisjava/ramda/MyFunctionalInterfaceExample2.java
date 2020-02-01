package thisisjava.ramda;

public class MyFunctionalInterfaceExample2 {
  //매개 변수가 있고 리턴값이 없는 추상 메소드를 가진 함수적 인터페이스 선언
  @FunctionalInterface
  public interface MyFunctionalInterface{
    public void method(int x);
  }

  public static void main(String[] args) {
    MyFunctionalInterface fi;

    fi = (x) -> {
      int result = x + 5;
      System.out.println(result);
    };
    fi.method(2);

    fi = (x) -> {
      System.out.println(x+5);
    };
    fi.method(2);

    fi = x-> System.out.println(x+5);
    fi.method(2);
  }


}
