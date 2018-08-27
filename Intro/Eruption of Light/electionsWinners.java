int electionsWinners(int[] votes, int k) {
    int highest = votes[0], counter = 0, highestCount = 0;
    for(int i=0; i<votes.length; i++) {
        if(votes[i]>highest)
            highest = votes[i];
    }
    for(int i=0; i<votes.length; i++) {
        if(votes[i]==highest)
            highestCount++;
        if(votes[i]+k>highest)
            counter++;
    }
    if((k==0)&&(highestCount<2)) return 1;
    return counter;
}

