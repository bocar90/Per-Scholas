package glab_303_13_2;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {

	public static void main(String[] args) throws IOException {
		// Input files
		String[] inputFiles = {"C:/Users/bocar/Documents/GitHub/Per-Scholas/FileManipulation/src/glab_303_13_2/file1.txt",
				"C:/Users/bocar/Documents/GitHub/Per-Scholas/FileManipulation/src/glab_303_13_2/file2.txt"};
		
		//Files contents will be written in these files
		String outputFile = "C:/Users/bocar/Documents/GitHub/Per-Scholas/FileManipulation/src/glab_303_13_2/outputExampleTwo.txt";
		//Get channel for output file
		
		FileOutputStream fos = new FileOutputStream(outputFile);
		WritableByteChannel targetChannel = fos.getChannel();
		for(int i = 0; i < inputFiles.length; i++) {
			//Get channel for input files
			FileInputStream fis = new FileInputStream(inputFiles[i]);
			FileChannel	inputChannel = fis.getChannel();
			
			//Transfer data from input channel to output channel
			inputChannel.transferTo(0, inputChannel.size(), targetChannel);
			
			//close the input channel
			inputChannel.close();
			fis.close();
		}
		
		//finally close the target channel
		targetChannel.close();
		fos.close();
	}
}
