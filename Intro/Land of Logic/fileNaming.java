String[] fileNaming(String[] names) {
    List<String> newNames = new ArrayList<>();
    for(int i=0; i<names.length; i++) {
        String tempName = names[i];
        int reps = wordReps(newNames, tempName, names, i);
        if(reps>0)
            tempName = names[i] + "(" + reps + ")";
        while(wordReps(newNames, tempName, names, i)>0) {
            reps++;
            tempName = names[i] + "(" + reps + ")";
        }
        newNames.add(tempName);
    }
    return newNames.toArray(new String[newNames.size()]);
}

int wordReps(List<String> words, String word, String[] names, int index) {
    int counter = 0, nameCounter = 0;
    for(int i=0; i<index; i++)
        if(names[i].equals(word)) nameCounter++;
    for(int i=0; i<words.size(); i++)
        if(words.get(i).equals(word)) counter++;
    return (counter>nameCounter)? counter: nameCounter;
}
