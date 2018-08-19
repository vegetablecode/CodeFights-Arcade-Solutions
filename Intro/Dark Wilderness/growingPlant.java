int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int height = 0, counter = 0;
    while(height<desiredHeight) {
        height+=upSpeed;
        counter++;
        if(height<desiredHeight)
            height-=downSpeed;
    }
    
    return counter;
}

