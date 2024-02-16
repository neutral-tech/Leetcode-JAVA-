class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> history=new HashMap<Integer,Integer>();
        List<Integer> abc=new ArrayList<Integer>();
        int i=0,temp=0,sum=0;
        while(i<arr.length){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                temp=map.get(arr[i]);
                map.put(arr[i],(temp+1));
            }
            i++;
        }
        i=0;
        while(i<arr.length){
            if(!history.containsKey(arr[i])){
                abc.add(map.get(arr[i]));
                history.put(arr[i],0);
            }
            i++;
        }
        Collections.sort(abc);
        i=0;
        while(i<abc.size()){
            sum=sum+abc.get(i);
            if(sum==k) return abc.size()-i-1;
            if(sum>k) return abc.size()-i;
            i++;
        }
       return -1;
    } 
}
