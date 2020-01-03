package boardgame;

public class Position {

	private int row;
	private int column;

	public Position(int row, int column) {

		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}


	
	//Override = escrever o mesmo método, com os mesmos parâmetros. Ou seja, é uma anulação de um método herdado, para fazer o seu especifico. Aqui entra polimorfismo!
	
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
