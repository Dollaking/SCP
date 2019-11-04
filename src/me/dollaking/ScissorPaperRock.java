package me.dollaking;

public class ScissorPaperRock {
	Player player1;
	Player player2;
	String status;
	
	public ScissorPaperRock(Human h, AI ai){
		this.player1 = h;
		this.player2 = ai;
		play();
	}
	
	
	public void HumanVsHuman(){
		
	}
	
	public void HumanVsRobot(){
		
	}
	
	public void RobotVsRobot(){
		
	}
	
	public String play(){
		status = player1.getTurn().match(player2.getTurn());
		return status;		
	}

}
