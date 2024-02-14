class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[n/2];
        int[] negative=new int[n/2];
        int top1=0,top2=0,i=0;
        while(i<n){
            if(nums[i]<0) negative[top2++]=nums[i];
            else positive[top1++]=nums[i];
            i++;
        }
        i=0;
        top1=0;
        top2=0;
        while(i<n){
            if((i%2)==0) nums[i]=positive[top1++];
            else nums[i]=negative[top2++];
            i++;
        }
        return nums;
    }
}
