int[] sortByHeight(int[] a) {
    
    int b[] = new int[a.length];
    int counter = 0;
    
    for(int i=0; i<a.length; i++){
        if(a[i]!=-1){
            b[counter] = a[i];
            counter++;
        }
    }
    
    sort(b, 0, counter-1);
    
    counter = 0;
    for(int i=0; i<a.length; i++){
        if(a[i]!=-1){
            a[i] = b[counter];
            counter++;
        }
    }
    
    return a;
}

void sort(int[] a, int left, int right){
        if (left < right){
            int pivot = a[right];
            int pos = left - 1;
            for (int i = left; i < right; i++)
                if (a[i] <= pivot)
                    Swap(a, ++pos, i);
            Swap(a, pos + 1, right);
            sort(a, left, pos);
            sort(a, pos + 1, right);
        }

    }

void Swap(int[] a, int i, int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
