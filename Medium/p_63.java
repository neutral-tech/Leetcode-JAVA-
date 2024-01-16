class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        int i=m-1,j=n-1;
        if(obstacleGrid[i][j]==1) return 0;
        else if(m==1&&n==1) return 1;
        while(j>=0){
            i=m-1;
            while(i>=0){
                if(obstacleGrid[i][j]==1) obstacleGrid[i][j]=-1;
                else{
                   if(i==m-1&&j==n-1) obstacleGrid[i][j]=0;
                   else if(i==m-1){
                       if(obstacleGrid[i][j+1]==-1) obstacleGrid[i][j]=-1;
                       else obstacleGrid[i][j]=1;
                   }
                   else if(j==n-1){
                       if(obstacleGrid[i+1][j]==-1) obstacleGrid[i][j]=-1;
                       else obstacleGrid[i][j]=1;
                   } 
                   else{
                       if(obstacleGrid[i+1][j]==-1&&obstacleGrid[i][j+1]==-1) obstacleGrid[i][j]=-1;
                       else if(obstacleGrid[i+1][j]==-1) obstacleGrid[i][j]=obstacleGrid[i][j+1];
                       else if(obstacleGrid[i][j+1]==-1) obstacleGrid[i][j]=obstacleGrid[i+1][j];
                       else obstacleGrid[i][j]=obstacleGrid[i+1][j]+obstacleGrid[i][j+1];  
                   } 
                }
                i--;
            }
            j--;
        }
        if(obstacleGrid[0][0]==-1) return 0;
        return obstacleGrid[0][0];
    }
}
