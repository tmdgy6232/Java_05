package com.biz_var;

public class Var_04 {

	public static void main(String[] args) {

		
		int intKor = 83;
		int intEng = 72;
		int intMath = 75;
		int intSum = intKor + intEng + intMath;
		
		//실수형의 기본값은 Double형으로 8바이트 
		System.out.println("총점 :" + intSum);
		System.out.println("평균 :" + intSum/3);
		
		System.out.println("평균 :" + intSum/3.0);//더블형으로 변환
		System.out.println("평균 :"+ (double)intSum/3.0);
		//f를 붙혀주면 float형으로 4바이트 크기가 됨
		System.out.println("평균 :" + intSum/3.0f);//float형으로 변환
		System.out.println("평균 :"+ (float)intSum/3.0);
	}

}
