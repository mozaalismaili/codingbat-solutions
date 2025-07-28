public class groupSumClump{
public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;

        int count = 1;
        int sum = nums[start];
        int i = start + 1;
        while (i < nums.length && nums[i] == nums[start]) {
            sum += nums[i];
            count++;
            i++;
        }

        if (groupSumClump(start + count, nums, target - sum)) return true;
        return groupSumClump(start + count, nums, target);
}


}