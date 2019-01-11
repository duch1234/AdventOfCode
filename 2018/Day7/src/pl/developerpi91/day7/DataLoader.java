package pl.developerpi91.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataLoader {
    public ArrayList<String> instruction = new ArrayList<>();


    public DataLoader() {
        FileReader file;
        BufferedReader br = null;

        try {
             file =  new FileReader("D:\\Workspaces\\AdventOfCode\\2018\\Day7\\src\\pl\\developerpi91\\day7\\puzzleInput");
             br = new BufferedReader(file);

             String currentLine = br.readLine();

             while(currentLine != null){
                 this.instruction.add(currentLine);
//                 System.out.println(currentLine);
                 currentLine=br.readLine();
             }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
