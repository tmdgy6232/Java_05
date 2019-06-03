package com.biz.myclass;

public class Oop_07 {

	public static void main(String[] args) {

		String strNation = "대한민국";
		int intNum = 30;

		String strName = new String("홍길동");
		
		
		//strName에 있는 문자열의 길이를 나타내주는 method
		System.out.println(strName.length());
				
		//strNation.
		//intNum.
		
		//정수형 inum1, 2를 만들고 100을 넣어라를 간단하게 사용하게 만들어놓음.
		Integer iNum1 = new Integer(100);
		Integer iNum2 = 100;
		
		//30이라는 문자열을 정수로 변환하여 inum2에 저장
		iNum2 = Integer.valueOf("30");
		
		
		// Integer, Float, Double, Boolean같은 클래스들은
		// 기본형 변수의 기능을 모두 포함하고있다.
		//이런 클래스를 wrapper 클래스라고 한다.
		//기술 면접에서 물어볼 수도 있음~
		int a1 =0;
		Integer a11 =0;
		Integer a111 = new Integer(0);
		
		//변수명의 클래스가 있는것은 기본 변수에 기능을 더해주려는 것이다.
		
		float f1 = 0.0f;
		Float f11 = 0.0f;
		Float f111 = new Float(0.0f);
		
	}

}
