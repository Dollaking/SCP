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

	@Override
	public String match(Turn t) {
		if (t.getDesc().equals("Scissors")){
			return "Lose";
		} else if (t.getDesc().equals("Paper")){
			return "Draw";
		} else if (t.getDesc().equals("Rock")){
			return "Win";
		}
		return "Turn not valid!";
	}

}
