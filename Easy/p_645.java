class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        int i=0;
        while(i<nums.length){
            if(map.isEmpty()) map.put(nums[i],0);
            else if(map.containsKey(nums[i])) arr[0]=nums[i];
            else map.put(nums[i],0);
            i++;
        }
        i=1;
        while(i<=nums.length){
            if(!map.containsKey(i)){
                arr[1]=i;
                break;
            }
            i++;
        }
        return arr;
    }
}
