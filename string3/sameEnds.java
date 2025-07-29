public class sameEnds{
public String sameEnds(String string) {
  int maxLen = string.length() / 2;
    for (int len = maxLen; len > 0; len--) {
        String start = string.substring(0, len);
        String end = string.substring(string.length() - len);
        if (start.equals(end)) {
            return start;
        }
    }
    return "";
}

}