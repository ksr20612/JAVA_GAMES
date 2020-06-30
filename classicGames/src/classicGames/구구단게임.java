package classicGames;

import java.io.*;
import java.util.*;

public class 구구단게임 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 1. arg(인수)가 있으면 arg단을, 없으면 랜덤단을 범위로 게임
		 * 2. bufferedReader 클래스로 입력받은 답이 생성된 답과 일치하는지 체크
		 */
		
		Random rand = new Random();
		int a;
		
		if(args.length==0) {
			a = rand.nextInt(9)+1;
		}else {
			a = Integer.parseInt(args[0]);
		}
		
		int b = rand.nextInt(9)+1;
		int answer = a*b;
		
		System.out.println("구구단을 외자");
		System.out.println(+a+" * "+b+" =?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int userValue = Integer.parseInt(br.readLine());
		
		if(answer==userValue) System.out.println("정답!");
		else System.out.println("틀렸습니다");
		
	}

}
