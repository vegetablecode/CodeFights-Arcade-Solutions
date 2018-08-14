String alphabeticShift(String inputString) {
    String newStr = "";
    for(int i=0; i<inputString.length(); i++)
        newStr+=((inputString.charAt(i)=='z')? 'a': (char)(inputString.charAt(i)+1));
    return (String)newStr;
}

