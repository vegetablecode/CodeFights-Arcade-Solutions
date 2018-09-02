int largestNumber(int n) {
    if(n==1) return 9;
    else return 10*largestNumber(n-1)+9;
}
