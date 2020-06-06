package chess;

public class KnightLegalMove implements LegalMove {
    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        return false;
    }

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        boolean Knight2N1E = (desRow == (startRow - 2) && desColumn == (startColumn - 1));
        boolean Knight2N1W = (desRow == (startRow - 2) && desColumn == (startColumn + 1));
        boolean Knight2S1E = (desRow == (startRow + 2) && desColumn == (startColumn - 1));
        boolean Knight2S1W = (desRow == (startRow + 2) && desColumn == (startColumn + 1));
        boolean Knight1N2E = (desRow == (startRow - 1) && desColumn == (startColumn - 2));
        boolean Knight1N2W = (desRow == (startRow - 1) && desColumn == (startColumn + 2));
        boolean Knight1S2E = (desRow == (startRow + 1) && desColumn == (startColumn - 2));
        boolean Knight1S2W = (desRow == (startRow + 1) && desColumn == (startColumn + 2));

        boolean KnightCanGo =
                Knight2N1E || Knight2N1W || Knight2S1E || Knight2S1W || Knight1N2E || Knight1N2W || Knight1S2E || Knight1S2W;

        return KnightCanGo;
    }
}
