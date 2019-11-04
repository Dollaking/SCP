package me.dollaking;

public class Rock extends Turn{

	public Rock() {
		super("Rock");
	}

	@Override
	public String match(Scissors s) {
		return "Win";
	}

	@Override
	public String match(Paper p) {
		return "Lose";
	}

	@Override
	public String match(Rock r) {
		// TODO Auto-generated method stub
		return "Draw";
	}
	
	@Override
	public String match(Turn t) {
		if (t.getDesc().equals("Scissors")){
			return "Win";
		} else if (t.getDesc().equals("Paper")){
			return "Lose";
		} else if (t.getDesc().equals("Rock")){
			return "Draw";
		}
		return "Turn not valid!";
	}


}
