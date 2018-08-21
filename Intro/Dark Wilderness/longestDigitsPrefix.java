String longestDigitsPrefix(String inputString) {
    String tempNumber = "";
    for(int i=0; i<inputString.length(); i++) {
        if(isCharADigit(inputString.charAt(i))&&(inputString.charAt(i) != ' '))
            tempNumber+=inputString.charAt(i);
        else break;
    }
    return tempNumber;
}

boolean isCharADigit(char a) {
    return (((a<='9')&&(a>='0')))? true: false;
}

