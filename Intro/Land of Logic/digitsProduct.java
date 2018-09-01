int digitsProduct(int product) {
    int result = 0;
    while(result<10000) {
        result++;
        if(product==getProduct(result))
            return result;
    }
    return -1;
}

int getProduct(int number) {
    int divider = 1, result = 1;
    while(divider<=number) {
        result*=number/divider%10;
        divider*=10;
    }
    return result;
}
