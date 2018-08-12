int avoidObstacles(int[] inputArray) {
    boolean isGood = false;
    int good = 0;
    for(int i=2; i<10000; i++){
        for(int j=0; j<inputArray.length; j++) {
            if(inputArray[j]%i != 0) {
                isGood = true;
                good = i;
            } else {isGood = false; break;}
        }
        if(isGood == true)
            break;
    }
    return good;
}

