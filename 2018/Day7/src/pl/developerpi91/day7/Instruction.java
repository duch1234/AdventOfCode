package pl.developerpi91.day7;

import com.sun.org.apache.bcel.internal.generic.InstructionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

public class Instruction {

    public ArrayList<String> instructionList;
    public Set<String> uniqueStep;

    public Instruction() {
        DataLoader dataFromFile = new DataLoader();
        instructionList = dataFromFile.instruction;
        uniqueStep=findAllUniqueStep(instructionList);
    }

    private   Set<String>  findAllUniqueStep(ArrayList<String> listInstruction){
        ArrayList<String> allSteps =new ArrayList<>();
        for (String element:listInstruction) {
            Matcher step = RegexHelper.step.matcher(element);
            while (step.find()){
                allSteps.add(step.group(1));
            }
        }
        Collections.sort(allSteps);
        Set<String> uniqueSteps = new HashSet<String>(allSteps);
        System.out.println("Unique Steps " + uniqueSteps);
        return uniqueSteps;
    }

    public ArrayList<String> matchStepsBeforeToAfter(){
        ArrayList<String> matchResult= new ArrayList<>();

        int i=0;
        for (String element: instructionList) {
            Matcher stepFinished = RegexHelper.stepFinished.matcher(element);
            Matcher stepToDO = RegexHelper.stepToDo.matcher(element);

            stepFinished.find();
            String tempMap = stepFinished.group(1);
//            tempMap=tempMap+",";

            stepToDO.find();
            tempMap=tempMap+stepToDO.group(1);
            matchResult.add(stepFinished.group(1)+stepToDO.group(1));
//            matchResult.add(tempMap);
        }
        Collections.sort(matchResult);

        for (String element:matchResult
             ) {
            System.out.println(element.toCharArray()[1]);

        }
        for (String element:uniqueStep) {
            System.out.println(element+"   " + isDependentFromPreviousStep(element,matchResult));

        }

        return matchResult;
    }

//    public String findFirstStep(ArrayList){
//
//
//    }
    public boolean isDependentFromPreviousStep(String step, ArrayList<String> mappedSteps){
        boolean result = false;
        for (String element: mappedSteps) {
            char[] temp =element.toCharArray();
            if (Character.toString(temp[1]).equals(step)){
                result=true;
            }else{
            }

        }

        return result;
    }

}
