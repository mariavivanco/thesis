import java.util.*;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 

class playgame {

	static String puzzleInput;
	static String dictionary; 
	public static ArrayList<String> words;  
	public static HashSet<String> solutions; // later change to hashmaps for scores  
	public static HashSet<String> userAnswers; 
	
	public static void main (String[] args) {
	    puzzleInput = args[0]; 
	    dictionary = args[1];
	    System.out.println(puzzleInput); 
	    System.out.println(dictionary); 
	   // words = readFile (dictionary);
	    solutions = getSolutions (puzzleInput);
	    System.out.println(System.getProperty("user.dir"));
	}
//	public static ArrayList<String> readFile(String textfile){
//		ArrayList<String> dict = new ArrayList <String>(); 
//		InputStream inputstream = new FileInputStream(textfile);
//
//		int data = inputstream.read();
//		while(data != -1) {
//		  //do something with data...
//		  doSomethingWithData(data);
//
//		  data = inputstream.read();
//		}
//		inputstream.close();
//		return dict;
//	}	
	
	public static HashSet<String> getSolutions (String puzzle) {
		HashSet<String> tempSolutions = new HashSet <String> (); 
		
		return tempSolutions; 
		
	} //later change to hashmaps for scores 
	
	public static void play () {
		//get user input 
		String input = "" ;
		if (isSolution(input) && !alreadyUsed(input)) {
			userAnswers.add(input); 
			// calculate score 
		}
		else {
			if (!isSolution(input)) {
				//print not a valid solution 
			}
			if (alreadyUsed (input)) {
				//print already used that 
			}
			//ask again 
		}
	    
	}
	
	public static boolean isSolution (String userInput) {
		return solutions.contains(userInput); 
	}
	
	public static boolean alreadyUsed (String userInput) {
		return userAnswers.contains(userInput); 
	}
	
}