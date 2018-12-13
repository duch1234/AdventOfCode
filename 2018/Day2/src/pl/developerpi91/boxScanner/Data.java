package pl.developerpi91.boxScanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Data {

	public static ArrayList<String> list =new ArrayList<>();
	
	//Loading id boxes from file
	
	public static void loadData() {
		
		try {
			File f = new File("D:\\Workspaces\\AdventOfCode\\2018\\Day2\\src\\pl\\developerpi91\\boxScanner\\boxID");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String currentIdBox = br.readLine();
			
			while(currentIdBox!= null) {
				list.add(currentIdBox);
				currentIdBox = br.readLine();
			}
			
			br.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
