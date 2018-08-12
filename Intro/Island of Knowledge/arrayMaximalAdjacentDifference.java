int arrayMaximalAdjacentDifference(int[] inputArray) {
    int maximum = Math.abs(inputArray[0]-inputArray[1]);
    for(int i=0; i<inputArray.length-1; i++)
        maximum = (maximum<(Math.abs(inputArray[i]-inputArray[i+1])))? Math.abs(inputArray[i]-inputArray[i+1]): maximum;
    return maximum;
}

