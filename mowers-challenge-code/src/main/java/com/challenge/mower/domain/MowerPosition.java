package com.seatchallenge.mower.domain;


public class MowerPosition {
	
	private PositionCoordinates coordinates;
	private MowerCardinalPoint cardinalPoint; 

	
	public MowerPosition(PositionCoordinates coordinates, MowerCardinalPoint cardinalPoint) {
		this.coordinates=coordinates;
		this.cardinalPoint = cardinalPoint;
	}

	public void move() {
		this.cardinalPoint.move(coordinates);
	}
	
	public void rotateLeft() {
		this.cardinalPoint=	cardinalPoint.rotateLeft();
	}
	public void rotateRigth() {
		this.cardinalPoint=	cardinalPoint.rotateRight();
	}
	
	public PositionCoordinates getCoordinates() {
		return coordinates;
	}

	public MowerCardinalPoint getCardinalPoint() {
		return cardinalPoint;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MowerPosition other = (MowerPosition) obj;
		if (cardinalPoint != other.cardinalPoint)
			return false;
		if (coordinates == null) {
			if (other.coordinates != null)
				return false;
		} else if (!coordinates.equals(other.coordinates))
			return false;
		return true;
	}
	
	


}
