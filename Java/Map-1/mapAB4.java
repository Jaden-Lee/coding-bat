import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
          if (map.get("a").length() != map.get("b").length()) {
            if (map.getOrDefault("a","").length() > map.getOrDefault("b","").length()) {
              map.put("c",map.get("a"));
            }
            else if (map.getOrDefault("a","").length() < map.getOrDefault("b","").length()) {
              map.put("c",map.get("b"));
            }
          }
          else {
              map.put("a","");
              map.put("b","");
          }
        }
        return map;
    }      
}