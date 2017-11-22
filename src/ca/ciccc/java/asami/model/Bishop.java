package ca.ciccc.java.asami.model;

/**
 * Lab3 Bishop class
 * 
 * @author tanii_asami
 *
 */
public class Bishop extends ChessPiece {
	/**
	 * Bishop constructor
	 */
	public Bishop() {
		super(3);
	}

	/**
	 * how Bishop moves
	 */
	@Override
	public void move() {
		System.out.println("diagonally");
	}

	@Override
	public String toString() {
		return "Bishop [getValue()=" + getValue() + "]";
	}

}
