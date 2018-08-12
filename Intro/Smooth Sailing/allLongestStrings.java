String[] allLongestStrings(String[] inputArray) {
    
    int maxLength = 0;
    int reps = 1;

    for(int i=0; i<inputArray.length; i++){
        if(inputArray[i].length()>maxLength){
            maxLength = inputArray[i].length();
            reps = 1;
        }
        else if(inputArray[i].length()==maxLength)
            reps++;
    }
    
    String[] outputArray = new String[reps];
    int counter = 0;
    
    for(int i=0; i<inputArray.length; i++){
        if(inputArray[i].length()==maxLength){
            outputArray[counter] = inputArray[i];
            counter++;
        }
    }
    
    return outputArray;
}

