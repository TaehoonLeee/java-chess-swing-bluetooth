package chess;

public class King extends BasePiece {

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        finalDesRow = desRow;
        finalDesColumn = desColumn;

        boolean KingS = (desRow == (startRow + 1) && desColumn == startColumn);
        boolean KingSW = (desRow == (startRow + 1) && desColumn == (startColumn - 1));
        boolean KingW = (desRow == startRow && desColumn == startColumn - 1);
        boolean KingNW = (desRow == (startRow - 1) && desColumn == (startColumn - 1));
        boolean KingN = (desRow == (startRow - 1) && desColumn == startColumn);
        boolean KingNE = (desRow == (startRow - 1) && desColumn == (startColumn + 1));
        boolean KingE = (desRow == startRow && desColumn == (startColumn + 1));
        boolean KingSE = (desRow == (startRow + 1) && desColumn == (startColumn + 1));

        if (KingS) //S
            return true;
        else if (KingSW) //SW
            return true;
        else if (KingW) //W
            return true;
        else if (KingNW) //NW
            return true;
        else if (KingN) //N
            return true;
        else if (KingNE) //NE
            return true;
        else if (KingE) //E
            return true;
        else if (KingSE) //SE
            return true;
        else {
            strErrorMsg = "King can only move one space in any direction";
            return false;
        }
    }
}