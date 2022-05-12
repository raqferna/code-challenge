package com.seatchallenge.mower.domain.service;

import java.util.ArrayList;
import java.util.List;

import com.seatchallenge.mower.domain.Mower;
import com.seatchallenge.mower.domain.MowerCommand;
import com.seatchallenge.mower.domain.MowerPosition;
import com.seatchallenge.mower.domain.Plateau;

public class DomainPlateauService implements PlateauService{
	
	private Plateau currentPlateu;
	

	@Override
	public void createGrid(int width, int height) {
       this.currentPlateu = new Plateau(width,height);
		
	}

	@Override
	public Mower addMower(MowerPosition mowerPosition) {
		Mower mower = new Mower(mowerPosition);
		currentPlateu.addMower(mower);
		return mower;
		
	}
	

	@Override
	public List<MowerPosition> getPositions() {
		 List<MowerPosition> positions = new ArrayList<>();
		 this.currentPlateu.getMowers().forEach(mower ->{
			 positions.add(mower.getPosition());
		 });
		 return positions;
	}

	@Override
	public Plateau getPlateau() {
		return currentPlateu;
	}

}
