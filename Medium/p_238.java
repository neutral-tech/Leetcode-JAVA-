class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1, p1 = 1, p2 = 1;
        int[] front = new int[n];
        int[] back = new int[n];
        while (i < n) {
            front[i] = p1;
            p1 = p1 * nums[i];
            back[j] = p2;
            p2 = p2 * nums[j];
            i++;
            j--;
        }
        i = 0;
        while (i < n) {
            nums[i] = front[i] * back[i];
            i++;
        }
        return nums;
    }
}
