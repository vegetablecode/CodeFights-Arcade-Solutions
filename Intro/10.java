int commonCharacterCount(String s1, String s2) {
    
    int counter = 0;
    
    char[] str2 = s2.toCharArray();
    
    for(int i=0; i<s1.length(); i++){
        for(int j=0; j<str2.length; j++){
            if(s1.charAt(i)==str2[j]){
                counter++;
                str2[j] = '0';
                break;
            }
        }
    }
    return counter;
}

