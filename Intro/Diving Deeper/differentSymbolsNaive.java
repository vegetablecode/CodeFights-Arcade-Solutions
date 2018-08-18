int differentSymbolsNaive(String s) {
    char[] symbols = s.toCharArray();
    int counter = 0;
    for(int i=0; i<symbols.length; i++)
        if(symbols[i] != '.')
            for(int j=i+1; j<symbols.length; j++)
                if(symbols[i] == symbols[j])
                    symbols[j] = '.';
    for(int i=0; i<symbols.length; i++)
        if(symbols[i]!='.') counter++;
    return counter;
}


