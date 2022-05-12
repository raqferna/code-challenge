package com.seatchallenge.mower.domain;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;


public class Plateau {
	
	private static final int DEFAULT_MIN=0; 
	private List<Mower> mowersList = new ArrayList<>();
	private Rectangle gridBounds;
	
	
	public Plateau(int width, int height ) {
		gridBounds = new Rectangle(DEFAULT_MIN,DEFAULT_MIN, width,height );
	}
	
	public List<Mower> getMowers(){
		return this.mowersList;
	}
	
    public void addMower(Mower mower){
    	validatePosition(mower.getPosition());
    	mowersList.add(mower);
    }
    
    private void validatePosition(MowerPosition position) {
    	validatePositionExists(position);
    	validatePositionIsNotFilled(position);
    }
    private void validatePositionExists(MowerPosition position) {
    	validateX(position);
    	validateY(position);
	}
    private void validateX(MowerPosition position) {
    	int xPosition = position.getCoordinates().getCoordinateX();
    	if((xPosition<DEFAULT_MIN)  || (xPosition > this.gridBounds.width)){
		  throw new IllegalArgumentException("Invalid Position.");
    	}
	}
	private void validateY(MowerPosition position) {
		int yPosition = position.getCoordinates().getCoordinateY();
    	if((yPosition<DEFAULT_MIN)  || (yPosition > this.gridBounds.height)){
			   throw new IllegalArgumentException("Invalid Position");
    	}
	}
	
	private void validatePositionIsNotFilled(MowerPosition position) {
    	mowersList.forEach(mower ->{
		   if(position.equals(mower.getPosition())){
			   throw new IllegalArgumentException("The position is already filled.");
		   }
    	});
    }

}
