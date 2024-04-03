class Solution {
    int[][] grid;
    char[][] arr;
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        grid=new int[m][n];
        arr=board;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(check(i,j,word)) return true;
                }
            }
        }
        return false;
    }
    private boolean check(int i,int j,String str){
        if(i<0||i>=arr.length||j<0||j>=arr[0].length) return false;
        else if(grid[i][j]!=1){
            if(arr[i][j]==str.charAt(0)){
                if(str.length()==1) return true;
                else{
                    grid[i][j]=1;
                    boolean a=check(i,j+1,str.substring(1));
                    boolean b=check(i,j-1,str.substring(1));
                    boolean c=check(i+1,j,str.substring(1));
                    boolean d=check(i-1,j,str.substring(1));
                    boolean f=a||b||c||d;
                    if(!f) grid[i][j]=0;
                    return f;
                }
            }
            else return false;
        }
        else return false;
    }
}
