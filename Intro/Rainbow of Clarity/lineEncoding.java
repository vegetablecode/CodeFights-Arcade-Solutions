String lineEncoding(String s) {
    StringBuilder encoded = new StringBuilder();
    int counter = 1;
    char lastLetter = s.charAt(0);
    for(int i=1; i<s.length(); i++) {
        if(s.charAt(i)==lastLetter) counter++;
        else {
            if(counter>1) encoded.append(counter);
            encoded.append(lastLetter);
            counter = 1;
            lastLetter = s.charAt(i);
        }
    }
    if(counter>1) encoded.append(counter);
    encoded.append(lastLetter);
    counter = 1;
    return encoded.toString();
}

