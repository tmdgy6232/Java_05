package com.biz_var;

public class Var_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * bit = 2진수 한자리
			 * 1바이트 = 8 비트
			 * 4비트 = 32비트
			 * int형과 float형은 똑같이 4byte(32bit)크기의 
			 * 기억공간을 차지하도록 설계가 되 ㅓ있는데.
			 * float는 int형보다 훨씬 큰 값을 저장할 수 있다.
			 * int형의 값은 float형 값에 얼마든지 대입할 수 있다.
			 * float형의 값은 int형 값에 대입할 수 없다. 
			 */
		int intNum1 = 30; //정수형
		float fNum1 = 30.0f;//실수형
		
		fNum1 = intNum1; // int형 변수에 담긴값을 floate형 변수에 담을 수 있다.
		intNum1 = (int)fNum1;// floate 형 변수에 담긴 값을 int형 변수에 담을 수 없다.
		/*
		 * 변수의 형변환
		 * int형 변수에 담긴 값을 float형에 담으려 하면 자동으로
		 * 소수점 이하의 값이 추가되어 float형으로 변환된다.
		 * floate형 변수에 담긴 값을 int형에 담으려 하면 
		 * 컴파일러는 개발자가 실수한 것이라고 생각하여 문법오류가 발생한다.
		 * 만약 개발자가 float형에 담긴 값을 소수점 이하를 무조건 잘라버리고
		 * int형에 담겠다라고 선언할 수 있는데
		 * 이런 상황을 강제 형변환이라 한다.
		 * float형의 값을 int형으로 강제 형변환을 할 시 앞에 (int)문구를 붙여준다.
		 *
		 */
		fNum1 = intNum1; // 자동형변환
		intNum1 = (int)fNum1; // 강제형변환


	}

}
