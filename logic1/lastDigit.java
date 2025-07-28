public class lastDigit{
public boolean lastDigit(int a, int b, int c) {
  int aLast = a % 10;
    int bLast = b % 10;
    int cLast = c % 10;

    return (aLast == bLast) || (aLast == cLast) || (bLast == cLast);
    
}

}
