public class frontTimes{
public String frontTimes(String str, int n) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
}


}