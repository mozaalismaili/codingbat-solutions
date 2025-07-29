public class wordLen{
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> result = new HashMap<>();
    for (String s : strings) {
        result.put(s, s.length());
    }
    return result;
}

}