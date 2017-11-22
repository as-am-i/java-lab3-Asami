package ca.ciccc.java.asami.model;

/**
 * Lab3 ChessPiece class
 * 
 * @author tanii_asami
 *
 */
public abstract class ChessPiece {
	private int value;

	/**
	 * ChessPiece constructor
	 * 
	 * @param value
	 *            to be set
	 */
	public ChessPiece(int value) {
		setValue(value);
	}

	/**
	 * 
	 * @return value to get
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            to be set
	 */
	public final void setValue(int value) {
		this.value = value;
	}

	/*
	 * abstract method called move()
	 * 
	 * there's NO implementation return type is void because move() in the child
	 * class have only println
	 */
	public abstract void move();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	/**
	 * If two ChessPiece objects have the same value of each other, they are
	 * considered equal.
	 */
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}

		if (object == this) {
			return true;
		}

		if (!(object instanceof ChessPiece)) {
			return false;
		}

		ChessPiece other = (ChessPiece) object;

		if (this.value != other.value) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "ChessPiece [value=" + value + "]";
	}

}
