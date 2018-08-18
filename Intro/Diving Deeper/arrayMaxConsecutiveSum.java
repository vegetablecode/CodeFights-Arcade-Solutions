int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int maxSum = 0, tempSum = 0;
    for(int i=0; i<=inputArray.length-k; i++) {
        tempSum = 0;
        for(int j=i; j<i+k; j++) {
            tempSum+=inputArray[j];
        }
        maxSum = (tempSum>maxSum)? tempSum: maxSum;
    }
    return maxSum;
}

