class Solution {
    public int findCircleNum(int[][] isConnected) {
        int province=0,n=isConnected.length,i=0,front=0,rear=0,j=0;
        int[] queue=new int[n];
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(i=0;i<n;i++){
            front=0;
            rear=0;
            if(!visited(arr,i)){
                queue[0]=i;
                arr[i]=1;
                while(front<=rear){
                    j=0;
                    while(j<n){
                       if(queue[front]!=j&&!visited(arr,j)&&isConnected[queue[front]][j]==1){
                          arr[j]=1;
                          rear++;
                          queue[rear]=j;
                        }
                        j++;
                    }
                    front++;
                } 
                province++;
            }
            
        }
        return province;
    }
    public boolean visited(int[] arr,int i){
        if(arr[i]==0) return false;
        else return true;
    }
}

