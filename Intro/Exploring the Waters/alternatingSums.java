int[] alternatingSums(int[] a) {
    int teamA = 0;
    int teamB = 0;
    for(int i=0; i<a.length; i++){
        if(i%2==0)
            teamA+=a[i];
        else teamB+=a[i];
    }
    
    int result[] = new int[2];
    result[0] = teamA; result[1] = teamB;
    return result;
}

