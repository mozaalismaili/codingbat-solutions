public class withoutString{
public String withoutString(String base, String remove) {
  String result = "";
        int i = 0;
        int len = remove.length();

        while (i <= base.length() - len) {
            String sub = base.substring(i, i + len);
            if (sub.equalsIgnoreCase(remove)) {
                i += len;
            } else {
                result += base.charAt(i);
                i++;
            }
        }

        result += base.substring(i);

        return result;
}

}