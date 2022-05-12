package com.seatchallenge.mower.domain;

public class PositionCoordinates {
	

	private static final int DEFAULT_MOVEMENT=1;
	private int coordinateX;
	private int coordinateY;
	
	
	public PositionCoordinates(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	
	public int  getCoordinateX() {
		return coordinateX;
	}
	
	public int  getCoordinateY() {
		return coordinateY;
	}

	public void moveLeft() {
		this.coordinateX =coordinateX - DEFAULT_MOVEMENT;
	}
	public void moveRight() {
		this.coordinateX =coordinateX + DEFAULT_MOVEMENT;
	}
	public void moveUp() {
		this.coordinateY =coordinateY + DEFAULT_MOVEMENT;
	}
	public void moveDown() {
		this.coordinateY =coordinateY - DEFAULT_MOVEMENT;
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PositionCoordinates other = (PositionCoordinates) obj;
		if (coordinateX != other.coordinateX)
			return false;
		if (coordinateY != other.coordinateY)
			return false;
		return true;
	}
}
