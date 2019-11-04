package me.dollaking;

public class AI extends Player{
	TurnBehaviour tb;
	public AI(){
		this.setBehaviour(new RandomBehaviour());
	}
	
	public void setBehaviour (TurnBehaviour tb){
		this.tb = tb;
	}
	public void performTurn(){
		
	}
	
	public void setTurn(Scissors s){
		
	}
	
	public void setTurn(Rock r){
		
	}
	
	public void setTurn(Paper p){
		
	}

}
