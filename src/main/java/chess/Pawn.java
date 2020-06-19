package chess;

public class Pawn extends BasePiece {

    public Pawn(LegalMove _legalMove) {
        super(_legalMove);
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        if ( !legalMove.legalMove(startRow, startColumn, desRow, desColumn, playerMatrix, currentPlayer) ) {
            strErrorMsg = "Can not move in that Cell";
            return false;
        }
        else {
            finalDesRow = desRow;
            finalDesColumn = desColumn;

            return true;
        }
    }
}	