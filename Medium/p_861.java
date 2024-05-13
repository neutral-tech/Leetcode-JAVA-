class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int i=0,count=0,j=0,sum=1,total=0;
        for(i=0;i<m;i++){
            if(grid[i][0]==0) fliprow(i,n,grid);
        }
        for(j=1;j<n;j++){
            count=0;
            for(i=0;i<m;i++){
                if(grid[i][j]==0) count++;
            }
            if(count>(m/2)) flipcolumn(j,m,grid);
        }
        for(j=n-1;j>=0;j--){
            total=total+add(j,m,sum,grid);
            sum=sum*2;
        }
        return total;
    }
    private void fliprow(int i,int n,int[][] arr){
        int j=0;
        for(j=0;j<n;j++){
            arr[i][j]=(arr[i][j]+1)%2;
        }
        return;
    }
    private void flipcolumn(int j,int m,int[][] arr){
        int i=0;
        for(i=0;i<m;i++){
            arr[i][j]=(arr[i][j]+1)%2;
        }
        return;
    }
    private int add(int j,int m,int sum,int[][] arr){
        int temp=0,i=0;
        for(i=0;i<m;i++){
            if(arr[i][j]==1) temp=temp+sum;
        }
        return temp;
    }
}
