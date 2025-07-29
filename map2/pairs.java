public class pairs{
public Map<String, String> pairs(String[] strings) {
  Map<String, String> result = new HashMap<>();
    for (String s : strings) {
        String key = s.substring(0, 1);
        String value = s.substring(s.length() - 1);
        result.put(key, value);
    }
    return result;
}

}