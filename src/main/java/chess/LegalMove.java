package chess;

public interface LegalMove {
    boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix);
    boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer);
}