package com.seatchallenge.mower.application;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;



public class PlateauApplicationServiceTest {
	
	List<String> list = new ArrayList<>();

	@Test
	void getFormatPositions_forTestCaseInput_returnsExpectedOutput() {
		PlateauApplicationService sut = new PlateauApplicationService();
		sut.createGrid(5, 5);
		list.add("L");
		list.add("M");
		sut.executeCommand(1, 2, "N", list);
		String output = sut.getFormatPositions();
		assertEquals("0 2 W", (output.trim()));
	}
	
	@Test
	void executeCommand_invalidCommand_throwsException() {
		PlateauApplicationService sut = new PlateauApplicationService();
		list.add("ZX");
		assertThrows(IllegalArgumentException.class, ()->
		sut.executeCommand(0, 1, "S", list));
	}
	
	@Test
	void executeCommand_invalidEnum_throwsException() {
		PlateauApplicationService sut = new PlateauApplicationService();
		assertThrows(IllegalArgumentException.class, ()->
		sut.executeCommand(0, 1, "F", list));
	}

	
}
