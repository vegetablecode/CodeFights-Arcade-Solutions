bool checkPalindrome(std::string inputString) {
    int n = inputString.length();
    for(int i=0; i<n; i++){
        if(inputString[i] != inputString[n-1])
            return false;
        else n--;
    } return true;
}

