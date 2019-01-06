package pl.developerpi91.polymer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataLoader {
    public String loadedTextFile="";

    public DataLoader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Workspaces\\AdventOfCode\\2018\\Day5\\src\\pl\\developerpi91\\polymer\\polymer.txt"));
            String currentLine=br.readLine();

            while (currentLine != null){
                loadedTextFile=loadedTextFile+currentLine;
                currentLine = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


