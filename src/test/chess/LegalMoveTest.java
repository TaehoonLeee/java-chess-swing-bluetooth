package chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LegalMoveTest {
    Bishop bishop;
    King king;
    Knight knight;
    Pawn pawn;
    Queen queen;
    Rock rock;
    int[][] playerMatrix;

    @Before
    public void setUp() {
        bishop = new Bishop(new BishopLegalMove());
        king = new King(new KingLegalMove());
        knight = new Knight(new KnightLegalMove());
        pawn = new Pawn(new PawnLegalMove());
        queen = new Queen();
        rock = new Rock(new RockLegalMove());
        playerMatrix = new int[8][8];

    }

    @Test
    public void BishopLegalMoveTest() {
        assertFalse(bishop.legalMove(0, 0, 0, 0, playerMatrix));
        assertTrue(bishop.legalMove(0, 0, 1, 1, playerMatrix));
        assertFalse(bishop.legalMove(0, 0, 1, 1, playerMatrix, 1));
    }

    @Test
    public void BishopBlockingMoveTest() {
        assertTrue(bishop.legalMove(0,0,2,2, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(bishop.legalMove(0,0,2,2, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(bishop.legalMove(2,2,0,0, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(bishop.legalMove(2,2,0,0, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(bishop.legalMove(2,0,0,2, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(bishop.legalMove(2,0,0,2, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(bishop.legalMove(0,2,2,0, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(bishop.legalMove(0,2,2,0, playerMatrix));
    }

    @Test
    public void KingLegalMoveTest() {
        assertFalse(king.legalMove(0,0,0,0, playerMatrix));
        assertFalse(king.legalMove(0,0,2,2, playerMatrix));
        assertFalse(king.legalMove(0,0,1,2, playerMatrix));
        assertTrue(king.legalMove(0,0,1,1, playerMatrix));
        assertFalse(king.legalMove(0,0,0,0, playerMatrix,1));
    }

    @Test
    public void KnightLegalMoveTest() {
        assertFalse(knight.legalMove(0, 0, 0, 0, playerMatrix));
        assertFalse(knight.legalMove(1,1,0,0, playerMatrix));
        assertFalse(knight.legalMove(0,0,1,1, playerMatrix));
        assertFalse(knight.legalMove(0, 0, 0, 0, playerMatrix, 1));
        assertTrue(knight.legalMove(2, 2, 0, 1, playerMatrix));
    }

    @Test
    public void PawnLegalMoveTest() {

    }

    @Test
    public void QueenLegalMoveTest() {
        assertTrue(queen.legalMove(0, 0, 1, 0, playerMatrix));
        assertTrue(queen.legalMove(0,0,1,1, playerMatrix));
        assertFalse(queen.legalMove(0,0,3,1, playerMatrix));
        assertFalse(queen.legalMove(0,0,1,2, playerMatrix));
        assertFalse(queen.legalMove(0,0,0,0, playerMatrix));
    }

    @Test
    public void QueenBlockDiagonalMoveTest() {
        assertTrue(queen.legalMove(0,0,2,2, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(queen.legalMove(0,0,2,2, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(queen.legalMove(2,2,0,0, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(queen.legalMove(2,2,0,0, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(queen.legalMove(2,0,0,2, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(queen.legalMove(2,0,0,2, playerMatrix));

        playerMatrix[1][1] = 0;
        assertTrue(queen.legalMove(0,2,2,0, playerMatrix));

        playerMatrix[1][1] = 1;
        assertFalse(queen.legalMove(0,2,2,0, playerMatrix));
    }

    @Test
    public void QueenBlockStraightMoveTest() {
        assertTrue(queen.legalMove(2,0,0,0, playerMatrix));

        playerMatrix[1][0] = 1;
        assertFalse(queen.legalMove(2,0,0,0, playerMatrix));

        playerMatrix[1][0] = 0;
        assertTrue(queen.legalMove(0,2,0,0, playerMatrix));

        playerMatrix[0][1] = 1;
        assertFalse(queen.legalMove(0,2,0,0, playerMatrix));

        playerMatrix[0][1] = 0;
        assertTrue(queen.legalMove(0,0,2,0, playerMatrix));

        playerMatrix[1][0] = 1;
        assertFalse(queen.legalMove(0,0,2,0, playerMatrix));

        playerMatrix[1][0] = 0;
        assertTrue(queen.legalMove(0,0,0,2, playerMatrix));

        playerMatrix[0][1] = 1;
        assertFalse(queen.legalMove(0,0,0,2, playerMatrix));
    }

    @Test
    public void RockLegalMoveTest() {
        assertFalse(rock.legalMove(0,0,0,0, playerMatrix));
        assertTrue(rock.legalMove(1,0,0,0, playerMatrix));
        assertFalse(rock.legalMove(0, 0, 1, 1, playerMatrix));
        assertFalse(rock.legalMove(0,0,0,1, playerMatrix,1));
    }

    @Test
    public void RockBlockingMoveTest() {
        assertTrue(rock.legalMove(2,0,0,0, playerMatrix));

        playerMatrix[1][0] = 1;
        assertFalse(rock.legalMove(2,0,0,0, playerMatrix));

        playerMatrix[1][0] = 0;
        assertTrue(rock.legalMove(0,2,0,0, playerMatrix));

        playerMatrix[0][1] = 1;
        assertFalse(rock.legalMove(0,2,0,0, playerMatrix));

        playerMatrix[0][1] = 0;
        assertTrue(rock.legalMove(0,0,2,0, playerMatrix));

        playerMatrix[1][0] = 1;
        assertFalse(rock.legalMove(0,0,2,0, playerMatrix));

        playerMatrix[1][0] = 0;
        assertTrue(rock.legalMove(0,0,0,2, playerMatrix));

        playerMatrix[0][1] = 1;
        assertFalse(rock.legalMove(0,0,0,2, playerMatrix));
    }

    @Test
    public void getPointTest() {
        king.legalMove(0,0,1,1, playerMatrix);

        assertEquals(1, king.getDesColumn());
        assertEquals(1, king.getDesRow());
    }

    @Test
    public void getErrorStringTest() {
        king.legalMove(0,0,2,2, playerMatrix);

        assertEquals("King can only move one space in any direction", king.getErrorMsg());
    }
}
