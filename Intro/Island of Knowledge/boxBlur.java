int[][] boxBlur(int[][] image) {

    int length = image[0].length-2;
    int height = image.length-2;
    int[][] blured = new int[height][];
    
    for(int i=0; i<height; i++){
        blured[i] = new int [length];
        for(int j=0; j<length; j++) {
            blured[i][j] = image[i][j] + image[i][j+1] + image[i][j+2] +
                      image[i+1][j] + image[i+1][j+1] + image[i+1][j+2] +
                      image[i+2][j] + image[i+2][j+1] + image[i+2][j+2];
            blured[i][j]/=9;
        }
    }
    return blured;
}

