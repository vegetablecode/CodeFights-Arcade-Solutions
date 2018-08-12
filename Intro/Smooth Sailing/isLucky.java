boolean isLucky(int n) {
    int firstHalf = 0, secondHalf = 0;
    String s = String.valueOf(n);
    
    for(int i=0; i<s.length()/2; i++)
        firstHalf+=getDigit(s.charAt(i));
    for(int i=s.length()/2; i<s.length(); i++)
        secondHalf+=getDigit(s.charAt(i));
    
    if(firstHalf==secondHalf)
        return true;
    else return false;
}

int getDigit(char s){
    int digit = s-'0';
    return digit;
}
