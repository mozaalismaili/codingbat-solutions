public class sumDigits{
public int sumDigits(String str) {
  int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isDigit(c)) {
            sum += c - '0';  // Convert char digit to int
        }
    }
    return sum;
}

}