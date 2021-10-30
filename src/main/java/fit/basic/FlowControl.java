package fit.basic;

import javax.print.event.PrintEvent;

public class FlowControl {
  public static final int ONE = 1;
  public static final int TWO = 2;
  public static final int THREE = 3;

  public static void doTry(int number) {
    System.out.println("FlowControl...");

    boolean isEven = ((number % 2) == 0);
    if (isEven) {
      System.out.println("is even!");
      switch (number) {
        case 10: 
          System.out.println("The number is ten");
          break;
        case 2:
          System.out.println("The number is two...");
          break;
        default:
          System.out.println("The number is unkown");
      }
    }

    String name = "UmTextoQualquer";
    for (int i = 0; i < name.length(); i++) {
      System.out.printf("caractere %d : %s%n", i, name.charAt(i));
    }

    int any = switch(number) {
      case ONE, TWO -> 0;
      case THREE -> 1;
      default -> 2;
    };
    System.out.println(any);
  }
}
