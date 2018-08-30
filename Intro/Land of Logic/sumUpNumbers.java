int sumUpNumbers(String inputString) {
    String patternString = "\\d{1,60}";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(inputString);
    String number = "";
    int sum = 0;
    
        while(matcher.find())
            sum += Integer.parseInt(inputString.substring(matcher.start(), matcher.end()));
    
    return sum;
}

