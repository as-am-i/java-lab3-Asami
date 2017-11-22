package ca.ciccc.java.asami.model;

/**
 * Lab3 King class
 * 
 * @author tanii_asami
 *
 */
public class King extends ChessPiece {
	/**
	 * King constructor
	 */
	public King() {
		super(1000);
	}

	/**
	 * how King moves
	 */
	@Override
	public void move() {
		System.out.println("one square");
	}

	@Override
	public String toString() {
		return "King [getValue()=" + getValue() + "]";
	}

}
