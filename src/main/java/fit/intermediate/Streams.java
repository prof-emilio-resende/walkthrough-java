package fit.intermediate;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
  public static void doTry() {
    System.out.println("Streams...");
    List.of("oNe", "tWo", "Three")
      .stream()
      .map(x -> {
        System.out.println("mapping...");
        return x.toUpperCase();
      })
      .forEach(System.out::println);

    List.of("oNe", "tWo", "Three")
      .stream()
      .map(x -> {
        System.out.println("mapping 2.0...");
        return x.toUpperCase();
      })
      .collect(Collectors.toList())
      .forEach(System.out::println);
    
  }
}
