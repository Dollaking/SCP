package me.dollaking;

public class Human extends Player{
	public Human(Scissors s){
		setTurn(s);
	}
	
	public Human(Paper p){
		setTurn(p);
		
	}
	
	public Human(Rock r){
		setTurn(r);
	}
}
