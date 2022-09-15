package com.qa.mockito;

import java.util.Random;

public class RPS {

	private static final String[] choices = { "ROCK", "PAPER", "SCISSORS" };

	private Random rand;

	private UserInput input;

	public RPS() {
		super();
		this.rand = new Random();
		this.input = new UserInput();
	}

	public String play() {
		System.out.println("Choose ROCK, PAPER or SCISSORS:");
		String playerChoice = this.input.getText();
		String cpuChoice = choices[rand.nextInt(3) - 1];

		switch (playerChoice.toUpperCase()) {
		case ("ROCK"):
			if (cpuChoice.equals("ROCK"))
				return "DRAW";
			else if (cpuChoice.equals("PAPER"))
				return "LOSE";
			else
				return "WIN";
		case ("PAPER"):
			if (cpuChoice.equals("ROCK"))
				return "DRAW";
			else if (cpuChoice.equals("PAPER"))
				return "LOSE";
			else
				return "WIN";
		case ("SCISSORS"):
			if (cpuChoice.equals("ROCK"))
				return "DRAW";
			else if (cpuChoice.equals("PAPER"))
				return "LOSE";
			else
				return "WIN";
		default:
			return "Invalid choice";
		}
	}
}
