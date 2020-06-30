package classicGames;

import java.io.IOException;

public class 행맨게임 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Hangman hangman = new Hangman();
		
		int result = hangman.playGame();
		String answer = hangman.hiddenString;
		
	    System.out.println();
	    if(result<=2){ 
	      System.out.println("참 잘했어요!");
	    }else if(result<=3){
	      System.out.println("잘했어요!");
	    }else if(result<=4){
	      System.out.println("보통이네요!");
	    }else{
	      System.out.println("안타깝습니다. 시민이 죽었습니다.");
	    }
	    
	    System.out.println("정답은 "+answer+"입니다.");
	}

}
