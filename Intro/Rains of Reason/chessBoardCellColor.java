boolean chessBoardCellColor(String cell1, String cell2) {
    int c1 = cell1.charAt(0), r1 = cell1.charAt(1);
    int c2 = cell2.charAt(0), r2 = cell2.charAt(1);
    return (((c1%2==c2%2)&&(r1%2!=r2%2))||((c1%2!=c2%2)&&(r1%2==r2%2)))? false: true;
}

