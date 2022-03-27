package com.seatchallenge.mower.application;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PlateuController {
	
	@Autowired
	private PlateauApplicationService service;
	
	public PlateuController() {
		this.service = new PlateauApplicationService();
	}
	public void createGrid(int width, int height) {
		this.service.createGrid(width, height);
	}
	public void executeCommand(int posX, int posY, String cardinalPoint, String commands) {
		this.service.executeCommand(posX, posY, cardinalPoint, convertCommands(commands));
	}
	
	private List<String> convertCommands(String commands){
		return Arrays.asList(commands.split(""));
	}
	public String getMowersPositions() {
		return this.service.getFormatPositions();
	}

}
