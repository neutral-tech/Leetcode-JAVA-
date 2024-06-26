class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int i,j,perimeter=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(i==0||grid[i-1][j]==0) perimeter++;
                    if(j==0||grid[i][j-1]==0) perimeter++;
                    if((i==m-1)||grid[i+1][j]==0) perimeter++;
                    if((j==n-1)||grid[i][j+1]==0) perimeter++;
                }
            }
        }
        return perimeter;
    }
}
