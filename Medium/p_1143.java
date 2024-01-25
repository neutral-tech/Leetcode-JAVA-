class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int col=text1.length()+1,row=text2.length()+1,i=0,j=0;
        int[][] memo=new int[row][col];
        while(j<col){
            memo[0][j]=0;
            j++;
        }
        while(i<row){
            memo[i][0]=0;
            i++;
        }
        for(i=1;i<row;i++){
            for(j=1;j<col;j++){
                if(text2.charAt(i-1)==text1.charAt(j-1)) memo[i][j]=memo[i-1][j-1]+1;
                else memo[i][j]=max(memo[i-1][j],memo[i][j-1]);
            }
        }
        return memo[row-1][col-1];
    }
    public int max(int a,int b){
        if(a>b) return a;
        return b;
    }
}
