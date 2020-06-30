package classicGames;

import java.util.*;
import java.io.*;

public class 숫자야구게임 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 컴퓨터가 숨긴 숫자 3개 list 생성
		 * 2. while문으로 strike 3일때까지 반복
		 * 		- 반복 중에 strike/ball 개수 검사
		 */
		
		int[] computer = new int[3];
		int count = 0;
		int strike = 0;
		int ball = 0;
		
		Random rand = new Random();
		
		int a,b,c;
		a = rand.nextInt(9)+1;
		do {
		b = rand.nextInt(9)+1;
		}while(a==b);
		do {
		c = rand.nextInt(9)+1;
		}while(a==c||b==c);
		
		computer[0] = a;
		computer[1] = b;
		computer[2] = c;
		
		while(true) {
			
			System.out.println("카운트"+ ++count);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] user = br.readLine().split(",");
			
			for(int i=0;i<=2;i++) { 
				for(int j=0;j<=2;j++) {
					if(computer[i]==Integer.parseInt(user[j])) {
						if(i==j) {
							strike++;
							break;
						}else {
							ball++;
							break;
						}
					}
				}
			}

			if(strike==3) {
				System.out.println("정답!");
				break;
			}else {
				System.out.println(strike+" Strike "+ball+" Ball");
				strike = 0;
				ball = 0;
			}
			
		}
		
	}

}
