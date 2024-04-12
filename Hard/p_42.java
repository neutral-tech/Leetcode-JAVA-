class Solution {
    public int trap(int[] height) {
        if(height.length<3) return 0;
        int max1=0,max2=0,i=1,n=height.length,total=0;
        HashMap<Integer,Integer> front=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> back=new HashMap<Integer,Integer>();
        front.put(0,0);
        back.put(n-1,0);
        while(i<n){
            if(height[i-1]>max1) max1=height[i-1];
            if(height[n-i]>max2) max2=height[n-i];
            front.put(i,max1);
            back.put(n-1-i,max2);
            i++;
        }
        i=0;
        while(i<n){
            max1=min(front.get(i),back.get(i))-height[i];
            if(max1>0) total=total+max1; 
            i++;
        }
        front.clear();
        back.clear();
        return total;
    }
    private int min(int a,int b){
        if(a<b) return a;
        return b;
    }
}
