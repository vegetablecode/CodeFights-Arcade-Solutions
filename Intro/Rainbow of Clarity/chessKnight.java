// btw check my a* search algorithm for knights movement
// https://github.com/vegetablecode/A-Star-Search-Algorithm

int chessKnight(String cell) {
 int i = getX(cell), cols = 8;
 int j = getY(cell), rows = 8;
 int counter = 0;

 // top-right
 if ((i < cols - 1) && (j > 1)) {
    counter++;
 }
 if ((i < cols - 2) && (j > 0)) {
    counter++;
 }

 // top-left
 if ((i > 0) && (j > 1)) {
    counter++;
 }
 if ((i > 1) && (j > 0)) {
    counter++;
 }

 // bottom-right
 if ((i < cols - 1) && (j < rows - 2)) {
    counter++;
 }
 if ((i < cols - 2) && (j < rows - 1)) {
    counter++;
 }

 // bottom-left
 if ((i > 0) && (j < rows - 2)) {
    counter++;
 }
 if ((i > 1) && (j < rows - 1)) {
    counter++;
 }

 return counter;
}

int getX(String pos) {
   return (int) pos.charAt(0) - 97;
}

int getY(String pos) {
   return (int) pos.charAt(1) - 49;
}
