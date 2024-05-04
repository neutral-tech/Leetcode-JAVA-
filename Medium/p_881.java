class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1,total=0,temp;
        while(i<j){
            temp=people[i]+people[j];
            if(temp<=limit) i++;
            j--;
            total++;
        }
        if(i==j) total++;
        return total;
    }
}
