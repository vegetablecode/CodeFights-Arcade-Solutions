String longestWord(String text) {
        String patternString = "[A-Za-z]{1,50}";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        String word = "";
        
        int count = 0;
        while(matcher.find()) {
                count++;
                System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
                String tempWord = text.substring(matcher.start(), matcher.end());
                if(tempWord.length()>word.length())
                        word = tempWord;
        }     
    return word;
}
