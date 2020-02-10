package thisisjava.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("/Users/seocheong-won/Documents/dev/algorithms/.gitignore");
    Stream<String> stream;
    //Files.lines() 메소드 사용
    stream = Files.lines(path, Charset.defaultCharset());
    System.out.println();

    //BufferedReader의 lines() 메소드 사용
    File file= path.toFile();
    FileReader fileReader = new FileReader(file);
    BufferedReader br = new BufferedReader(fileReader);
    stream = br.lines();
    stream.forEach(System.out :: println);

  }
}
