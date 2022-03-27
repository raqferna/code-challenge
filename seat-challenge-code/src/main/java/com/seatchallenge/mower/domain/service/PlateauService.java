package com.seatchallenge.mower.domain.service;

import java.util.List;

import com.seatchallenge.mower.domain.Mower;
import com.seatchallenge.mower.domain.MowerPosition;
import com.seatchallenge.mower.domain.Plateau;

public interface PlateauService {
	
	void createGrid(int width, int height);
	Mower addMower(MowerPosition mowerPosition);
	List<MowerPosition> getPositions();
	Plateau getPlateau();

}
