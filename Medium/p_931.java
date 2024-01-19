class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if(matrix.length==1) return matrix[0][0];
        int n=matrix.length;
        int i=n-2,j=0;
        while(i>=0){
            j=0;
            while(j<n){
                if(j==0) matrix[i][j]=matrix[i][j]+min(matrix[i+1][j],matrix[i+1][j+1]);
                else if(j==n-1) matrix[i][j]=matrix[i][j]+min(matrix[i+1][j],matrix[i+1][j-1]);
                else matrix[i][j]=matrix[i][j]+min(matrix[i+1][j],matrix[i+1][j-1],matrix[i+1][j+1]);
                j++;
            }
            i--;
        }
        return findmin(matrix);
    }
    private int min(int a,int b){
        if(a<b) return a;
        return b;
    }
    private int min(int a,int b,int c){
        if(a<b&&a<c) return a;
        else if(b<c) return b;
        return c;
    }
    private int findmin(int[][] arr){
        int min=arr[0][0];
        int j=1;
        while(j<arr.length){
            if(arr[0][j]<min) min=arr[0][j];
            j++;
        }
        return min;
    }
}
