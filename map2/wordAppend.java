public class wordAppend{
public String wordAppend(String[] strings) {
  Map<String, Integer> count = new HashMap<>();
    StringBuilder result = new StringBuilder();
    for (String s : strings) {
        count.put(s, count.getOrDefault(s, 0) + 1);
        if (count.get(s) % 2 == 0) {
            result.append(s);
        }
    }
    return result.toString();
}
}