package pl.developerpi91.calibration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CalibrationData {

	public  ArrayList<Integer> calibrationList = new ArrayList<>();
	
	public CalibrationData() {
		loadCalibrationnData();
	}

	public  ArrayList<Integer> loadCalibrationnData() {
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("D:\\Workspaces\\AdventOfCode\\2018\\Day1\\src\\pl\\developerpi91\\calibration\\calibrationInput.txt")));
		
			String currentCalibration;
//			
			currentCalibration = br.readLine();
			
			while ( currentCalibration != null) {
				this.calibrationList.add(Integer.parseInt(currentCalibration));
				currentCalibration=br.readLine();
			}
				
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(calibrationList.size());

		}
		
		
		
		return calibrationList;
	}
	
}
