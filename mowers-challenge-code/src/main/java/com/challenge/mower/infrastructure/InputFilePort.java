package com.seatchallenge.mower.infrastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import com.seatchallenge.mower.application.PlateuController;

public class InputFilePort {

	
	public static void  readFile(String path, PlateuController controller) throws NumberFormatException, IOException {
     
		if( path == null ) {
			 throw new IllegalArgumentException("Path is null");
		}
		BufferedReader  br = new BufferedReader(new FileReader(path));
		String line = "";
		int readLine =0;
	    boolean position = true;
	      int posX = 0;
    	  int posY = 0;
    	  String cardinalPoint = null;
	      while ((line = br.readLine()) != null) {
              String[] charsLine = line.split(" ");
            if(readLine ==0) {
            	controller.createGrid(Integer.valueOf(charsLine[0]), Integer.valueOf(charsLine[1]));
            }else {
            	if(position) {
            		posX=Integer.valueOf(charsLine[0]);
            		posY=Integer.valueOf(charsLine[1]);
            		cardinalPoint = charsLine[2];
            	}else {
            		controller.executeCommand(posX, posY, cardinalPoint, charsLine[0]);
            	}
            	position = !position;
            }
            readLine++;

	      }
	      br.close();
	}


	 
	 

}
