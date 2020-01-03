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


	
	//Override = escrever o mesmo m�todo, com os mesmos par�metros. Ou seja, � uma anula��o de um m�todo herdado, para fazer o seu especifico. Aqui entra polimorfismo!
	
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
