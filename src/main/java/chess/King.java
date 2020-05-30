package chess;

public class King extends BasePiece {

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        finalDesRow = desRow;
        finalDesColumn = desColumn;

        boolean S = (desRow == (startRow + 1) && desColumn == startColumn);
        boolean SW = (desRow == (startRow + 1) && desColumn == (startColumn - 1));
        boolean W = (desRow == startRow && desColumn == startColumn - 1);
        boolean NW = (desRow == (startRow - 1) && desColumn == (startColumn - 1));
        boolean N = (desRow == (startRow - 1) && desColumn == startColumn);
        boolean NE = (desRow == (startRow - 1) && desColumn == (startColumn + 1));
        boolean E = (desRow == startRow && desColumn == (startColumn + 1));
        boolean SE = (desRow == (startRow + 1) && desColumn == (startColumn + 1));

        if (S) //S
            return true;
        else if (SW) //SW
            return true;
        else if (W) //W
            return true;
        else if (NW) //NW
            return true;
        else if (N) //N
            return true;
        else if (NE) //NE
            return true;
        else if (E) //E
            return true;
        else if (SE) //SE
            return true;
        else {
            strErrorMsg = "King can only move one space in any direction";
            return false;
        }
    }
}