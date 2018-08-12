int arrayChange(int[] inputArray) {
    int allMoves = 0, tempMove = 0;
    for(int i=0; i<inputArray.length-1; i++) {
        if(inputArray[i]>=inputArray[i+1]) {
            tempMove=(Math.abs(inputArray[i]-inputArray[i+1])+1);
            inputArray[i+1]+=tempMove;
            allMoves+=tempMove;
        }
    }
    return allMoves;
}

