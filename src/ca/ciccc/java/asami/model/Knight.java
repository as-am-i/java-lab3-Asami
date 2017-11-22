package ca.ciccc.java.asami.model;

/**
 * Lab3 Knight class
 * 
 * @author tanii_asami
 *
 */
public class Knight extends ChessPiece {
	/**
	 * Knight constructor
	 */
	public Knight() {
		super(2);
	}

	/**
	 * how Knight moves
	 */
	@Override
	public void move() {
		System.out.println("like an L");
	}

	@Override
	public String toString() {
		return "Knight [getValue()=" + getValue() + "]";
	}

}
