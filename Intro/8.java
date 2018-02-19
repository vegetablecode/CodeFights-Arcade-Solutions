int matrixElementsSum(int[][] matrix) {
    
    boolean removeRooms = false;
    int sum = 0;
    
    for(int i=0; i<matrix[0].length; i++){
        for(int j=0; j<matrix.length; j++){
            if(removeRooms == true)
                matrix[j][i] = 0;
            else{
                if(matrix[j][i]==0) removeRooms = true;
            }
                
        }
        removeRooms = false;
    }
    
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            sum+=matrix[i][j];
        }
    }
    
    return sum;
}

