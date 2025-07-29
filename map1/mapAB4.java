public class mapAB4{
public Map<String, String> mapAB4(Map<String, String> map) {
  String a = map.get("a");
    String b = map.get("b");

    if (a != null && b != null) {
        if (a.length() > b.length()) map.put("c", a);
        else if (b.length() > a.length()) map.put("c", b);
        else {
            map.put("a", "");
            map.put("b", "");
        }
    }

    return map;
}

}