package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
		//por padrao position ja será null, 
		//apenas para ser mais didatico;
	}
	
	protected Board getBoard() {
		return board;
	}
	
}
