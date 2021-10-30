package fit.basic;

public class Variables {
  public static void doTry() {
    System.out.println("variables...");

    String nome = "Um bom nome";
    String _nome = "Funciona, mas fora do padrão";
    String $nome = "Funciona, mas nao recomendado";

    String name = "Emilio Murta Resende";
    int age = 32;
    double height = 1.77;
    double weight = 88.0;

    Integer ageOrNull = null;
    
    System.out.printf("%s %d %.2f %.2f %d%n", name, age, height, weight, ageOrNull);
  }
}
