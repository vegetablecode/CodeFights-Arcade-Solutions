int depositProfit(int deposit, int rate, int threshold) {
    double profit = deposit;
    int counter = 0;
    while(profit<threshold){
        profit+=(profit*rate/100);
        counter++;
    }
    return counter;
}

