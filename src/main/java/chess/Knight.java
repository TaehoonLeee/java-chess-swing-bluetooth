package chess;

public class Knight extends BasePiece {

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        finalDesRow = desRow;
        finalDesColumn = desColumn;
        strErrorMsg = "Knight can only move in a L shape";

        int n=0;

        boolean twoNoneE = (desRow == (startRow - 2) && desColumn == (startColumn - 1));
        boolean twoNoneW = (desRow == (startRow - 2) && desColumn == (startColumn + 1));
        boolean twoSoneE = (desRow == (startRow + 2) && desColumn == (startColumn - 1));
        boolean twoSoneW = (desRow == (startRow + 2) && desColumn == (startColumn + 1));
        boolean oneNtwoE = (desRow == (startRow - 1) && desColumn == (startColumn - 2));
        boolean oneNtwoW = (desRow == (startRow - 1) && desColumn == (startColumn + 2));
        boolean oneStwoE = (desRow == (startRow + 1) && desColumn == (startColumn - 2));
        boolean oneStwoW = (desRow == (startRow + 1) && desColumn == (startColumn + 2));


        if (twoNoneE) //2N, 1E
            return true;
        else if (twoNoneW) //2N, 1W
            return true;
        else if (twoSoneE) //2S, 1E
            return true;
        else if (twoSoneW) //2S, 1W
            return true;
        else if (oneNtwoE) //1N, 2E
            return true;
        else if (oneNtwoW) //1N, 2W
            return true;
        else if (oneStwoE) //1S, 2E
            return true;
        else if (oneStwoW) //1S, 2W
            return true;
        return false;

    }

}