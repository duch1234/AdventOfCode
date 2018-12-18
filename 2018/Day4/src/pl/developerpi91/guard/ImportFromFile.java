package pl.developerpi91.guard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportFromFile {
    ArrayList<String> importedFile = new ArrayList<>();


    public  ImportFromFile(){
       BufferedReader br = null;
        String currentLineFromFile="";

        try {
            br = new BufferedReader(new FileReader("D:\\Workspaces\\AdventOfCode\\2018\\Day4\\src\\pl\\developerpi91\\guard\\guardsSchedule"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            currentLineFromFile = br.readLine();
            while(currentLineFromFile != null){
                this.importedFile.add(currentLineFromFile);
                currentLineFromFile = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
