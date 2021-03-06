package chess;

public class Bishop extends BasePiece {

    public Bishop(LegalMove _legalMove) {
        super(_legalMove);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        if( !legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix) ) {
            strErrorMsg= "Bishop can only move along diagonal lines";

            return false;
        }

        return checkDiagonalMove(startRow, startColumn, desRow, desColumn, playerMatrix);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix, currentPlayer);
    }
}