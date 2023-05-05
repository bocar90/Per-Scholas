package glab_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {

	public static void main(String[] args) throws FileNotFoundException{
		
		try {
			String location = "C:/Users/bocar/Documents/GitHub/Per-Scholas/FileManipulation/src/glab_303_13_1/cars.csv";
			File file = new File(location);
			Scanner input = new Scanner(file);
			ArrayList<String[]> data = new ArrayList<>();
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] splitedLine = line.split(",");
				data.add(splitedLine);
			}
			for(String[] line : data) {
				//System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3]  + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
				System.out.println("Car Name :" + line[0]);
				System.out.println("MPG :" + line[1]);
				System.out.println("Cylinder :" + line[2]);
				System.out.println("Displacement :" + line[3]);
				System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");				
			}
			input.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("File not found! ");
			e.printStackTrace();
		}


	}
}
