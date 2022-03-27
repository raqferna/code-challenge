package com.seatchallenge.mower.infrastructure;

import java.io.IOException;
import com.seatchallenge.mower.application.PlateuController;

public class FilePortController {
	
	private static final String CSV_OUT_PATH="mowersOutput.csv";
	private static final String CSV_PATH="mowers.csv";
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 PlateuController controller = new PlateuController();
		 InputFilePort.readFile(CSV_PATH, controller);
		 OputputFilePort.writeFile(controller.getMowersPositions(), CSV_OUT_PATH);
	 }

}
