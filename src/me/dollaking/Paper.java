package me.dollaking;

public class Paper extends Turn{

	public Paper() {
		super("Paper");
	}

	@Override
	public String match(Scissors s) {
		return "Lose";
	}

	@Override
	public String match(Paper p) {
		return "Draw";
	}

	@Override
	public String match(Rock r) {
		return "Win";
	}

}
