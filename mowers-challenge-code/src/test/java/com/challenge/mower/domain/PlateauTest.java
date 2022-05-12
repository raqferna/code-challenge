package com.seatchallenge.mower.domain;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PlateauTest {
	
	@Test
	void addMower_goodPosition_addOK() {
		Plateau sut =PlateauMother.getParametizerPlateau(5, 5);
		Mower mowerToAdd = MowerMother.getMower(1, 1, "S");
		sut.addMower(mowerToAdd);
		assertEquals(mowerToAdd, sut.getMowers().get(0));
    }
	
	
	@Test
	void addMower_secondMowerDifferent_addOK() {
		Plateau sut =PlateauMother.getParametizerPlateau(5, 5);
		Mower mowerToAdd = MowerMother.getMower(1, 1, "N");
		sut.addMower(mowerToAdd);
		Mower secondMower = MowerMother.getMower(1, 2, "N");
		sut.addMower(secondMower);
		assertEquals(secondMower, sut.getMowers().get(1));
    }
	
	@Test
	void addMower_invalidPositionY_throwsException() {
		Plateau sut =PlateauMother.getParametizerPlateau(2, 2);
		assertThrows(IllegalArgumentException.class, ()->sut.addMower(MowerMother.getMower(1, 3, "N")));
		}
	
	
	@Test
	void addMower_invalidPositionX_throwsException() {
		Plateau sut =PlateauMother.getParametizerPlateau(0, 2);
		assertThrows(IllegalArgumentException.class, ()->sut.addMower(MowerMother.getMower(1, 1, "S")));
		}
	
	@Test
	void addMower_positionFilled_throwsException() {
		Plateau sut =PlateauMother.getParametizerPlateau(5, 5);
		sut.addMower(MowerMother.getMower(1, 1, "S"));
	    assertThrows(IllegalArgumentException.class, ()->sut.addMower(MowerMother.getMower(1, 1, "S")));
    }
	


}
