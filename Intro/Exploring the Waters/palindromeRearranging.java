boolean palindromeRearranging(String inputString) {
    String letters = "abcdefghijklmnoprstuvwxyz";
    int[] repetitions = new int[letters.length()];
    int odd = 0;
    for(int i=0; i<letters.length(); i++) {
        for(int j=0; j<inputString.length(); j++)
            repetitions[i] += (letters.charAt(i)==inputString.charAt(j))? 1: 0;
        odd += (repetitions[i]%2!=0)? 1: 0;
    }
    return (odd>1)? false: true;
}

