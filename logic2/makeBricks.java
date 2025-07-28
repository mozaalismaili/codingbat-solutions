public class makeBricks{
public boolean makeBricks(int small, int big, int goal) {
  int bigUse = goal / 5;
    if (bigUse > big) {
        bigUse = big;
    }
    int remaining = goal - (bigUse * 5);
    return remaining <= small;
}


}
