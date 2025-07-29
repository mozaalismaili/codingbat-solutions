public class wordCount{
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> counts = new HashMap<>();
    for (String s : strings) {
        if (counts.containsKey(s)) {
            counts.put(s, counts.get(s) + 1);
        } else {
            counts.put(s, 1);
        }
    }
    return counts;
}

}