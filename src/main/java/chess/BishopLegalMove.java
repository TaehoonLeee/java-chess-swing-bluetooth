package chess;

public class BishopLegalMove implements LegalMove {

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        boolean BishopsStraightWay = (startRow == desRow || startColumn == desColumn);

        if (BishopsStraightWay) return false;
        else return true;
    }

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return false;
    }
}