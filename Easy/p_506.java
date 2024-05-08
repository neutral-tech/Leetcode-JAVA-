class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        String[] arr=new String[score.length];
        int i=0;
        while(i<score.length){
            map.put(score[i],i);
            i++;
        }
        i=1;
        Arrays.sort(score);
        while(i<=score.length){
            if(i==1) arr[map.get(score[score.length-i])]="Gold Medal";
            else if(i==2) arr[map.get(score[score.length-i])]="Silver Medal";
            else if(i==3) arr[map.get(score[score.length-i])]="Bronze Medal";
            else arr[map.get(score[score.length-i])]=Integer.toString(i);
            i++;
        }
        map.clear();
        return arr;
    }
}
