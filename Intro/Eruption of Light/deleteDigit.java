int deleteDigit(int n) {
    int divider = 1, counter = 0, maxNumber = 0;
    List<Integer> numbers = new ArrayList<>();
    while(divider<=n) {
        numbers.add(n/divider%10);
        divider*=10; counter++;
    }
    for(int i=0; i<counter; i++) {
        int tempNumber = 0, tempDivider = 1;
        for(int j=0; j<counter; j++)
            if(j!=i) {tempNumber+=numbers.get(j)*tempDivider; tempDivider*=10;}
        if(tempNumber>maxNumber) maxNumber = tempNumber;
    }
    return maxNumber;
}

