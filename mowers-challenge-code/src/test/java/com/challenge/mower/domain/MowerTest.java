package com.seatchallenge.mower.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MowerTest {
	
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
	void rotateLeft_randomCardinalPoint_returnCorrectNewCardinalPoint(){
		int randomP = random.nextInt(listPoints.size()-1);
		int prev = randomP == 0 ? 3 : randomP-1;
		Mower sut = MowerMother.getMower(1, 1,listPoints.get(randomP));
	    sut.rotateLeft();
	    assertEquals(listPoints.get(prev), sut.getPosition().getCardinalPoint());
	}
	
	@Test
	void rotateRight_randomCardinalPoint_returnCorrectNewCardinalPoint(){
		int randomP = random.nextInt(listPoints.size()-1);
		int post = randomP == 3 ? 0 : randomP + 1;
		Mower sut = MowerMother.getMower(1, 1,listPoints.get(randomP));
	    sut.rotateRigth();
	    assertEquals(listPoints.get(post), sut.getPosition().getCardinalPoint());
	}
	
	@Test
	void forward_randomPositionEPoint_returnCorrectPosition() {
		int randomX = random.nextInt(10);
		int randomY = random.nextInt(10);
		Mower sut = MowerMother.getMower(randomX, randomY, MowerCardinalPoint.E);
		sut.forward();
		assertEquals(randomX+1, sut.getPosition().getCoordinates().getCoordinateX());
		assertEquals(randomY, sut.getPosition().getCoordinates().getCoordinateY());

	}
	
	@Test
	void forward_randomPositionNPoint_returnCorrectPosition() {
		int randomX = random.nextInt(10);
		int randomY = random.nextInt(10);
		Mower sut = MowerMother.getMower(randomX, randomY, MowerCardinalPoint.N);
		sut.forward();
		assertEquals(randomY+1, sut.getPosition().getCoordinates().getCoordinateY());
		assertEquals(randomX, sut.getPosition().getCoordinates().getCoordinateX());

	}
	
	@Test
	void forward_randomPositionSPoint_returnCorrectPosition() {
		int randomX = random.nextInt(10);
		int randomY = random.nextInt(10);
		Mower sut = MowerMother.getMower(randomX, randomY, MowerCardinalPoint.S);
		sut.forward();
		assertEquals(randomY-1, sut.getPosition().getCoordinates().getCoordinateY());
		assertEquals(randomX, sut.getPosition().getCoordinates().getCoordinateX());

	}
	
	@Test
	void forward_randomPositionWPoint_returnCorrectPosition() {
		int randomX = random.nextInt(10);
		int randomY = random.nextInt(10);
		Mower sut = MowerMother.getMower(randomX, randomY, MowerCardinalPoint.W);
		sut.forward();
		assertEquals(randomY, sut.getPosition().getCoordinates().getCoordinateY());
		assertEquals(randomX-1, sut.getPosition().getCoordinates().getCoordinateX());

	}
}
