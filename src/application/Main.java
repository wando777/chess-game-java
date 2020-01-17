package application;

//import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPosition;

public class Main {


	public static void main(String[] args) {

//		Board board = new Board(8, 8);
		ChessMatch chessMatch = new ChessMatch();
	
		UI.printBoard(chessMatch.getPieces());
		
		ChessPosition cs = new ChessPosition('b',7);
		
		System.out.println(cs.getBoardSize());
	}

}
