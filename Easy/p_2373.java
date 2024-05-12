class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n-2][n-2];
        int i=0,j=0;
        for(i=0;i<(n-2);i++){
            for(j=0;j<(n-2);j++){
               arr[i][j]=max(grid,i+1,j+1);
            }
        }
        return arr;
    }
    public int max(int[][] grid,int i,int j){
        int max=grid[i][j];
        int row=i-1,column=j-1;
        for(row=i-1;row<(i+2);row++){
            for(column=j-1;column<(j+2);column++){
                if(grid[row][column]>max) max=grid[row][column];
            }
        }
        return max;
    }
}
