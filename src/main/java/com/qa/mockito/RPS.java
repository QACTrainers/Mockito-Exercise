package com.qa.mockito;

import java.util.Random;

public class RPS {

	private static final String[] choices = { "ROCK", "PAPER", "SCISSORS" };

	private Random rand = new Random();

	public String play(String choice) {
		String cpuChoice = choices[rand.nextInt(3) - 1];

		switch (choice.toUpperCase()) {
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
