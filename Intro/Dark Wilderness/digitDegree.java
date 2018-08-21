int digitDegree(int n) {
    int sum = 0, degree = 1, counter = 0;
    while(n>=10) {
        while(degree<=n) {
            sum+=n/degree%10;
            degree*=10;
        }
        degree = 1;
        n = sum;
        sum = 0;
        counter++;
    }
    return counter;
}

