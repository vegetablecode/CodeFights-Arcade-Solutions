boolean almostIncreasingSequence(int[] sequence) {
    int counter = 0;
    for(int i=0; i<sequence.length-1; i++){
        if(sequence[i]<sequence[i+1]){
            continue;
        } else{
            counter++;
            if((i>0)&(i<sequence.length-2)&&(sequence[i]>=sequence[i+2])){
                counter++;
                if(sequence[i-1]>=sequence[i+1]){
                    counter++;
                } else counter--;
            }
        } 
    }
    if(counter<2) return true;
    return false;
}

