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
	
	@Override
	public String match(Turn t) {
		if (t.getDesc().equals("Scissors")){
			return "Draw";
		} else if (t.getDesc().equals("Paper")){
			return "Win";
		} else if (t.getDesc().equals("Rock")){
			return "Lose";
		}
		return "Turn not valid!";
	}
}
