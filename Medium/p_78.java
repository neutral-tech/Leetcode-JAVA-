class Solution {
    List<List<Integer>> arr;
    public List<List<Integer>> subsets(int[] nums) {
        arr=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        solve(0,nums,list);
        return arr;
    }
    private void solve(int i,int[] nums,List<Integer> list){
        if(i>=nums.length){
            List<Integer> temp=new ArrayList<Integer>();
            copy(temp,list);
            arr.add(temp);
            return;
        }
        list.add(nums[i]);
        solve(i+1,nums,list);
        list.remove(list.size()-1);
        solve(i+1,nums,list);
    }
    private void copy(List<Integer> a,List<Integer> b){
        int i=0;
        while(i<b.size()){
            a.add(b.get(i));
            i++;
        }
    }
}
