class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        if(deck.length<3) return deck;
        int n=deck.length,i=n-1;
        int[] queue=new int[2*n];
        n=2*n;
        int first=n-1,last=n-1;
        queue[last]=deck[i];
        queue[last-1]=deck[i-1];
        i=deck.length-3;
        first=n-2;
        while(i>=0){
            first--;
            queue[first]=queue[last];
            last--;
            first--;
            queue[first]=deck[i];
            i--;
        }
        i=0;
        int j=first;
        while(i<deck.length){
            deck[i]=queue[j];
            i++;
            j++;
        }
        return deck;
    }
}
