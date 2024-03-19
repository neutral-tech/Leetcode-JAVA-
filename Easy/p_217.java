class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i=0;
        while(i<nums.length){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],0);
            i++;
        }
        return false;
    }
}
