package chess;

public class Bishop extends BasePiece {

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        boolean BishopsStraightWay = (startRow == desRow || startColumn == desColumn);

        if (BishopsStraightWay) //If moved straight
        {
            strErrorMsg = "Bishop can only move along diagonal lines";
            return false;
        }
        return checkMoveStraightDiagonal(startRow, startColumn, desRow, desColumn, playerMatrix, false);

    }
}
