package com.seatchallenge.mower.domain;

public enum  MowerCardinalPoint {

   N {
	@Override
	public MowerCardinalPoint rotateLeft() {
		return W;
	}

	@Override
	public MowerCardinalPoint rotateRight() {
		return E;
	}

	@Override
	public void move(PositionCoordinates coordenates) {
		coordenates.moveUp();		
	}
   }
   
   ,E {
	@Override
	public MowerCardinalPoint rotateLeft() {
		return N;
	}

	@Override
	public MowerCardinalPoint rotateRight() {
		return S;
	  }

	@Override
	public void move(PositionCoordinates coordenates) {
        coordenates.moveRight();		
	}
    }
   
   ,S {
	@Override
	public MowerCardinalPoint rotateLeft() {
		return E;
	}

	@Override
	public MowerCardinalPoint rotateRight() {
		return W;
	}

	@Override
	public void move(PositionCoordinates coordenates) {
		coordenates.moveDown();		
	}
   }
   
   , W {
	@Override
	public MowerCardinalPoint rotateLeft() {
		return S;
	}

	@Override
	public MowerCardinalPoint rotateRight() {
		return N;
	}

	@Override
	public void move(PositionCoordinates coordenates) {
		coordenates.moveLeft();		
	}
};
	
	
	public static MowerCardinalPoint pointOf(String name) {
	    for (MowerCardinalPoint e : values()) {
	        if (e.name().equals(name)) {
	            return e;
	        }
	    }
		  throw new IllegalArgumentException("Invalid Value.");
	}
	
	
	public abstract MowerCardinalPoint rotateLeft();	
	public	abstract MowerCardinalPoint rotateRight();	
	public abstract void move(PositionCoordinates coordenates);
    

}
