class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i=0,min=-1,flag=0;
        while(i<nums1.length){
            if(!map.containsKey(nums1[i])) map.put(nums1[i],0);
            i++;
        }
        i=0;
        while(i<nums2.length){
            if(map.containsKey(nums2[i])){
                if(flag==0){
                    min=nums2[i];
                    flag=1;
                }
                else if(nums2[i]<min) min=nums2[i];
            }
            i++;
        }
        if(flag==0) return -1;
        return min;
    }
}
