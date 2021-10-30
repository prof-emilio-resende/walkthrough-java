package fit.basic;

public class Types {
  public static void doTry() {
    System.out.println("types...");
    int integer = 10;
    float floatingNumber = 10.5f;
    double doublePrecisionNumber = 100.0;
    char character = 'a';
    boolean val = true;

    System.out.printf("%d %f.2 %f.2 %s %s%n", integer, floatingNumber, doublePrecisionNumber, character, val);

    // boxing
    Integer integerObj = integer;
    int integerPrim = integerObj;

    System.out.println(integerObj + integerPrim);

  }
}
