class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1,temp,i=0;
        while(i<nums.length){
            temp=(-1)*nums[i];
            if(map.containsKey(temp)){
                map.remove(temp);
                if(temp<0) temp=(-1)*temp;
                if(temp>ans) ans=temp;
            }
            else{
                map.put(nums[i],0);
            }
            i++;
        }
        return ans;
    }
}
