public class stringMatch{
public int stringMatch(String a, String b) {

        int count = 0;

        for (int i = 0; i <  Math.min(a.length(), b.length()) - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
}

}