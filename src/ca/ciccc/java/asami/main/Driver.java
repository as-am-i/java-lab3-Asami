package ca.ciccc.java.asami.main;

import ca.ciccc.java.asami.model.*;

public class Driver {
	public static void main(String[] args) {

		Pawn pawn1 = new Pawn();
		Pawn pawn2 = new Pawn();
		Pawn pawn3 = new Pawn();
		Pawn pawn4 = new Pawn();

		Knight knight = new Knight();
		Bishop bishop = new Bishop();
		Rook rook = new Rook();
		Queen queen = new Queen();
		King king = new King();
		King king2 = new King();

		// move()
		System.out.print("pawn: ");
		pawn1.move();
		System.out.print("knight: ");
		knight.move();
		System.out.print("bishop: ");
		bishop.move();
		System.out.print("rock: ");
		rook.move();
		System.out.print("queen: ");
		queen.move();
		System.out.print("king: ");
		king.move();

		pawn1.promote(knight);
		pawn2.promote(bishop);

		// pawn cannot become king
		pawn3.promote(king);

		pawn3.promote(knight);

		System.out.println("----------------------");
		// false
		// Pawns are NOT equal if one has been promoted and another has not
		System.out.println(pawn1.equals(pawn4));

		// false
		// Pawns are also NOT equal if they have been promoted to different ChessPiece
		// types
		System.out.println(pawn1.equals(pawn2));

		// true
		// pawn1 to be knight, and pawn3 to be knight as well
		System.out.println(pawn1.equals(pawn3));

		// false
		System.out.println(knight.equals(queen));

		// false
		System.out.println(queen.equals(king));

		// true
		System.out.println(king.equals(king2));

	}
}
