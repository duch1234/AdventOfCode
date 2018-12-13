package pl.developerpi91.calibration;

import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Other;

public class SantaDevice {

	public static int startFrequency = 0;
	public static int currentFrequency;
//	public static int[] outputCalibration;
	public static ArrayList<Integer>outputCalibration = new ArrayList<>();
	public static CalibrationData cd = new CalibrationData();
	
	public static void main(String[] args) {
		
		currentFrequency = startFrequency;
		calibrate();
		checkRepetedFrequency();
	}
	
	
	
	public static void calibrate() {
//		CalibrationData cd = new CalibrationData();
//		outputCalibration = new int[cd.calibrationList.size()];
		

		
		for (int i = 0; i<cd.calibrationList.size();i++) {
			currentFrequency = currentFrequency + cd.calibrationList.get(i);
 
//			outputCalibration[i] = currentFrequency;
			outputCalibration.add(currentFrequency);
			
		}
//		System.out.println("Calibration: " + currentFrequency);
	}
	
	public static void checkRepetedFrequency() {
//		CalibrationData cd = new CalibrationData();
//		
//		currentFrequency = startFrequency;
//		
//		for(int i = 0; i<cd.calibrationList.size();i++) {
//			
//			int j=i-1;
//			while(j>=0){
//				
//				if(cd.calibrationList.get(i) -cd.calibrationList.get(j) == 0) {
//					
//					System.out.println("Found repeated Frequency " + cd.calibrationList.get(i));
//					break;
//				}
//				j--;
//
//			}
		for(int a=0; a<=10000;a++) {
			calibrate();

		}


		for (int i = 0; i < outputCalibration.size(); i++) {
			int j = i-1;
//			System.out.println(outputCalibration[i]);
		
			while(j>=0) {
				if(outputCalibration.get(i) == outputCalibration.get(j)) {
					System.out.println("Found repeated Frequency " + outputCalibration.get(i));

					break;
				}
				else {
//					System.out.println("Pair  "+ j + "    " +outputCalibration[i]+"        "+outputCalibration[j] );
				}
				j--;
			}
	
			
		}

			
	}

}
