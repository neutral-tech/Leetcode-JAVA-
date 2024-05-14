class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length,count=0;
        int[][] visited=new int[m][n];
        int i=0,j=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]!=1){
                    count++;
                    solve(i,j,grid,visited,m,n);
                }
            }
        }
        return count;
    }
    private void solve(int i,int j,char[][] grid,int[][] visited,int m,int n){
        visited[i][j]=1;
        if(j>=1 && grid[i][j-1]=='1' && visited[i][j-1]!=1) solve(i,j-1,grid,visited,m,n);
        if((j+1)<n && grid[i][j+1]=='1' && visited[i][j+1]!=1) solve(i,j+1,grid,visited,m,n);
        if(i>=1 && grid[i-1][j]=='1' && visited[i-1][j]!=1) solve(i-1,j,grid,visited,m,n);
        if((i+1)<m && grid[i+1][j]=='1' && visited[i+1][j]!=1) solve(i+1,j,grid,visited,m,n);
        return;    
    }
}
