public static List<String> list;

boolean stringsRearrangement(String[] inputArray) {
    list = new ArrayList<String>();
    permute(inputArray);
    
    for(int i=0; i<inputArray.length*factorial(inputArray.length); i+=inputArray.length)
        if(checkDiff(list.subList(i, i+inputArray.length)))
            return true;
    return false;
}

public static void permute(String[] arr){
    permuteHelper(arr, 0);
}

private static void permuteHelper(String[] array, int index){
   // last element -> nothing to permute
   if(index >= array.length - 1){
        for(int i = 0; i < array.length - 1; i++){
            list.add(array[i]);
        }
        if(array.length > 0) 
            list.add(array[array.length-1]);
        return;
    }

    // for each index in the sub array arr[index...end]
    for(int i=index; i<array.length; i++){

        // swap the elements at indices index and i
        String t = array[index];
        array[index] = array[i];
        array[i] = t;

        // recurse on the sub array arr[index+1...end]
        permuteHelper(array, index+1);

        // swap the elements back
        t = array[index];
        array[index] = array[i];
        array[i] = t;
    }
}

boolean checkDiff(List<String> plist) {
    for(int i=0; i<plist.size()-1; i++) {
       if(oneCharDiff(plist.get(i), plist.get(i+1)) == false)
           return false;
    }
    return true;
}

int factorial(int i) {
    if(i<1)
        return 1;
    else return i*factorial(i-1);
}

boolean oneCharDiff(String s1, String s2) {
    int counter = 0;
    for(int i=0; i<s1.length(); i++) {
        if(s1.charAt(i)!=s2.charAt(i))
            counter++;
    }
    return (counter==1)? true: false;
}
