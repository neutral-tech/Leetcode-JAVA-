class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int fr=0,lr=m-1,fc=0,lc=n-1,midr,midc;
        while(fr<=lr && fc<=lc){
            midr=fr+(lr-fr)/2;
            midc=fc+(lc-fc)/2;
            if(matrix[midr][midc]==target) return true;
            else if(target<matrix[midr][midc]){
                if(target<matrix[midr][0]) lr=midr-1;
                else lc=midc-1;
            }
            else{
                if(target>matrix[midr][n-1]) fr=midr+1;
                else fc=midc+1;
            }
        }
        return false;
    }
}
