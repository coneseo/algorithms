package thisisjava.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("seo","kim","jeong", "seo");

    names.stream().distinct().forEach(n -> System.out.println(n));
    System.out.println();

    names.stream().filter(n -> n.startsWith("s"))
        .forEach(n -> System.out.println(n));
    System.out.println();

    names.stream().distinct().filter(n -> n.startsWith("s")).forEach(n -> System.out.println(n));
  }

}
