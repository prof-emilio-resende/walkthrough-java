package fit.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Dynamics {
  public static void doTry() {
    System.out.println("VARiables!!!");
    
    var name = "Emilio Murta";
    var number = 10;
    var flt = 10.0f;
    var dbl = 10.0;
    var list = new ArrayList<String>() {{ add("new String!"); }};
    var fancyList = List.of("new", "list");

    System.out.println(number + flt + dbl);

    System.out.println(name);
    System.out.println(list);
    System.out.println(fancyList);

    var obj = new Object() {
      public String name = "emilio";
      public String getName() {
        return name;
      }
    };

    System.out.println(obj.getName());
  }
}
