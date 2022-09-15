package com.qa.mockito;

import java.util.Scanner;

public class UserInput {

	private Scanner scan;

	public UserInput() {
		super();
		this.scan = new Scanner(System.in);
	}

	public String getText() {
		return this.scan.nextLine();
	}
}
