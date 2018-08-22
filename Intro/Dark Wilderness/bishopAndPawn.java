boolean bishopAndPawn(String bishop, String pawn) {
    double distX, distY;
    distX = Math.abs(getX(bishop)-getX(pawn));
    distY = Math.abs(getY(bishop)-getY(pawn));
    return (distX==distY)? true: false;
}

int getX(String pos) {
    return (int)pos.charAt(0)-97;
}

int getY(String pos) {
    return (int)pos.charAt(1)-49;
}

