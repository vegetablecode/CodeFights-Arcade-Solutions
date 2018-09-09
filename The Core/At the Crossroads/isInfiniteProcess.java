boolean isInfiniteProcess(int a, int b) {
    int counter = 0;
    while(a!=b) {
        a++;
        b--;
        System.out.println(a + " " + b);
        if(b<a) return true;
    }
    return false;
}

