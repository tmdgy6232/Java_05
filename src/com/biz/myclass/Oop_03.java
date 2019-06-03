package com.biz.myclass;

public class Oop_03 {
	
	/*
	 * Java프로젝트의 진입점 Method라고 한다.
	 * 프로젝트를 작성하고 실행했을 때
	 * 제일먼저 작동되는 명령어 세트이다.
	 * public static void main 명령어는 원래대로라면 프로젝트 당 하나만
	 * 실행해야 한다.
	 */

	public static void main(String[] args) {

		//Oop_03과 PrimeClass가 같은 패키지 내에 있으면
		// Import 하지 않아도
		// 사용할 수 있따.
		PrimeClass pc = new PrimeClass();
		pc.prime();
		
	}

}
