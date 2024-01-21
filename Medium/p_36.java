class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i=0,j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]>='1'&&board[i][j]<='9')
                   if(!check(board,i,j)) return false;
            }
        }
        return true;
    }
    public boolean check(char[][] grid,int row,int column){
        int i=0;
        char temp=grid[row][column];
        grid[row][column]='@';
        for(i=0;i<9;i++){
            if(grid[row][i]==temp) return false;
            if(grid[i][column]==temp) return false;
            if(grid[3*(row/3)+i/3][3*(column/3)+i%3]==temp) return false;
        }
        grid[row][column]=temp;
        return true;
    }
}
