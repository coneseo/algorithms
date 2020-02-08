package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DrawExample {

  public static void main(String[] args) {
    System.out.println("드로우.!");

    final List<String> participants = Arrays.asList("a","b","c","d","f","g","k");

//    new Random().ints(0,participants.size())
//        .distinct()
//        .limit(2)
//        .mapToObj(participants::get)
//        .forEach(System.out::println);



    final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
    ,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45);

    new Random().ints(0, numbers.size())
        .distinct()
        .limit(6)
        .mapToObj(numbers::get)
        .forEach(System.out::println);

  }
}
