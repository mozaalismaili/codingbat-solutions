public class sumLimit{
public int sumLimit(int a, int b) {
  int sum = a + b;
    String aStr = String.valueOf(a);
    String sumStr = String.valueOf(sum);
    if (sumStr.length() > aStr.length()) {
        return a;
    }
    return sum;
}

}
