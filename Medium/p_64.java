class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length,minimum=0;
        int i=m-1,j=n-1;
        while(j>=0){
            i=m-1;
            while(i>=0){
                if(i==m-1&&j==n-1) grid[i][j]=grid[i][j];
                
                else if(j==n-1) grid[i][j]=grid[i][j]+grid[i+1][j];
                
                else if(i==m-1) grid[i][j]=grid[i][j]+grid[i][j+1];
                
                else{
                    if(grid[i+1][j]<grid[i][j+1]) grid[i][j]=grid[i][j]+grid[i+1][j];
                    else grid[i][j]=grid[i][j]+grid[i][j+1];
                }
                i--;
            }
            j--;
        }
        return grid[0][0];
    }
}
