public class sum67{
public int sum67(int[] nums) {
    int sum = 0;
    boolean inSection = false;

    for (int num : nums) {
        if (num == 6) {
            inSection = true;
        } else if (inSection && num == 7) {
            inSection = false;
        } else if (!inSection) {
            sum += num;
        }
    }

    return sum;
}


}