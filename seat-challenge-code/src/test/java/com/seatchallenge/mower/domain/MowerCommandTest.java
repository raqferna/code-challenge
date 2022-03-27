package com.seatchallenge.mower.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MowerCommandTest {
	
	private static  Map<Integer, MowerCardinalPoint> listPoints;
	private  Random random = new Random();
	
	@BeforeAll
	public static void setUp() {
		listPoints = new HashMap<Integer, MowerCardinalPoint>();
		listPoints.put(0, MowerCardinalPoint.N);
		listPoints.put(1, MowerCardinalPoint.E);
		listPoints.put(2, MowerCardinalPoint.S);
		listPoints.put(3, MowerCardinalPoint.W);
	}
	
	@Test
	void executeCommand_whenIsLeftCommand_rotateLeft() {
		int randomP = random.nextInt(listPoints.size()-1);
		int prev = randomP ==0 ? 3 : randomP-1;
		Mower sut = MowerMother.getMower(1, 1,listPoints.get(randomP));
		MowerCommand.L.executeCommand(sut);
		assertEquals(listPoints.get(prev), sut.getPosition().getCardinalPoint());
	}
	
	
	@Test
	void executeCommand_whenIsRightCommand_rotateRight() {
		int randomP = random.nextInt(listPoints.size()-1);
		int post = randomP == 3 ? 0 : randomP + 1;
		Mower sut = MowerMother.getMower(1, 1,listPoints.get(randomP));
		MowerCommand.R.executeCommand(sut);
		assertEquals(listPoints.get(post), sut.getPosition().getCardinalPoint());
	}
	

	


}
