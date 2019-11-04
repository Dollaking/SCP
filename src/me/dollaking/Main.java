package me.dollaking;

import java.util.Scanner;

public class Main {
	
	static ScissorPaperRock game;
	
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Scissors Paper Rock: ");
		String input = scanner.nextLine();
		if (input.equals("Scissors")){
			game = new ScissorPaperRock(new Human(new Scissors()), new AI());
			System.out.println("Result: " + game.play());
		} else if (input.equals("Rock")){
			game = new ScissorPaperRock(new Human(new Rock()), new AI());
			System.out.println("Result: " + game.play());
		} else if (input.equals("Paper")){
			game = new ScissorPaperRock(new Human(new Paper()), new AI());
			System.out.println("Result: " + game.play());
		} else {
			System.out.println("Turn not valid");
		}
		
	}

}
