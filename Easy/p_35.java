class Solution {
    public int searchInsert(int[] nums, int target) {
       int i = 0, initial = 0;
        int last = nums.length - 1;
        while (initial <= last) {
            i = initial + (last - initial) / 2;
            if (nums[i] == target) return i;
            else if (target < nums[i]) last = i - 1;
            else initial = i + 1;
        }
        return initial; 
    }
}
