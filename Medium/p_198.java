class Solution {
    public int rob(int[] nums) {
        int n=nums.length,i=0; 
        if(n==0) return 0;
        else if(n==1) return nums[0];
        else if(n==2){
            if(nums[0]>nums[1]) return nums[0];
            return nums[1];
        }
        nums[n-3]=nums[n-3]+nums[n-1];
        i=n-4;
        while(i>=0){
            nums[i]=nums[i]+max(nums[i+2],nums[i+3]);
            i--;
        }
        return max(nums[0],nums[1]);
    }
    public int max(int a,int b){
        if(a>b) return a;
        return b;
    }
}
