int[][] minesweeper(boolean[][] matrix) {
int fields[][] = new int[matrix.length][];
	    for(int i=0; i<matrix.length; i++)
	        fields[i] = new int[matrix[0].length];
	    
	    for(int i=0; i<fields.length; i++) {
			for(int j=0; j<fields[0].length; j++) {
				if(i>0) {
	                if(j>0)
	                    if(matrix[i-1][j-1]==true) fields[i][j]++;
	                if(j<fields[0].length-1)
	                    if(matrix[i-1][j+1]==true) fields[i][j]++;
	                if(matrix[i-1][j]==true) fields[i][j]++;
	            }
				if(i<matrix.length-1) {
	                if(j>0)
	                    if(matrix[i+1][j-1]==true) fields[i][j]++;
	                if(j<fields[0].length-1)
	                    if(matrix[i+1][j+1]==true) fields[i][j]++;
	                if(matrix[i+1][j]==true) fields[i][j]++;
	            }
	            if(j>0)
	                if(matrix[i][j-1]==true) fields[i][j]++;
	            if(j<fields[0].length-1)
	                if(matrix[i][j+1]==true) fields[i][j]++;
			}
		}
    
    return fields;
}

