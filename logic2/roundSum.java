public class roundSum{
public int roundSum(int a, int b, int c) {
  int sum = 0;
    int[] nums = {a, b, c};
    for (int num : nums) {
        int r = num % 10;
        if (r >= 5) sum += num + (10 - r);
        else sum += num - r;
    }
    return sum;
}


}
