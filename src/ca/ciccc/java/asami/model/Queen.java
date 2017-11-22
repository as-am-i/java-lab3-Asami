package ca.ciccc.java.asami.model;

/**
 * Lab3 Queen class
 * 
 * @author tanii_asami
 *
 */
public class Queen extends ChessPiece {
	/**
	 * Queen class
	 */
	public Queen() {
		super(9);
	}

	/**
	 * how Queen moves
	 */
	@Override
	public void move() {
		System.out.println("like a bishop or a rook");
	}

	@Override
	public String toString() {
		return "Queen [getValue()=" + getValue() + "]";
	}

}
