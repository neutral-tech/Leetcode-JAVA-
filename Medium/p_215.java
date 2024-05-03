class Solution {
    public int findKthLargest(int[] nums, int k) {
        heapify(nums);
        int n=nums.length;
        while(k>1){
            n=delete(nums,n);
            k--;
        }
        return nums[0];
    }
    private void heapify(int[] arr){
      int i=0,child=0,parent=0;
      for(i=0;i<arr.length;i++){
          child=i;
          parent=(i-1)/2;
          while(child>0){
              if(arr[child]<=arr[parent]) break;
              swap(arr,child,parent);
              child=parent;
              parent=(child-1)/2;
          }
      }
      return;
   }
   private void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       return;
   }
   private int delete(int[] arr,int n){
        arr[0]=arr[n-1];
        n--;
        int parent=0,child;
        child=max(arr,0,n);
        while(child!=-1){
             if(arr[child]<=arr[parent]) break;
             swap(arr,parent,child);
             parent=child;
             child=max(arr,parent,n);
        }
        return n;
   }
   private int max(int[] arr,int i,int n){
       int a=i*2+1;
       int b=i*2+2;
       if(a>=n) return -1;
       else if(b>=n) return a;
       else{
           if(arr[a]>arr[b]) return a;
           return b;
       }
   }
}
