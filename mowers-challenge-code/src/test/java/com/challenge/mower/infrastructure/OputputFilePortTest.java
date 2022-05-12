package com.seatchallenge.mower.infrastructure;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class OputputFilePortTest {

	
	@Test
	void writeFile_wenFileIsNull_throwsException(){
		assertThrows(IllegalArgumentException.class, ()-> OputputFilePort.writeFile(null, ""));
	}
	
	@Test
	void writeFile_wenPathIsNull_throwsException(){
		assertThrows(IllegalArgumentException.class, ()-> OputputFilePort.writeFile("", null));
	}
}
