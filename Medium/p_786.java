class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       int n=arr.length,i=0,j=0,m=0,size=0;
       size=n*(n-1);
       size=size/2;
       double[] heap=new double[size];
       
       for(i=0;i<n;i++)
           for(j=i+1;j<n;j++)
                heap[m++]=(double)(arr[i])/arr[j]; 
       
       heapify(heap);
       while(k>1){
         size=delete(heap,size);
         k--;
       }
       double temp=heap[0];
       double a=0.0;
       for(i=0;i<n;i++){
           for(j=i+1;j<n;j++){
              a=(double)(arr[i])/arr[j];
              if(a==temp) break;
           }
           if(a==temp) break;
       }

        int[] abc=new int[2];
        abc[0]=arr[i];
        abc[1]=arr[j];        
        return abc;
    }
    private void heapify(double[] arr){
      int i=0,child=0,parent=0;
      for(i=0;i<arr.length;i++){
          child=i;
          parent=(i-1)/2;
          while(child>0){
              if(arr[child]>=arr[parent]) break;
              swap(arr,child,parent);
              child=parent;
              parent=(child-1)/2;
          }
      }
      return;
   }
   private void swap(double[] arr,int i,int j){
       double temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       return;
   }
   private int delete(double[] arr,int n){
        arr[0]=arr[n-1];
        n--;
        int parent=0,child;
        child=min(arr,0,n);
        while(child!=-1){
             if(arr[child]>=arr[parent]) break;
             swap(arr,parent,child);
             parent=child;
             child=min(arr,parent,n);
        }
        return n;
   }
   private int min(double[] arr,int i,int n){
       int a=i*2+1;
       int b=i*2+2;
       if(a>=n) return -1;
       else if(b>=n) return a;
       else{
           if(arr[a]<arr[b]) return a;
           return b;
       }
   }
}

