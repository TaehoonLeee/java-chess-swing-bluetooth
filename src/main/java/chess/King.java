package chess;

public class King extends BasePiece {

    public King(LegalMove _legalMove) {
        super(_legalMove);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        if( legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix) ) {
            finalDesRow = desRow;
            finalDesColumn = desColumn;

            return true;
        }
        else {
            strErrorMsg = "King can only move one space in any direction";

            return false;
        }
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix, currentPlayer);
    }
}