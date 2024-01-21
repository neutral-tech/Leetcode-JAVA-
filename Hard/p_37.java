class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] grid){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]=='.'){
                    for(char ch=49;ch<=57;ch++){
                        if(check(grid,i,j,ch)){
                            grid[i][j]=ch;
                            if(solve(grid)) return true;
                            else grid[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean check(char[][] arr,int row,int col,char ch){
        int i=0;
        for(i=0;i<9;i++){
            if(arr[row][i]==ch) return false;
            if(arr[i][col]==ch) return false;
            if(arr[3*(row/3)+i/3][3*(col/3)+i%3]==ch) return false;
        }
        return true;
    }
}
