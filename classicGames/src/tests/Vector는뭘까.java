package tests;

import java.io.IOException;
import java.util.*;
import java.io.*;

import classicGames.Hangman;

public class Vector는뭘까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		Vector v = new Vector();
		
		/*
		 * 내가 이해한 vector
		 * 1. 배열과 비슷하다
		 * 2. 다만 벡터는 그 크기가 동적으로 변할 수 있다
		 * 3. 벡터는 객체의 레퍼런스형으로 그 값(주소)을 저장하기 때문에 기본데이터형은 저장하지 못한다
		 * 4. 기본데이터형을 저장하려면 wrapper 클래스를 이용하여 형변환을 시켜줘야 한다
		 *     ex) Integer, Boolean, String 객체를 생성하여 저장
		 * 5. addElement, elementAt, removeElement, size 메서드
		 */
		
		
		v.addElement("유동연");
		v.addElement(new Integer(3));
		
		v.remove(1);
		v.insertElementAt("코딩하는 영문 전공생", 1);
		
		for(int i=0;i<=v.size()-1;i++) {
			pw.println((i+1)+"번째 원소는 "+v.elementAt(i)+" 입니다");
		}
		
		pw.flush();
		
	}

}
