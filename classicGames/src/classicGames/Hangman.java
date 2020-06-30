package classicGames;

import java.util.*;
import java.io.*;

public class Hangman {

	String hiddenString;
	StringBuffer outputString;
	StringBuffer inputString;
	int remainder;
	int failed;
	
	public Hangman() throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ksr02\\git\\classicGames\\classicGames\\src\\ENGwords.txt"));
		
		Random rand = new Random();
		int n = rand.nextInt(172819);
		
		for(int i=0;i<=n;i++) {
			hiddenString = br.readLine();
		}
	}
		
	public int playGame() throws IOException {
		
		outputString = new StringBuffer();
		
		for(int i=1;i<=hiddenString.length();i++) {
			outputString.append("_");
			remainder++;
		}
		
		failed = 0;
		inputString = new StringBuffer();
		
		System.out.println("단어는 "+hiddenString.length()+"글자입니다.");
		System.out.println(outputString);
		
		drawMan();
		
		do {
			checkChar(readChar());
			System.out.println(outputString);
			drawMan();
		}while((remainder>0)&&(failed<6));
		
		return failed;
		
	}
	
	private void checkChar(char userChar) {
		
		boolean isAlready = false;
	    for(int i=0;i<inputString.length();i++){
	      if(inputString.charAt(i)==userChar){
	        System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요.");
	        isAlready= true;
	      }
	    }
	  
	    if(isAlready==false){

	      inputString.append(userChar);

	      boolean isRight= false;
	      for(int i=0;i<hiddenString.length();i++){
	        if(hiddenString.charAt(i)==userChar){ //맞추면
	          outputString.setCharAt(i, userChar);
	          remainder--;
	          isRight= true;
	        }
	      }
	      if(isRight==false) failed++;
	    }
	}

	private char readChar() throws IOException {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("문자를 한 개 입력하세요: ");
	    
	    return br.readLine().charAt(0);

	}

	private void drawMan() {
		
	    	System.out.println(" ┌──────┐");
	    	System.out.println(" │    	│");

	    switch(failed){
	      case 0:
	        System.out.println("	│");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 1:
	        System.out.println(" ◑	│");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 2:
	        System.out.println(" ◑	│");
	        System.out.println("┌┼    	│");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 3:
	        System.out.println(" ◑    	│");
	        System.out.println("┌┼    	│");
	        System.out.println(" │    	│");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 4:
	        System.out.println(" ◑	│");
	        System.out.println("┌┼┐  	│");
	        System.out.println(" │    	│");
	        System.out.println("        │");
	        System.out.println("        │");
	        System.out.println("        │");
	        break;
	      case 5:
	        System.out.println(" ◑	│");
	        System.out.println("┌┼┐  	│");
	        System.out.println(" │    	│");
	        System.out.println("┌┴    	│");
	        System.out.println("│      	│");
	        System.out.println("        │");
	        break;
	      case 6:
	        System.out.println(" ◑	│");
	        System.out.println("┌┼┐  	│");
	        System.out.println(" │   	│");
	        System.out.println("┌┴┐  	│");
	        System.out.println("│ │  	│");
	        System.out.println("     	│");
	        break;
	    }
	}

}
