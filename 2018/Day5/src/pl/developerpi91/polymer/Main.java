package pl.developerpi91.polymer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataLoader dl = new DataLoader();
        System.out.println(dl.loadedTextFile);
        System.out.println(dl.loadedTextFile.toCharArray().length);
        String tempString = "";
        ArrayList<String> polymerImprovedVariation = new ArrayList<>();
        char[] tempArray = dl.loadedTextFile.toCharArray();

//      Part 1
//        while(true){
//            for (int i=0; i<tempArray.length-1;i++){
//                tempString="";
//
//                tempString=tempString + compareLetters(tempArray[i],tempArray[i+1]);
//                tempArray[i]=tempString.toCharArray()[0];
//                tempArray[i+1]=tempString.toCharArray()[1];
//            }
//            tempString= new String(tempArray);
//
//            tempString=tempString.replace(".","");
//            if(tempArray.length==tempString.toCharArray().length){
//                System.out.println(tempString);
//                System.out.println(tempArray.length);
//                break;
//            }
//            tempArray=tempString.toCharArray();
//        }

        //Part 2
        String tempImporvedPolumer = new String(tempArray);
        System.out.println(tempImporvedPolumer);
        for(int i=97; i<=122; i++){             //Remove from Asci table [a-z] and  upperCase

            tempImporvedPolumer = new String(tempArray);
            tempImporvedPolumer = tempImporvedPolumer.replace(Character.toString((char)i),"");
            tempImporvedPolumer = tempImporvedPolumer.replace(Character.toString((char)i).toUpperCase(),"");
//            System.out.println(tempImporvedPolumer);
            polymerImprovedVariation.add(tempImporvedPolumer);
        }
        System.out.println(polymerImprovedVariation.size());

        for (String element :polymerImprovedVariation) {
            tempArray=element.toCharArray();
            while(true){
                for (int i=0; i<tempArray.length-1;i++){
                    tempString="";

                    tempString=tempString + compareLetters(tempArray[i],tempArray[i+1]);
                    tempArray[i]=tempString.toCharArray()[0];
                    tempArray[i+1]=tempString.toCharArray()[1];
                }
                tempString= new String(tempArray);

                tempString=tempString.replace(".","");
                if(tempArray.length==tempString.toCharArray().length){
//                    System.out.println(tempString);
//                    System.out.println(tempArray.length);
                    break;
                }
                tempArray=tempString.toCharArray();
        }
            System.out.println("=====================");
            System.out.println(tempArray.length);
            System.out.println(tempString);
            System.out.println("=====================");
        }
    }

    public static String compareLetters(Character a, Character b){
        Character tempB;
        if(Character.isUpperCase(a) && Character.isLowerCase(b)){
            tempB=Character.toUpperCase(b);
            if(isTheSameLetter(a,tempB)){
//                System.out.println("the same letter should be remove");
                a='.';
                b='.';
            }
        }else if (Character.isLowerCase(a) && Character.isUpperCase(b)){
            tempB=Character.toLowerCase(b);
            if(isTheSameLetter(a,tempB)){
//                System.out.println("the same letter should be remove");
                a='.';
                b='.';
            }
        }else {
//            System.out.println("Letters with the same size  nothing to do");
        }

        String output = a.toString()+b.toString();
        return output;

    }
    public static boolean isTheSameLetter(Character a, Character b){
        return a.equals(b);
    }
}
