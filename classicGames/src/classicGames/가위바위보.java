package classicGames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가위바위보 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 1. Random 클래스 이용해서 난수 추출( 1=가위,2=바위,3=보 )
		 * 2. 사용자는 뭘 낼 것인가요? => bufferedReader 클래스 이용하기
		 * 3. 비교 => if 변수 이용
		 *      1) 같다면 "비겼습니다"
		 *      2) 다르다면 
		 *      	2.1) 사용자가 가위를 낸 경우		
		 *      	2.2) 사용자가 바위를 낸 경우
		 *      	2.3) 사용자가 보를 낸 경우
		 */
		
		Random rand = new Random();
		int computer = rand.nextInt(2) + 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("가위 바위 보 중 하나를 입력하세요");
		int user;
		
		if(br.readLine().equals("가위")) {
			user = 1;
		}else if(br.readLine().equals("바위")) {
			user = 2;
		}else user = 3;
		
		if(computer==1) {
			if(user==1) System.out.println("비겼습니다");
			if(user==2) System.out.println("이겼습니다");
			if(user==3) System.out.println("졌습니다");
		}else if(computer==2) {
			if(user==2) System.out.println("비겼습니다");
			if(user==3) System.out.println("이겼습니다");
			if(user==1) System.out.println("졌습니다");
		}else if(computer==3) {
			if(user==3) System.out.println("비겼습니다");
			if(user==1) System.out.println("이겼습니다");
			if(user==2) System.out.println("졌습니다");
		}
		
	}

}
