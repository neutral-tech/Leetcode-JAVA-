class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        while(i<nums.length){
            map.put(nums[i],0);
            i++;
        }
        i=0;
        while(i<nums.length){
            if(!map.containsKey(i)) return i;
            i++;
        }
        return nums.length;
    }
}
