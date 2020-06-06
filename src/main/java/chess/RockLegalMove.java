package chess;

public class RockLegalMove implements LegalMove {
    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        boolean RockDiagonalWay=startRow != desRow && startColumn != desColumn;

        if (RockDiagonalWay) //If moved diagonal
        {
            return false;
        }

        return true;
    }

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return false;
    }
}
