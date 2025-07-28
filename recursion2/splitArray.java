public class splitArray{
public boolean splitArray(int[] nums) {
    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }
    if (totalSum % 2 != 0) {
        return false;
    }
    return canSplit(nums, 0, totalSum / 2);
}

private boolean canSplit(int[] nums, int index, int target) {
    if (target == 0) {
        return true;
    }
    if (index >= nums.length || target < 0) {
        return false;
    }
    return canSplit(nums, index + 1, target - nums[index]) || canSplit(nums, index + 1, target);
}

}