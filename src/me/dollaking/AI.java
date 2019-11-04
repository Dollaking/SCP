package me.dollaking;

public class AI extends Player{
	TurnBehaviour tb;
	public AI(){
		super();
		this.setBehaviour(new RandomBehaviour());
		performTurn();
	}
	
	public void setBehaviour (TurnBehaviour tb){
		this.tb = tb;
	}
	public void performTurn(){
		setTurn(tb.perform());
	}
	
	public void setTurn(Scissors s){
		
	}
	
	public void setTurn(Rock r){
		
	}
	
	public void setTurn(Paper p){
		
	}

}
