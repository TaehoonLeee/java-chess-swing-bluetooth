package chess;

public class Queen extends BasePiece {

    public Queen() {
        super();
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        boolean axis;
        boolean QueenStraightWay = startRow == desRow ^ startColumn == desColumn;
        boolean QueenDiagonalWay = startRow != desRow && startColumn != desColumn;

        if (QueenStraightWay) //XOR If ONE of these conditions match (if both true or false then false is returned)
        {
            axis = true; //Moving straight along axis
        } else if (QueenDiagonalWay) {
            axis = false; //Moving diagonal
        } else {

            strErrorMsg = "Queen can move in a straight line in any direction";
            return false;

        }

        boolean ret = axis ? checkStraightMove(startRow, startColumn, desRow, desColumn, playerMatrix) : checkDiagonalMove(startRow, startColumn, desRow, desColumn, playerMatrix);

        return ret;
    }
}
