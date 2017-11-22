package ca.ciccc.java.asami.model;

/**
 * Lab3 Rock class
 * 
 * @author tanii_asami
 *
 */
public class Rook extends ChessPiece {
	/**
	 * Rock constructor
	 */
	public Rook() {
		super(5);
	}

	/**
	 * how Rock moves
	 */
	@Override
	public void move() {
		System.out.println("horizontally or vertically");
	}

	@Override
	public String toString() {
		return "Rook [getValue()=" + getValue() + "]";
	}

}
