package com.seatchallenge.mower.application;

import java.util.List;
import com.seatchallenge.mower.domain.Mower;
import com.seatchallenge.mower.domain.MowerCardinalPoint;
import com.seatchallenge.mower.domain.MowerCommand;
import com.seatchallenge.mower.domain.MowerPosition;
import com.seatchallenge.mower.domain.PositionCoordinates;
import com.seatchallenge.mower.domain.service.DomainPlateauService;
import com.seatchallenge.mower.domain.service.PlateauService;


public class PlateauApplicationService {
	
	
	private PlateauService service;
	
	public PlateauApplicationService() {
		 service = new DomainPlateauService();
	}

	
	public void createGrid(int width, int height ) {
		service.createGrid(width, height);
	}
	
	public void executeCommand(int posX, int posY, String cardinalPoint, List<String> commands) {
		Mower mower = addMower( posX, posY, cardinalPoint);
		commands.stream().forEach(command -> {
			getMowerCommand(command).executeCommand(mower);
		});
	}
	
	public String getFormatPositions() {
	   List<MowerPosition> positionList = service.getPositions();
	   StringBuilder builder = new StringBuilder();
	   positionList.forEach(position ->{
		   appendLine(builder, getFormatPosition(position));
	   });
	   return builder.toString();
	}
	
	private String getFormatPosition(MowerPosition position) {
		return position.getCoordinates().getCoordinateX() +" " + position.getCoordinates().getCoordinateY()
				+" "+position.getCardinalPoint().name(); 
	}
	
    public void appendLine(StringBuilder sb, String str) {
	        sb.append(str != null ? str : "").append(System.getProperty("line.separator"));
	}
	
	private Mower addMower(int posX, int posY, String cardinalPoint) {
		MowerPosition position = new MowerPosition(getCoordinates(posX, posY),getCardinalPoint(cardinalPoint));
		if (service.getPlateau() == null) {
			 throw new IllegalArgumentException("Plateau is not created");
		}
		return service.addMower(position);
	}
	
	private PositionCoordinates getCoordinates(int posX, int posY) {
		return new PositionCoordinates(posX, posY);
	}
	
	private MowerCardinalPoint getCardinalPoint(String cardinalPoint) {
		return MowerCardinalPoint.pointOf(cardinalPoint);
	}

	private MowerCommand getMowerCommand(String command) {
		return MowerCommand.commandOf(command);
	}
}
