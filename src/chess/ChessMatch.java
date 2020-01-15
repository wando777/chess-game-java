package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {

	private static final int A = 0;
	private static final int H = 7;
	private static final int EIGHT = 7;
	private static final int ONE = 0;

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}

	private void initialSetup() {
		// White pieces
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(ONE, A));
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(ONE, H));

		board.PlacePiece(new Rook(board, Color.BLACK), new Position(EIGHT, A));
		board.PlacePiece(new Rook(board, Color.BLACK), new Position(EIGHT, H));
	}

}
