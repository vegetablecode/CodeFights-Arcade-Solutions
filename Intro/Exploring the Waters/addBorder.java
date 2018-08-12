String[] addBorder(String[] picture) {
    int size = picture[0].length()+2;
    
    String[] result = new String[picture.length+2];
    
    String topAndBottom = "";
    for(int i=0; i<size; i++){
        topAndBottom+="*";
    }
    result[0] = topAndBottom;
    result[result.length-1] = topAndBottom;
    
    for(int i=0; i<picture.length; i++){
        String tempStr = "*";
        tempStr+= picture[i];
        tempStr+= "*";
        result[i+1] = tempStr;
    }
    
    return result;
}

