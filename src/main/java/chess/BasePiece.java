package chess;

enum Direction {NORTH, SOUTH, WEST, EAST, NORTHWEST, NORTHEAST, SOUTHWEST, SOUTHEAST, DIAGOANL}
/*********
 * class which contains a function checkMoveStraightDiagonal() which has shared (protected) variables
 * finalDesRow, finalDesColumn & strErrorMsg
 * this class is extended in all pieces classes-> [Piece].java
 */
abstract class BasePiece {

    protected int finalDesRow = 0;
    protected int finalDesColumn = 0;
    protected String strErrorMsg = "";
    //Method for checking the path to the destination and making sure nothing is in the way

    protected boolean checkStraightMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

        //Moving along a straight axis (rock, queen)
        Direction direction = getDirection(startRow, startColumn, desRow, desColumn);

        switch(direction) {
            case NORTH : {
                for (int newRow = (startRow - 1); newRow > desRow; newRow--) {
                    //Checks the cell is empty
                    if (checkAxisMove(newRow, desColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case SOUTH : {
                for (int newRow = (startRow + 1); newRow < desRow; newRow++) {
                    if (checkAxisMove(newRow, desColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case WEST : {
                for (int newColumn = (startColumn - 1); newColumn > desColumn; newColumn--) {
                    if (checkAxisMove(desRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case EAST : {
                for (int newColumn = (startColumn + 1); newColumn < desColumn; newColumn++) {
                    if (checkAxisMove(desRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case DIAGOANL : {
                strErrorMsg = "";
                return false;
            }
        }

        finalDesRow = desRow;
        finalDesColumn = desColumn;

        return true;
    }

    protected boolean checkDiagonalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {
    //Moving diagonal (bishop/queen)
        strErrorMsg = "The destination is not on the same diagonal line"; //Default error message
        int newColumn;

        Direction direction = getDirection(startRow, startColumn, desRow, desColumn);

        switch(direction) {
            case NORTHWEST : {
                for (int newRow = (startRow - 1); newRow > desRow; newRow--) {
                    newColumn = startColumn - (startRow - newRow);

                    if (checkAxisMove(newRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case NORTHEAST : {
                for (int newRow = (startRow - 1); newRow > desRow; newRow--) {
                    newColumn = startColumn + (startRow - newRow);

                    if (checkAxisMove(newRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case SOUTHWEST : {
                for (int newRow = (startRow + 1); newRow < desRow; newRow++) {
                    newColumn = startColumn - (newRow - startRow);

                    if (checkAxisMove(newRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case SOUTHEAST : {
                for (int newRow = (startRow + 1); newRow < desRow; newRow++) {
                    newColumn = startColumn + (newRow - startRow);

                    if (checkAxisMove(newRow, newColumn, playerMatrix)) {
                        return false;
                    }
                }
                break;
            }

            case DIAGOANL: {
                strErrorMsg = "";
                return false;
            }
        }

         return true;
    }

    private Direction getDirection(int startRow, int startColumn, int desRow, int desColumn) {
        Direction direction;

        if( (startColumn == desColumn) && (startRow != desRow)) {
            if( desRow < startRow) direction = Direction.NORTH;
            else direction = Direction.SOUTH;
        }
        else if( (startColumn != desColumn) && (startRow == desRow) ){
            if (desColumn < startColumn) direction = Direction.WEST;
            else direction = Direction.SOUTH;
        }
        else if( ((desRow < startRow) && (desColumn < startColumn)) && ((desRow - startRow) == (desColumn - startColumn)) ) {
            direction = Direction.NORTHWEST;
        }
        else if( ((desRow < startRow) && (desColumn < startColumn)) && ((desRow - startRow) == (startColumn - desColumn)) ) {
            direction = Direction.NORTHEAST;
        }
        else if( ((desRow < startRow) && (desColumn < startColumn)) && ((startRow - desRow) == (desColumn - startColumn)) ) {
            direction = Direction.SOUTHWEST;
        }
        else if( ((desRow < startRow) && (desColumn < startColumn)) && ((startRow - desRow) == (startColumn - desColumn)) ) {
            direction = Direction.SOUTHEAST;
        }
        else direction = Direction.DIAGOANL;

        return direction;
    }

    private boolean checkAxisMove(int newRow, int newColumn, int[][] playerMatrix) {

        if (playerMatrix[newRow][newColumn] != 0) //If not empty
        {
            strErrorMsg = "A piece is blocking the route"; //Error message
            return true;
        }

        return false;
    }

    public int getDesRow() {
        return finalDesRow;
    }

    public int getDesColumn() {
        return finalDesColumn;
    }

    public String getErrorMsg() {
        return strErrorMsg;
    }
}
