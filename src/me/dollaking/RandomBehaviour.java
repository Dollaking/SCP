package me.dollaking;

public class RandomBehaviour extends TurnBehaviour{

	@Override
	public Turn perform() {
		return new Scissors();
		
	}

}
