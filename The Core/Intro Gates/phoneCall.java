int phoneCall(int min1, int min2_10, int min11, int s) {
    int minutes = 0, cost = 0;
    while(cost<=s) {
        minutes++;
        if(minutes == 1) cost+=min1;
        if(minutes>=2&&minutes<=10) cost+=min2_10;
        else if(minutes>10) cost+=min11;
    }
    return minutes-1;
}

