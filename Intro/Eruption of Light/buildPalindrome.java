String buildPalindrome(String st) {
    for(int i=0; i<st.length(); i++) {
        if(isPalindrome(st.substring(i, st.length()))==true) {
            String str = getNRev(i, st);
            return str;
        }
    }
    return "";
}

boolean isPalindrome(String str) {
    int index = str.length()-1;
    for(int i=0; i<str.length(); i++) {
        if(str.charAt(i)!=str.charAt(index))
            return false;
        index--;
    }
    return true;
}

String getNRev(int index, String str) {
    StringBuilder word = new StringBuilder(str);
    int counter = 0;
    for(int i=index-1; i>=0; i--) {
        word.append(str.charAt(i));
    }
    return word.toString();
}

