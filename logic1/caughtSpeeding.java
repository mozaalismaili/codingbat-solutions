public class caughtSpeeding{
public int caughtSpeeding(int speed, boolean isBirthday) {
  int allowance = 0;
    if (isBirthday) {
        allowance = 5;
    }

    int adjustedSpeed = speed - allowance;

    if (adjustedSpeed <= 60) return 0;
    if (adjustedSpeed <= 80) return 1;
    return 2;
}
}
