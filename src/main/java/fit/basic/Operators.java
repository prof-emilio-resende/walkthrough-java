package fit.basic;

public class Operators {
  public static void doTry() {
    System.out.println("Operators...");
    int result = 1 + 2 - 3 * 4 / 5 % 6;
    System.out.println(result);

    int newResult = 0;
    newResult += result;

    // logical
    boolean less = 2 < 1;
    boolean yes = true;
    boolean no = false;

    boolean tAndT = yes && yes;
    boolean tAndF = yes && no;

    boolean tOrT = yes || yes;
    boolean fOrT = no || yes;

    System.out.println(less);
    System.out.println(tAndT);
    System.out.println(tAndF);
    System.out.println(tOrT);
    System.out.println(fOrT);
  }
  
}
