class Solution {
    public int scoreOfString(String s) {
        if(s.length()<2) return 0;
        int score=0,i=0;
        while(i<(s.length()-1)){
            score=score+Math.abs(s.charAt(i)-s.charAt(i+1));
            i++;
        }
        return score;
    }
}
