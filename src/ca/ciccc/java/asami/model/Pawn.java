package ca.ciccc.java.asami.model;

/**
 * Lab3 Pawn class
 * 
 * @author tanii_asami
 *
 */
public class Pawn extends ChessPiece {
	private boolean hasBeenPromoted;
	// false by default
	// this newPiece is the Pawn to be exchanged with the parameter newPiece below
	// ChessPiece newPiece = new ChessPiece();
	// ChessPiece should be changed from null to any value if the promotion happens
	// because of promote() method
	private ChessPiece newPiece;

	/**
	 * when a Pawn reaches the far side of the board, it is exchanged for another
	 * ChessPiece It cannot become a King or Pawn
	 * 
	 * @param newPiece
	 *            to exchange
	 */
	public void promote(ChessPiece newPiece) {
		if (hasBeenPromoted == false) {
			if (!(newPiece instanceof Pawn) && !(newPiece instanceof King)) {
				// assign the reference of the parameter
				this.newPiece = newPiece;
				// make sure it's already promoted
				this.hasBeenPromoted = true;
			}
		}
	}

	/**
	 * Pawn constructor
	 */
	public Pawn() {
		// calling the parent constructor
		super(1);
	}

	/**
	 * how Pawn moves
	 */
	@Override
	public void move() {
		System.out.println("forward 1");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());
		return result;
	}

	/**
	 * Pawns are NOT equal if one has been promoted and another has not Pawns are
	 * also NOT equal if they have been promoted to different ChessPiece types
	 */
	@Override
	public boolean equals(Object object) {
		// if the object to compare is null, this(the object itself to call the method)
		// cannot be compared
		if (object == null) {
			return false;
		}

		// when == is used for Objects. it will check if it’s the same memory address
		if (object == this) {
			return true;
		}

		// if object is a instance of Pawn
		if (!(object instanceof Pawn)) {
			return false;
		}

		// Casting
		// object becomes a Pawn
		Pawn other = (Pawn) object;

		// After casting, which means,
		// After the object became a Pawn(other), you should check two things below

		// returns false if one has been promoted and another has not
		if (this.hasBeenPromoted != other.hasBeenPromoted) {
			return false;
		}

		// there might be TT or FF
		// all the attributes should be checked for the same purpose
		// newPiece should be NOT null if promotion happens
		// if both has been promoted(TT), you should check if they have been to
		// different ChessPiece types
		if (newPiece == null) {
			// newPiece here is the attribute
			// If this attribute is null, it means it is still the default one
			// with .promote() method we change the attribute
			// so it means it's not promoted
			// F
			if (other.newPiece != null) {
				// T
				return false;
			}
		}
		// if Java can reach here, it means TT
		else if (!newPiece.equals(other.newPiece)) {
			return false;
		}

		return true;
	}

	// Encapsulation:
	// toString in the child class should be implemented to get "private" int value
	// in the parent class
	// we cannot access directly "private" int value in another class
	// so we use getValue() inside toString
	@Override
	public String toString() {
		return "Pawn [getValue()=" + getValue() + "]";
	}

}
