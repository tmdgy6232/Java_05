package com.biz.myclass;

public class MyClass_02 {

	
	//MyClass_02의 멤버변수
	public int num1=0;
	public int num2=0;
	
	//메서드
	/*
	 * 코드는 위에서 밑으로 흐른다. 이를 탑다운 방식이라 한다.
	 * 메인이 실행이 되다가 에드라는 매서드를 만나면 애드클래스로 이동했다가
	 * 애드의 연산을 실행하고 리턴을 만나 다시 메인으로 돌아온다.
	 * return문은 되돌아간다는 의미보다는 매서드를 종료한다는 의미가 크다.
	 */
	
	//void형 매서드는 보통 리턴문을 생략한다.
	// 만약 리턴을 사용하려면 아무런 값도 없이 사용한다.
	public void add() {// 멤버변수를 참조
		System.out.println(num1 + num2);
		
	}
	
	//리턴 타입이 있는 매서드
	// return type이 있는 메서드는 반드시 return문이 있어야한다.
	// return되는 데이터형이 return 타입과 일치해야한다.
	//또한 호출한 곳에서 리턴되는값을 사용하려면
	//같은 타입의 변수에 받아야 한다.
	
	
	public String add(int num1, int num2) {
		//System.out.println(num1 + num2);
		return "" + num1 + num2;
	}
	
	public String add(String s1, String s2) {
		return s1+s2;
		
	}
	public float add(float f1, float f2) {
		return f1 + f2;
	}
	
	
	// void는 아무것도 없는 리턴을 쓰거나 생략해도 되지만
	// int, String, float는 반드시 리턴문이 와야하며, 설정한 
	// 형태와 같은 데이터가 들어가야한다.
	public void times() {
		System.out.println(num1 * num2);
	}
	public void minus() {
		System.out.println(num1 - num2);
	}
}
