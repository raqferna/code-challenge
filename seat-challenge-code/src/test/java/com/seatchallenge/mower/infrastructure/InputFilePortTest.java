package com.seatchallenge.mower.infrastructure;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.seatchallenge.mower.application.PlateuController;

public class InputFilePortTest {

	
	@Test
	void writeFile_wenFileIsNull_throwsException(){
		assertThrows(IllegalArgumentException.class, ()-> InputFilePort.readFile(null, new PlateuController()));
	}
	

}
