package com.seatchallenge.mower.domain;


public class Mower {

	 private MowerPosition position;
			  
	 public Mower(MowerPosition position) {
		 this.position=position;
	 }
	 
	  public void rotateLeft() {
		  position.rotateLeft();
	  }
	  public void rotateRigth() {
		  position.rotateRigth();
	  }
	
	  public void forward() {
		  position.move();
	  }
	  
	  public MowerPosition getPosition() {
		  return this.position;
	  }
	
}
