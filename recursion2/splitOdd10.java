public class splitOdd10{
public boolean splitOdd10(int[] nums) {
    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }
    if (totalSum % 2 == 0) {
        return false;
    }
    return canSplitToMultipleOf10(nums, 0, 0);
}

private boolean canSplitToMultipleOf10(int[] nums, int index, int sum) {
    if (index == nums.length) {
        return sum % 10 == 0;
    }
    return canSplitToMultipleOf10(nums, index + 1, sum + nums[index]) || 
           canSplitToMultipleOf10(nums, index + 1, sum);
}

}