package com.seatchallenge.mower.infrastructure;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OputputFilePort {

	
	public static void writeFile(String result, String path) throws FileNotFoundException, UnsupportedEncodingException {
	   if(path == null || result == null) {
		 throw new IllegalArgumentException("Path is null");
	   }
		PrintWriter writer = new PrintWriter(path, "UTF-8");
        writer.write(result);
		writer.close();
	}

}
