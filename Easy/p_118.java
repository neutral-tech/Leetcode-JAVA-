class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return null;
        List<List<Integer>> arr=new ArrayList();
        int row=1,position=1,a=0,b=0;
        arr.add(new ArrayList<Integer>());
        arr.get(0).add(1);
        if(numRows==1) return arr;
        for(row=1;row<numRows;row++){
            arr.add(new ArrayList<Integer>());
            arr.get(row).add(1);
            for(position=1;position<row;position++){
                a=arr.get(row-1).get(position-1);
                b=arr.get(row-1).get(position);
                arr.get(row).add(a+b);
            }
            arr.get(row).add(1);
        }
        return arr;
    }
}
