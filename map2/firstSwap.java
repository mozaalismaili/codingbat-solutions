public class firstSwap{
public String[] firstSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<>();
    Map<Character, Boolean> swapped = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        char c = strings[i].charAt(0);
        if (swapped.getOrDefault(c, false)) {
            //  skip
            continue;
        }
        if (map.containsKey(c)) {
            int prevIndex = map.get(c);
            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;
            swapped.put(c, true);
            map.remove(c);
        } else {
            map.put(c, i);
        }
    }
    return strings;
}

}