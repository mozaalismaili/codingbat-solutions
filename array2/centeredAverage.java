public class centeredAverage{
public int centeredAverage(int[] nums) {
    int sum = 0;
    int min = nums[0];
    int max = nums[0];

    for (int num : nums) {
        sum += num;
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    return (sum - min - max) / (nums.length - 2);
}


}