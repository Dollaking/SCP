package me.dollaking;

public class Scissors extends Turn{
	
	public Scissors(){
		super("Scissors");
	}

	@Override
	public String match(Scissors s) {
		return "Draw";
	}

	@Override
	public String match(Paper p) {
		return "Win";
	}

	@Override
	public String match(Rock r) {
		return "Lose";
	}
}
