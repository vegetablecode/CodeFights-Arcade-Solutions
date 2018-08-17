int[] extractEachKth(int[] inputArray, int k) {
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<inputArray.length; i++)
        if((i+1)%k!=0)
            list.add(inputArray[i]);
    int[] outputArray = new int[list.size()];
    for(int i=0; i<list.size(); i++)
        outputArray[i] = list.get(i);
    return outputArray;
}

