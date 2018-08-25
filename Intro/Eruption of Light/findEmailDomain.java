String findEmailDomain(String address) {
        String patternString = "@([^@]){1,50}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(address);
        String domain = "";
        
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
            domain = address.substring(matcher.start()+1, matcher.end());
        }
                
    return domain;
}

