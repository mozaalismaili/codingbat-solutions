public class makeChocolate{
public int makeChocolate(int small, int big, int goal) {
  int maxBigBars = goal / 5;
    if (maxBigBars > big) {
        maxBigBars = big;
    }
    int remainder = goal - maxBigBars * 5;
    if (remainder <= small) {
        return remainder;
    }
    return -1;
}


}
