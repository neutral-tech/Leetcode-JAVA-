class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1&&n==1) return 1;
        int[][] grid=new int[m][n];
        int i=m-1,j=n-1;
        while(j>=0){
            i=m-1;
            while(i>=0){
              if(i==m-1&&j==n-1) grid[i][j]=0;
              else if(i==m-1||j==n-1) grid[i][j]=1;
              else grid[i][j]=grid[i+1][j]+grid[i][j+1];
              i--;
            }
            j--;
        }
        return grid[0][0];
    }
}

