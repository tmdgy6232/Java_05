package com.biz.myclass;

public class PlusMinus {

	
	/*
	 * add() method는 두개의 정수형 매개변수를 선언하고 있으며
	 * 두개의 숫자를 바구니에 받아서 덧셈을 실행한 후
	 * 결과를 콘솔에 표시한다.
	 * 매게변수의 타입이 다르거나
	 * 갯수가 다르면
	 * 같은 이름을 사용할 수 있다.
	 * 
	 */
	public void add(int Num1, int Num2) {
		int intSum = Num1 + Num2;
		System.out.println(Num1 + " 더하기 "
				+ Num2 + " 는 " + (Num1 + Num2)+" 입니다.");
	}
	
	public void add(int num1) {
		System.out.println(num1);
	}
	public void add(float Num1, float Num2) {
		//int intSum = Num1 + Num2;
		System.out.println(Num1 + " + "
				+ Num2 + " = " + (Num1 + Num2)+" 입니다.");
	}
	
	
}
