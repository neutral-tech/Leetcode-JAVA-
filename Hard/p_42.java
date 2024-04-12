//Using two pointers
//Time Complexity O(n)
//Space Complexity O(1)

class Solution {
    public int trap(int[] height) {
        int n=height.length,i=0,j=n-1,frontmax=0,backmax=0,total=0;
        if(n<3) return 0;
        while(i<=j){
            if(height[i]<=height[j]){
                if(height[i]<frontmax) total=total+frontmax-height[i];
                else frontmax=height[i];
                i++;
            }
            else{
                if(height[j]<backmax) total=total+backmax-height[j];
                else backmax=height[j];
                j--;
            }
        }
        return total;
    }
}

//Using array to store prefix and suffix maximum

class Solution {
    public int trap(int[] height) {
        if(height.length<3) return 0;
        int max1=0,max2=0,i=1,n=height.length,total=0;
        int[] front=new int[n];
        int[] back=new int[n];
        front[0]=0;
        back[n-1]=0;
        while(i<n){
            if(height[i-1]>max1) max1=height[i-1];
            if(height[n-i]>max2) max2=height[n-i];
            front[i]=max1;
            back[n-1-i]=max2;
            i++;
        }
        i=0;
        while(i<n){
            max1=min(front[i],back[i])-height[i];
            if(max1>0) total=total+max1; 
            i++;
        }
        return total;
    }
    private int min(int a,int b){
        if(a<b) return a;
        return b;
    }
}

//Using HashMap to store prefix and suffic maximum

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
