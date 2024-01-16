class Solution {
    public int numSpecial(int[][] mat) {
       int i=0,j=0,flag=0,n=0,note=0;
       while(i<mat.length){
           j=0;
           flag=0;
           while(j<mat[0].length){
               if(mat[i][j]==1){
                  flag++;
                  note=j;
               }
              j++;
           }
           if(flag==1){
               flag=0;
               for(j=0;j<mat.length;j++){
                   if(mat[j][note]==1) flag++;
               }
               if(flag==1) n++;
           }
           i++;
       }
       return n; 
    }
}

