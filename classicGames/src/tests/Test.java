package tests;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("현재시간은 "+ hour + "시 " + min + "분 입니다.");
	}

}
