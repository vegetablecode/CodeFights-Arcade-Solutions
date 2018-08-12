boolean evenDigitsOnly(int n) {
    int i = 1;
    do{
        if(n/i%2!=0)
            return false;
    } while((i*=10)<=n);
    return true;
}

