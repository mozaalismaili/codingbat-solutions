public class tenRun{
public int[] tenRun(int[] nums) {
    int[] result = new int[nums.length];
    boolean inRun = false;
    int currentMultiple = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) {
            inRun = true;
            currentMultiple = nums[i];
            result[i] = nums[i];
        } else if (inRun) {
            result[i] = currentMultiple;
        } else {
            result[i] = nums[i];
        }
    }

    return result;
}

}