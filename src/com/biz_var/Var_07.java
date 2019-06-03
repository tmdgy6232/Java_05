package com.biz_var;

public class Var_07 {

	public static void main(String[] args) {

		for(int i = '0' ; i <= '9'; i++) {
			System.out.print(i);
		System.out.print(" : ");
		System.out.println((char)i);
	}

		for(int i = 'A' ; i <= 'Z'; i++) {
			System.out.print(i);
		System.out.print(" : ");
		System.out.println((char)i);
	}
		// ASCII코드 0부터 255(8비트)까지의 모든 값
		for(int i = 0 ; i <= 256; i++) {
			System.out.print(i);
		System.out.print(" : ");
		System.out.println((char)i);
	}

		//"" -> 문자열 = String = 값에 제한이 거의 없음
		//'' -> 문자 = char = 한글자만 들어갈 수 있음.
		
	}
}
