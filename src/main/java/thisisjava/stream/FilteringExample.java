package thisisjava.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Arrays;
import java.util.List;

public class FilteringExample {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("hong", "sin", "java", "sin", "min");
    names.stream()
        .distinct() //중복 제거
        .forEach(n -> System.out.println(n));
    System.out.println();

    //필터링
    names.stream().filter(n -> n.startsWith("s")).forEach(n -> System.out.println(n));
    System.out.println();

    //중복 제거 후 필터링
    names.stream().distinct().filter(n -> n.startsWith("s")).forEach(n -> System.out.println(n));
  }
}
