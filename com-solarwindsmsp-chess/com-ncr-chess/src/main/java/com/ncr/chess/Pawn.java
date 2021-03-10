package com.ncr.chess;

/**
 * @author Ravi Shankar
 * This is the Pawn class
 */

public class Pawn {

	/**
	 * ChessBoard Object - To get the ChessBoard Object in-order to get all pieces info
	 */
	private ChessBoard chessBoard;
	
	
	/**
	 * X - coordinate  : Position of Pawn with respect to Width
	 */
	private int xCoordinate;
	
	
	/**
	 * Y - coordinate  : Position of Pawn with respect to Height
	  */
	private int yCoordinate;
	
	
	/**
	 * pieceColor - To identify the piece Color
	 */
	private PieceColor pieceColor;

	
	/**
	 * Constructor
	 * @param pieceColor - while creating an object of Pawn, we should instantiate Piece Color of that Pawn
	 */
	public Pawn(PieceColor pieceColor) {
		this.pieceColor = pieceColor;
	}

	
	/**
	 * @return 
	 * returns ChessBoard Object
	 */
	public ChessBoard getChessBoard() {
		return chessBoard;
	}

	/**
	 * @param chessBoard
	 * ChessBoard Object should be given while setting the ChessBoard Object
	 */
	public void setChessBoard(ChessBoard chessBoard) {
		this.chessBoard = chessBoard;
	}

	/**
	 * @return 
	 * returns X - Coordinate
	 */
	public int getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * @param value
	 * X coordinate value is given as value
	 */
	public void setXCoordinate(int value) {
		this.xCoordinate = value;
	}

	/**
	 * @return 
	 * returns Y - Coordinate
	 */
	public int getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * @param value
	 * Y coordinate value is given as value
	 */
	public void setYCoordinate(int value) {
		this.yCoordinate = value;
	}

	
	/**
	 * @return 
	 * returns PieceColor Of the Pawn
	 */
	public PieceColor getPieceColor() {
		return this.pieceColor;
	}

	/**
	 * @param value
	 * Piece Color of the Pawn is given as value
	 */
	private void setPieceColor(PieceColor value) {
		pieceColor = value;
	}

	/**
	 * @param movementType - Describes the type of movement of the Pawn either move or capture
	 * @param newX :  new X - coordinate of the piece for which the Pawn is going to Move
	 * @param newY :  new Y - coordinate of the piece for which the Pawn is going to Move
	 */
	public void move(MovementType movementType, int newX, int newY) {
		if (movementType.equals(MovementType.MOVE)) {

			if (this.getPieceColor().equals(PieceColor.BLACK) && (this.xCoordinate-1)==newX && this.yCoordinate==newY ){
				this.setXCoordinate(newX);
				this.setYCoordinate(newY);
				}
			else if (this.getPieceColor().equals(PieceColor.WHITE) && (this.xCoordinate)==(newX-1) && this.yCoordinate==newY ){
				this.setXCoordinate(newX);
				this.setYCoordinate(newY);
			}
		}
	}

	@Override
	public String toString() {
		return getCurrentPositionAsString();
	}

	protected String getCurrentPositionAsString() {
		String eol = System.lineSeparator();
		return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate,
				pieceColor);
	}
}
