class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length,n=nums2.length,i=0,j=0,k=0;
       int[] arr=new int[m+n];
       double median;
       while(i<m&&j<n){
        if(nums1[i]<nums2[j]){
            arr[k++]=nums1[i++];
        }
        else{
            arr[k++]=nums2[j++];
        }
    }
    if(j==n){
        while(i<m){
             arr[k++]=nums1[i++];
        }
    }
    else{
        while(j<n){
            arr[k++]=nums2[j++];
        }
    }
    int index=(m+n)/2;
    if((m+n)%2==1){
        median=(double)(arr[index]);
    }
    else{
        median=((double)(arr[index]+arr[index-1]))/2;
    }
    return median;
    }
}
