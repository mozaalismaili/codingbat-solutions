public class firstChar{
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
    for (String s : strings) {
        String key = s.substring(0, 1);
        if (!map.containsKey(key)) {
            map.put(key, s);
        } else {
            map.put(key, map.get(key) + s);
        }
    }
    return map;
}

}