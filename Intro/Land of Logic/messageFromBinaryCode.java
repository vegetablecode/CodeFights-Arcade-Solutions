String messageFromBinaryCode(String code) {
    StringBuilder message = new StringBuilder();
    for(int i=0; i<code.length(); i+=8)
        message.append(getLetter(code.substring(i, i+8)));
    return message.toString();
}

char getLetter(String letter) {
    int sumLetter = 0; 
    int[] bit = {128, 64, 32, 16, 8, 4, 2, 1};
    for(int i=0; i<8; i++)
        sumLetter+=bit[i]*Character.getNumericValue(letter.charAt(i));
    return (char)sumLetter;
}

