public class nearHundred{
public boolean nearHundred(int n) {
  if (Math.abs(100-n)<=10){return true;}
  if (Math.abs(200-n)<=10){return true;}
  return false;
}
}
