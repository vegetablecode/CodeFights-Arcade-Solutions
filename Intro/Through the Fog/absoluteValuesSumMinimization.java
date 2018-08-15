int absoluteValuesSumMinimization(int[] a) {
    int minResult = Integer.MAX_VALUE;
    int minResultX = 0;
    
    for(int x: a) {
        int result = 0;
        int counter = 0;
        while(counter<a.length) {
            result+=Math.abs(a[counter]-x);
            counter++;
        }
        if(result<minResult){
            minResult = result;
            minResultX = x;
        }
    }
    return minResultX;
}
