public class post4{
public int[] post4(int[] nums) {
    int lastIndex = -1;

    // Find the index of the last 4
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            lastIndex = i;
        }
    }

    // Create a new array for elements after the last 4
    int[] result = new int[nums.length - lastIndex - 1];
    for (int i = lastIndex + 1; i < nums.length; i++) {
        result[i - lastIndex - 1] = nums[i];
    }

    return result;
}


}