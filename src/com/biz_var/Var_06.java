package com.biz_var;

public class Var_06 {

	public static void main(String[] args) {

		
		/*
		 * 영문자, 숫자, 기호등은 실제로 기억장치에 저장되거나
		 * 통신을 통해서 이동될 때
		 * ASCII 코드라는 값으로 변환된다.
		 * char형 변수는 1개의 글자를 저장하는 용도로 사용
		 * 
		 * 영문 소문자 a는 아스키코드 97로 표현된다.
		 * 
		 * 97부터 26개의 숫자를 연속해서 char형으로 변환하며ㅛㄴ
		 * 영문 소문자들을 콘솔에서 볼 수 있다.
		 */
		for(int i=97; i <(97+26); i++) {
			char a = (char)i;
			System.out.println(a);
		}
		// 작은 따옴표로 묶인 1개의 글자는
		//char 형으로 
		// 보이기는 문자로 보이지만
		// 실제로는 1byte 크기의 숫자로 인식된다.
		
		
		//print ln(뉴라인)이 없을 시에는 콘솔에서 같은줄에 표기된다.
		for(int i = 'a'; i<='z' ; i++) {
			System.out.print(i);
			System.out.print(" : ");
			System.out.println((char)i); // ASCKII 코드에 해당하는 문자
	}

}
}