package thisisjava.stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DrawExample {

  public static void main(String[] args) {
    System.out.println("드로우.!");

    final List<String> participants = Arrays.asList("a","b","c","d","f","g","k");

    new Random().ints(0,participants.size())
        .distinct()
        .limit(2)
        .mapToObj(participants::get)
        .forEach(System.out::println);

  }
}
