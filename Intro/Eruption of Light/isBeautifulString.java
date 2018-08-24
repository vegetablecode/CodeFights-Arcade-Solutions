boolean isBeautifulString(String inputString) {
    String letters = "abcdefghijklmnoprstuvwxyz";
    int[] counters = new int[letters.length()];
    int prev = 0;
    for(int i=0; i<inputString.length(); i++)
        for(int j=0; j<letters.length(); j++)
            if(letters.charAt(j)==inputString.charAt(i))
                counters[j]++;
    prev = counters[0];
    for(int i=0; i<letters.length(); i++) {
        if(counters[i]>0)
            if(prev<counters[i]) return false;
        prev = counters[i];
    }
    return true;
}

