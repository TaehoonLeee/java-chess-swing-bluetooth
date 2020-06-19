package chess;

public class Knight extends BasePiece {

    public Knight(LegalMove _legalMove) {
        super(_legalMove);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        finalDesRow = desRow;
        finalDesColumn = desColumn;
        strErrorMsg = "Knight can only move in a L shape";

        if( legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix) ) {
            strErrorMsg = "Knight can only move in a L shape";

            return true;
        }

        return false;
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix, currentPlayer);
    }

}