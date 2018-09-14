int arrayPacking(int[] a) {
    String[] numbers = new String[a.length];
    StringBuilder sum = new StringBuilder();
    for(int i=0; i<a.length; i++)
        numbers[i] = String.format("%8s", Integer.toBinaryString(a[i])).replace(' ', '0');
    Collections.reverse(Arrays.asList(numbers));
    for(int i=0; i<a.length; i++)
        sum.append(numbers[i]);
    
    return Integer.parseInt(sum.toString(), 2);
}

