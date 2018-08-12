boolean areSimilar(int[] a, int[] b) {
    int swaps = 0, i = 0;
    int[] wrong = new int[1000];
    do {
        if((a[i]!=b[i])) {
            wrong[swaps] = i;
            swaps++;
        }
        i++;
    } while (i!=a.length);
    if(swaps>2)
        return false;
    else if(swaps==2)
        if((a[wrong[0]]!=b[wrong[1]])||(a[wrong[1]]!=b[wrong[0]]))
            return false;
    return true;
}

