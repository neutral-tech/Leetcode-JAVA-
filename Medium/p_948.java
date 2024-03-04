class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0) return 0;
        else if(tokens.length==1){
            if(power<tokens[0]) return 0;
            else return 1;
        }
        Arrays.sort(tokens);
        if(power<tokens[0]) return 0;
        int i=0,j=tokens.length-1,max=0,score=0;
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                power=power-tokens[i];
                i++;
            }
            else{
                power=power+tokens[j];
                j--;
                score--;
            }
            if(max<score) max=score;
        }
        return max;
    }
}
