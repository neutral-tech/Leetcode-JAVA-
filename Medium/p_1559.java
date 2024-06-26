//BFS
class Pair{
    int i,j,r,c;
    Pair(int i,int j,int r,int c){
        this.i=i;
        this.j=j;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public boolean containsCycle(char[][] grid) {
        int m=grid.length,n=grid[0].length,i,j,a,b,c,d;
        int[][] visited=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(visited[i][j]!=1){
                    q.add(new Pair(i,j,-1,-1));
                    visited[i][j]=1;
                    while(!q.isEmpty()){
                        a=q.peek().i;
                        b=q.peek().j;
                        c=q.peek().r;
                        d=q.peek().c;
                        if(b>=1 && (a!=c || (b-1)!=d) && grid[a][b]==grid[a][b-1]){
                            if(visited[a][b-1]==1) return true;
                            else{
                                visited[a][b-1]=1;
                                q.add(new Pair(a,b-1,a,b));
                            }
                        }
                        if(a>=1 && (b!=d || (a-1)!=c) && grid[a][b]==grid[a-1][b]){
                            if(visited[a-1][b]==1) return true;
                            else{
                                visited[a-1][b]=1;
                                q.add(new Pair(a-1,b,a,b));
                            }
                        }
                        if((a+1)<m && (b!=d || (a+1)!=c) && grid[a][b]==grid[a+1][b]){
                            if(visited[a+1][b]==1) return true;
                            else{
                                visited[a+1][b]=1;
                                q.add(new Pair(a+1,b,a,b));
                            }
                        }
                        if((b+1)<n && (a!=c || (b+1)!=d) && grid[a][b]==grid[a][b+1]){
                            if(visited[a][b+1]==1) return true;
                            else{
                                visited[a][b+1]=1;
                                q.add(new Pair(a,b+1,a,b));
                            }
                        }
                        q.remove();
                    }
                }
            }
        }
        return false;
    }
}

//DFS
class Solution {
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        boolean check;
        int i=0,j=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(visited[i][j]!=1){
                    visited[i][j]=1;
                    check=solve(i,j,-1,-1,grid,visited,m,n);
                    if(check) return true;
                }
            }
        }
        return false;
    }
    private boolean solve(int a,int b,int c,int d,char[][] grid,int[][] visited,int m,int n){
        if(b>=1 && (a!=c || (b-1)!=d) && grid[a][b]==grid[a][b-1]){
            if(visited[a][b-1]==1) return true;
            else{
                visited[a][b-1]=1;
                boolean r=solve(a,b-1,a,b,grid,visited,m,n);
                if(r) return true;
            }
        }
        if(a>=1 && (b!=d || (a-1)!=c) && grid[a][b]==grid[a-1][b]){
            if(visited[a-1][b]==1) return true;
            else{
                visited[a-1][b]=1;
                boolean s=solve(a-1,b,a,b,grid,visited,m,n);
                if(s) return true;
            }
        }
        if((a+1)<m && (b!=d || (a+1)!=c) && grid[a][b]==grid[a+1][b]){
            if(visited[a+1][b]==1) return true;
            else{
                visited[a+1][b]=1;
                boolean o=solve(a+1,b,a,b,grid,visited,m,n);
                if(o) return true;
            }
        }
        if((b+1)<n && (a!=c || (b+1)!=d) && grid[a][b]==grid[a][b+1]){
            if(visited[a][b+1]==1) return true;
            else{
                visited[a][b+1]=1;
                boolean p=solve(a,b+1,a,b,grid,visited,m,n);
                if(p) return true;
            }
        }
        return false;
    }
}
