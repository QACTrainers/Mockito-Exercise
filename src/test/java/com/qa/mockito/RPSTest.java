package com.qa.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPSTest {

	private RPS rps = new RPS();

	@Test
	public void testRockVsPaper() {
		assertEquals("LOSE", this.rps.play("ROCK"));
	}

}
