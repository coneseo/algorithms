package thisisjava.ramda;

public class UsingThis {
  public interface MyFunctionalInterface{
    public void method();
  }
  public int outterField = 10;

  class Inner{
    int innerField = 20;

    void method(){
      //람다식
      MyFunctionalInterface if = () ->{
        System.out.println("outterField : "+outterField);

      }
    }
  }
}
