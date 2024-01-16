class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Integer> visited=new ArrayList<Integer>();
        visited.add(0);
        int[] queue=new int[rooms.size()];
        int front=0,rear=0,i=0,num=0;
        queue[0]=0;
        while(front<=rear){
            i=0;
            while(i<rooms.get(queue[front]).size()){
                num=rooms.get(queue[front]).get(i);
                if(num!=queue[front]&&!check(visited,num)){
                    visited.add(num);
                    rear++;
                    queue[rear]=num;
                }
                i++;
            }
            front++;
        }
        if(visited.size()==rooms.size()) return true;
        else return false;
    }
    public boolean check(ArrayList<Integer> visited,int num){
        if(visited.size()==0) return false;
        int i=0;
        while(i<visited.size()){
            if(visited.get(i)==num) return true;
            i++;
        }
        return false;
    }
}

