package application;

import java.util.Scanner;

//import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main {


	public static void main(String[] args) {

//		Board board = new Board(8, 8);
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
	
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		
	}

}
