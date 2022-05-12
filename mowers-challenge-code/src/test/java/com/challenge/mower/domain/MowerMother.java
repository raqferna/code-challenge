package com.seatchallenge.mower.domain;

public class MowerMother {
	
	
	static Mower getMower(int x, int y, String cardinalPoint) {
		MowerPosition position = new MowerPosition(getPositionCoordinates(x,y),
				getCardinalPoint(cardinalPoint));
		return new Mower(position);
	}
	
	
	static Mower getMower(int x, int y, MowerCardinalPoint cardinalPoint) {
		MowerPosition position = new MowerPosition(getPositionCoordinates(x,y),
				cardinalPoint);
		return new Mower(position);
	}
	
	private static PositionCoordinates getPositionCoordinates(int x, int y) {
		PositionCoordinates coord = new PositionCoordinates(x, y);
		return coord;
	}
	private static MowerCardinalPoint getCardinalPoint(String p) {
		return MowerCardinalPoint.valueOf(p);
	}
	
	
 
}
