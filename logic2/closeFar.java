public class closeFar{
public boolean closeFar(int a, int b, int c) {
  boolean bClose = Math.abs(a - b) <= 1;
    boolean cClose = Math.abs(a - c) <= 1;
    boolean bFarFromC = Math.abs(b - c) >= 2;
    boolean bFarFromA = Math.abs(b - a) >= 2;
    boolean cFarFromA = Math.abs(c - a) >= 2;

    return (bClose && !cClose && bFarFromC && cFarFromA) ||
           (cClose && !bClose && bFarFromC && bFarFromA);
}


}
