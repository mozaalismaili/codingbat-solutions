public class mirrorEnds{
public String mirrorEnds(String string) {
  int len = string.length();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < len; i++) {
        if (string.charAt(i) == string.charAt(len - 1 - i)) {
            result.append(string.charAt(i));
        } else {
            break;
        }
    }
    return result.toString();
}


}