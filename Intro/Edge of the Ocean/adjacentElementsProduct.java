int adjacentElementsProduct(int[] inputArray) {
    int m = inputArray[0]*inputArray[1];
    for(int i=0; i<inputArray.length-1; i++){
        int x = inputArray[i]*inputArray[i+1];
        if(x>m) m = x;
    } return m;
}

