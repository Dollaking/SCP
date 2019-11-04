package me.dollaking;

public class Player{
	private Turn turn;
	private String status;
	
	public Player(Scissors s){
		this.turn = s;
	}
	
	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
