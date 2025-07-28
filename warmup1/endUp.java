public class endUp{
public String endUp(String str) {
int len = str.length();
        if (len < 3) {
            return str.toUpperCase();
        }
        String front = str.substring(0, len - 3);
        String end = str.substring(len - 3).toUpperCase();
        return front + end;}
}