package com.ncr.chess;


/**
 * @author Kadali Ravi Shankar
 *	ChessBoard class 
 */

public class ChessBoard {

    /**
     * Stores maximum board width
     */
    public static int MAX_BOARD_WIDTH = 7;
    
    
    /**
     * Stores maximum board height
     */
    public static int MAX_BOARD_HEIGHT = 7;
    
    
    

    /**
     * 2-D array similar to 2d array of ChessBoard blocks 
     * Each Piece will occupy one index
     * Here we are using Pawn as the logic is limited to Pawns in a ChessBoard
     */
    private Pawn[][] pieces;

    
    /**
     * Whenever a ChessBoard object is created, it will create ChessBoard with given Max Width and Max Height
     */
    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    
    
    /**
     * @param pawn - is the pawn that we are going to add in ChessBoard
     * @param xCoordinate -  is the x- coordinate of given Pawn
     * @param yCoordinate - is the y- coordinate of given Pawn
     * @param pieceColor - is the Pawn colour either Black or White
     */
    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
    	
    	if(pieceColor.equals(PieceColor.BLACK) && xCoordinate==6 && yCoordinate>=0 && yCoordinate<8 && pieces[xCoordinate][yCoordinate]==null) {
    			pawn.setXCoordinate(xCoordinate);
    			pawn.setYCoordinate(yCoordinate);
    			pieces[xCoordinate][yCoordinate] = pawn;
    	}
    	else if(pieceColor.equals(PieceColor.WHITE) && xCoordinate==1 && yCoordinate>=0 && yCoordinate<8 && pieces[xCoordinate][yCoordinate]==null) {
    			pawn.setXCoordinate(xCoordinate);
    			pawn.setYCoordinate(yCoordinate);
    			pieces[xCoordinate][yCoordinate] = pawn;
    	}
    	else {
    		pawn.setXCoordinate(-1);
			pawn.setYCoordinate(-1);
    	}
    	
    }

    
    /**
     * @param xCoordinate - is the x- coordinate on the ChessBoard
     * @param yCoordinate - is the y- coordinate on the ChessBoard
     * @return - whether the given position is true or false
     */
    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
    	if(xCoordinate<=MAX_BOARD_WIDTH && xCoordinate>=0  && yCoordinate<=MAX_BOARD_WIDTH && yCoordinate>=0) return true;
    	else return false;
    	}
}
