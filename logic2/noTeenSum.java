public class noTeenSum{
public int noTeenSum(int a, int b, int c) {
  int sum = 0;

    if (a < 13 || a > 19 || a == 15 || a == 16) sum += a;
    if (b < 13 || b > 19 || b == 15 || b == 16) sum += b;
    if (c < 13 || c > 19 || c == 15 || c == 16) sum += c;

    return sum;
}

}
