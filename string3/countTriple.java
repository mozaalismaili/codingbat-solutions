public class countTriple{
public int countTriple(String str) {
  int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        char c = str.charAt(i);
        if (c == str.charAt(i + 1) && c == str.charAt(i + 2)) {
            count++;
        }
    }
    return count;
}

}