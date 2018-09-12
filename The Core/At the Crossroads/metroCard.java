int[] metroCard(int lastNumberOfDays) {
    int[] after28_29_30 = {31};
    int[] after31 = {28, 30, 31};
    if(lastNumberOfDays == 28 || lastNumberOfDays == 29 || lastNumberOfDays == 30) return after28_29_30;
    else return after31;
}

