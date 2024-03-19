class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1,temp=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]) temp++;
            else{
                if(temp==2) temp=1;
                else return nums[i-1];
            }
            i++;
        }
        return nums[nums.length-1];
    }
}
