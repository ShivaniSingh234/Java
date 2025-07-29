package MAP;

import java.util.Map;
import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        // adding values
        m.put("Value1", 1);
        m.put("Value2", 2);
        m.put("Value3", 3);
        m.put("Value4", 4);
        m.put("Value5", 5);


        System.out.println("Mapped Elements: " + m);

        //inserting new value
        m.put("Value3", 33);
        System.out.println("Updated map: " + m);

        //removing elements
        m.remove("Value4");
        

        //iterating through map
        for (Map.Entry<String, Integer> mapElement : m.entrySet()) {
            String key = mapElement.getKey();

            Integer value = mapElement.getValue();
            System.out.println(key + " : " + value);
            
        }

    }
}
