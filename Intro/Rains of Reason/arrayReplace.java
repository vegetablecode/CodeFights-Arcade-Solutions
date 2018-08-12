int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    int[] array = new int[inputArray.length];
    for(int i=0; i<inputArray.length; i++)
        array[i] = (inputArray[i] == elemToReplace)? substitutionElem: inputArray[i];
    return array;
}

