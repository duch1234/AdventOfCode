package pl.developerpi91.boxScanner;

import java.util.ArrayList;
import java.util.HashMap;

public class Scanner {

	int repeatedTwice=0;
	int repeatedthree=0;

	
	public static void main(String[] args) {
		Data.loadData();
		
		Scanner sc = new Scanner();
		
		for (int i=0; i<Data.list.size();i++) {
			sc.checkRepeatedchar(sc.scanCode(i));
		}
		System.out.println(sc.checkSum());
		
		// PART 2
		for (int i=0;i<Data.list.size(); i++) {
			for (int j=0;j<Data.list.size(); j++) {
				if(sc.compareTwoCode(sc.scanCode(i), sc.scanCode(j))==1){
					System.out.println(sc.scanCode(i));
					System.out.println(sc.scanCode(j));
					System.out.println(sc.matchedCode(sc.scanCode(i), sc.scanCode(j)));
					break;
				}
				
			}
		}
	}

	public String scanCode(int id) {
		String code =  Data.list.get(id);
		return code;
	}
	
	public void checkRepeatedchar(String code) {
		
		final char[] codeCharArray = code.toCharArray();		
		final int codeLength = codeCharArray.length;
		HashMap<Character, Integer> repeatedMap = new HashMap<Character, Integer>();
		
		int countRepeated = 1;

		for(int i=0; i<codeCharArray.length; i++) {
			
			countRepeated=1;
			char currentChar = codeCharArray[i];
			for(int j=0; j<codeLength;j++) {
		
				if(currentChar==codeCharArray[j] && j!=i ) {
					countRepeated=countRepeated+1;
					repeatedMap.put(currentChar, countRepeated);	
				}	
			}		
		}
		
		System.out.println(repeatedMap.toString());
		countRepeated(repeatedMap);
	}
	
	public void countRepeated(HashMap<Character, Integer> repeatedMap) {
		
		if (repeatedMap.containsValue(2)){
			repeatedTwice=repeatedTwice+1;
		}
		if(repeatedMap.containsValue(3)){
			repeatedthree=repeatedthree+1;
		}
	}
	public int checkSum() {
		return repeatedTwice * repeatedthree;
	}

	public int compareTwoCode(String code1, String code2) {
		int notMatched=0;
		for(int i=0;i<code1.length(); i++) {
			if(code1.toCharArray()[i] == code2.toCharArray()[i]) {
				
			}
			else {
				notMatched=notMatched+1;
			}
		}
		return notMatched;
	}
	public String matchedCode(String code1, String code2) {
		String match= "";
		for(int i=0;i<code1.length(); i++) {
			if(code1.toCharArray()[i] == code2.toCharArray()[i]) {
				
			}
			else {
				 match = code1.replace(Character.toString(code1.toCharArray()[i]), "");
			}
		}
		return match;
	}
}
