package pl.developerpi91.day7;

import java.util.ArrayList;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Instruction instruction = new Instruction();
        System.out.println(instruction.instructionList);

        System.out.println(instruction.matchStepsBeforeToAfter());
//        mapStepFinishedAndTodo(instruction.uniqueStep,instruction.instructionList);

    }



    public static void mapStepFinishedAndTodo(Set<String> uniqueSteps, ArrayList<String> listInstruction){

        scanInstructionAndReturnAllMatch(RegexHelper.stepFinished, listInstruction);
//        for (String element:uniqueSteps) {
//
//
//        }
    }
    public static ArrayList<String>scanInstructionAndReturnAllMatch(Pattern searchingElement, ArrayList<String> listInstruction){
        ArrayList<String>searchingResults = new ArrayList<>();
        for (String element: listInstruction) {
            Matcher m = searchingElement.matcher(element);
            while (m.find()){
                searchingResults.add(m.group(1));
            }
        }
        System.out.println(searchingResults);
        return searchingResults;
    }
}
