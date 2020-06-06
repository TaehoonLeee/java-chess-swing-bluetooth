package chess;

public class PawnLegalMove implements LegalMove {
    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer) {
        boolean legalMove = true;
        int[] playerPawnStart = {6, 1};

        boolean PawnWrongWay = (currentPlayer == 1 && desRow >= startRow) || (currentPlayer == 2 && desRow <= startRow);
        boolean PawnSideWay = desColumn != startColumn;
        boolean PawnMoveOne = (desColumn > startColumn && desColumn == (startColumn + 1)) || (desColumn < startColumn && desColumn == (startColumn - 1));
        boolean CellisEmpty = playerMatrix[desRow][desColumn] == 0;
        boolean PawnMoveDiagonal = (desRow == (startRow + 1) && currentPlayer == 2) || (desRow == (startRow - 1) && currentPlayer == 1);
        boolean PawnMoveMore = (currentPlayer == 1 && desRow < (startRow - 1)) || (currentPlayer == 2 && desRow > (startRow + 1));
        boolean PawnMoveTwo = (currentPlayer == 1 && desRow == (startRow - 2)) || (currentPlayer == 2 && desRow == (startRow + 2));
        boolean NotPawnStartWay = playerPawnStart[currentPlayer - 1] != startRow;

        if (PawnWrongWay) //If moving in wrong direction
        {
            legalMove = false;

        } else if (PawnSideWay) //If moving sideways
        {

            if (PawnMoveOne) //If only moving one place side ways
            {

                if (PawnMoveDiagonal) {

                    if (CellisEmpty) //If cell is empty
                    {
                        legalMove = false;

                    }

                } else {
                    legalMove = false;

                }

            } else {
                legalMove = false;

            }

        } else if (PawnMoveMore) //If moved two or more places
        {

            if (PawnMoveTwo) //If moved two places
            {

                if (NotPawnStartWay) //If not at pawn starting place
                {
                    legalMove = false;

                }

            } else {
                legalMove = false;

            }

        } else if (desColumn == startColumn) {
            if (playerMatrix[desRow][desColumn] != 0) {
                legalMove = false;
            }

        }

        return legalMove;
    }

    @Override
    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
        return false;
    }
}
