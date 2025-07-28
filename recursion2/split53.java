public class split53{
public boolean split53(int[] nums) {
    return helper(nums, 0, 0);
}

private boolean helper(int[] nums, int index, int diff) {
    if (index == nums.length) return diff == 0;

    int val = nums[index];
    if (val % 5 == 0) {
        return helper(nums, index + 1, diff + val);
    } else if (val % 3 == 0) {
        return helper(nums, index + 1, diff - val);
    } else {
        return helper(nums, index + 1, diff + val) || helper(nums, index + 1, diff - val);
    }
}


}