public class SleepIn {

public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday){return true;}
  else if (vacation){return true;}
  return false;
}
}