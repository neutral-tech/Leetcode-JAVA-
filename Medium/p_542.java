class Pair{
    int row,column,distance;
    Pair(int r,int c,int d){
        this.row=r;
        this.column=c;
        this.distance=d;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length,i,j,r,c,d;
        Queue<Pair> q=new LinkedList<>();
        int[][] visited=new int[m][n];
        int[][] arr=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            r=q.peek().row;
            c=q.peek().column;
            d=q.peek().distance;
            if(c>=1 && visited[r][c-1]!=1){
                visited[r][c-1]=1;
                q.add(new Pair(r,c-1,d+1));
                arr[r][c-1]=d+1;
            }
            if(r>=1 && visited[r-1][c]!=1){
                visited[r-1][c]=1;
                q.add(new Pair(r-1,c,d+1));
                arr[r-1][c]=d+1;
            }
            if((r+1)<m && visited[r+1][c]!=1){
                visited[r+1][c]=1;
                q.add(new Pair(r+1,c,d+1));
                arr[r+1][c]=d+1;
            }
            if((c+1)<n && visited[r][c+1]!=1){
                visited[r][c+1]=1;
                q.add(new Pair(r,c+1,d+1));
                arr[r][c+1]=d+1;
            }
            q.remove();
        }
        return arr;
    }
}
