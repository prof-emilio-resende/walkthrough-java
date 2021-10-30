package fit.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {
  public static void doTry() {
    System.out.println("Collections...");

    String[] names = new String[] { "Emilio", "Murta", "Resende" };
    System.out.println(Arrays.toString(names));
    
    Map<String, String> record = new LinkedHashMap<String, String>() {{
      put("key1", "val1");
      put("key2", "val2");
      put("key3", "val3");
    }};
    System.out.println(record);

    Map<String, String> recordAnonymous = new LinkedHashMap<>();
    {
      recordAnonymous.put("anonym-key1", "v1");
      recordAnonymous.put("anonym-key2", "v2");
    }
    System.out.println(recordAnonymous);

    List<Map<String, String>> complexRecord = new ArrayList<>() {{
      add(new LinkedHashMap<>() {{
        put("ugly-key", "ugly-value");
      }});
    }};
    System.out.println(complexRecord);

    List<Map<String, String>> complexRecordMadeEasy = List.of(
      Map.of("easy-key1", "easy-value1","easy-key2", "easy-value2"),
      Map.of("easy-key3", "easy-value3")
    );
    System.out.println(complexRecordMadeEasy);

    for (Map<String, String> rec : complexRecordMadeEasy) {
      for (String k : rec.keySet()) {
        System.out.println(k);
      }

      for (String v : rec.values()) {
        System.out.println(v);
      }

      for (Map.Entry<String, String> entry : rec.entrySet()) {
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
      }
    }
  }
}
