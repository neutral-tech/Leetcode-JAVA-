class Solution {
    public int findSpecialInteger(int[] arr) {
       if(arr.length==1) return arr[0];
       int n=arr.length/4;
       int i=1,now=1;
       while(i<arr.length){
           if(arr[i]==arr[i-1]) now++;
           else now=1;
           if(now>n) break;
           i++;
       } 
       return arr[i];
    }
}
