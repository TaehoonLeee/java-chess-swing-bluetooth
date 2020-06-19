package chess;

public class Rock extends BasePiece {

    public Rock(LegalMove _legalMove) {
        super(_legalMove);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        if ( !legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix) ) {
            strErrorMsg = "Rock can only move Horiztonal or Vertical";

            return false;
        }

        return checkStraightMove(startRow, startColumn, desRow, desColumn, playerMatrix);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix, currentPlayer);
    }
}
