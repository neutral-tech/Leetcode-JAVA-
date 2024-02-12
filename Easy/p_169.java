class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int c=n/2,i=0,temp=0;
        while(i<n){
           if(map.containsKey(nums[i])){
               temp=map.get(nums[i]);
               map.put(nums[i],(temp+1));
               if(map.get(nums[i])>c) return nums[i];
           } 
           else map.put(nums[i],1); 
           i++;
        }
        return nums[0];
    }
}
