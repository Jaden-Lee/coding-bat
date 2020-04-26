import java.util.Map;

public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
          map.put("ice cream","cherry");
        }
        if (map.containsKey("pancake")) {
          map.put("pancake","syrup");
        }
        map.put("bread","butter");
        return map;
    }      
}