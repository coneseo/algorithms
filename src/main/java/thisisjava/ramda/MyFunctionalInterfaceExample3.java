package thisisjava.ramda;

import static java.lang.Integer.sum;

public class MyFunctionalInterfaceExample3 {
  //리턴값이 있는 추상 메소드를 가진 함수적 인터페이스
  @FunctionalInterface
  public interface MyFunctionalInterface{
    public int method(int x, int y);
  }

  public static void main(String[] args) {
    MyFunctionalInterface fi;

    fi = (x,y) ->{
      int result = x + y;
      return result;
    };

    System.out.println(fi.method(2,5));

    fi = (x,y) ->{return x + y;};

    System.out.println(fi.method(2,5));

    fi = (x,y) -> x+y;
    System.out.println(fi.method(2,5));

    fi = (x,y) -> sum(x,y);
    System.out.println(fi.method(2,5));

  }

}
