class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int[] arr=new int[2];
        while(i<nums.length){
            if(map.containsKey(target-nums[i])){
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                break;
            }
            map.put(nums[i],i);
            i++;
        }
        return arr;
    }
}
