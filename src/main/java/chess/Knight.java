package chess;

public class Knight extends BasePiece {

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        finalDesRow = desRow;
        finalDesColumn = desColumn;
        strErrorMsg = "Knight can only move in a L shape";

        int n=0;

        boolean Knight2N1E = (desRow == (startRow - 2) && desColumn == (startColumn - 1));
        boolean Knight2N1W = (desRow == (startRow - 2) && desColumn == (startColumn + 1));
        boolean Knight2S1E = (desRow == (startRow + 2) && desColumn == (startColumn - 1));
        boolean Knight2S1W = (desRow == (startRow + 2) && desColumn == (startColumn + 1));
        boolean Knight1N2E = (desRow == (startRow - 1) && desColumn == (startColumn - 2));
        boolean Knight1N2W = (desRow == (startRow - 1) && desColumn == (startColumn + 2));
        boolean Knight1S2E = (desRow == (startRow + 1) && desColumn == (startColumn - 2));
        boolean Knight1S2W = (desRow == (startRow + 1) && desColumn == (startColumn + 2));


        if (Knight2N1E) //2N, 1E
            return true;
        else if (Knight2N1W) //2N, 1W
            return true;
        else if (Knight2S1E) //2S, 1E
            return true;
        else if (Knight2S1W) //2S, 1W
            return true;
        else if (Knight1N2E) //1N, 2E
            return true;
        else if (Knight1N2W) //1N, 2W
            return true;
        else if (Knight1S2E) //1S, 2E
            return true;
        else if (Knight1S2W) //1S, 2W
            return true;
        return false;

    }

}