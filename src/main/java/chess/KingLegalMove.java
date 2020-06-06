package chess;

public class KingLegalMove implements LegalMove {
    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        boolean KingSouth = (desRow == (startRow + 1) && desColumn == startColumn);
        boolean KingSouthWest = (desRow == (startRow + 1) && desColumn == (startColumn - 1));
        boolean KingWest = (desRow == startRow && desColumn == startColumn - 1);
        boolean KingNorthWest = (desRow == (startRow - 1) && desColumn == (startColumn - 1));
        boolean KingNorth = (desRow == (startRow - 1) && desColumn == startColumn);
        boolean KingNorthEast = (desRow == (startRow - 1) && desColumn == (startColumn + 1));
        boolean KingEast = (desRow == startRow && desColumn == (startColumn + 1));
        boolean KingSouthEast = (desRow == (startRow + 1) && desColumn == (startColumn + 1));

        boolean KingCanGo =
                KingSouth || KingSouthWest || KingWest || KingNorthWest || KingNorth || KingNorthEast || KingEast || KingSouthEast;

        return KingCanGo;
    }

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        return false;
    }
}
