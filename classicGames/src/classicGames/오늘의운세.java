package classicGames;

import java.util.*;

public class 오늘의운세 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Calendar 클래스 이용하여 현재 시간을 뽑아낸다.
		 * 2. Random 클래스 이용하여 난수를 추출한다.
		 */
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		Random rand = new Random();
		int randNum = Math.abs(rand.nextInt()%100) + 1;
		
		System.out.println(year+"년 "+month+"월 "+day+"일의 금전운은 "+randNum+"%입니다!");
		if(randNum>=85) {
			System.out.println("행운의 날입니다.");
		}else if(randNum<=15) {
			System.out.println("운이 좋지 않은 날이네요.");
		}
		
		
	}

}
