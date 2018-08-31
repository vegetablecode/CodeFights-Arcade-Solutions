int differentSquares(int[][] matrix) {
    int counter = 0;
    List<String> squares = new ArrayList<>();
    for(int i=0; i<matrix.length-1; i++) {
        for(int j=0; j<matrix[0].length-1; j++) {
            String square = getSquare(matrix[i][j], matrix[i][j+1], matrix[i+1][j], matrix[i+1][j+1]);
            if(isSquareDifferent(squares, square)==true)
                counter++;
            squares.add(square);
        }
    }
    return counter;
}

String getSquare(int a, int b, int c, int d) {
    return Integer.toString(a) + Integer.toString(b) + Integer.toString(c) +Integer.toString(d);
}

boolean isSquareDifferent(List<String> squares, String square) {
    for(int i=0; i<squares.size(); i++)
        if(square.equals(squares.get(i)))
            return false;
    return true;
}

