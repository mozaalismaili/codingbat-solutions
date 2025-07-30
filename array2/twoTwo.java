public class twoTwo{
public boolean twoTwo(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2) {
            boolean hasNeighbor = false;

            if (i > 0 && nums[i - 1] == 2) {
                hasNeighbor = true;
            }

            if (i < nums.length - 1 && nums[i + 1] == 2) {
                hasNeighbor = true;
            }

            if (!hasNeighbor) {
                return false;
            }
        }
    }
    return true;
}


}