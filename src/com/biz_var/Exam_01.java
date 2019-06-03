package com.biz_var;

public class Exam_01 {

	public static void main(String[] args) {

		int index = 2;
		int i= 2;
		
		for( i=2; i<=100; i+=1) {
			for(index=2; index<i; index+=1) {
				//i가 9라고 가정했을 때 인덱스가 3이되는 경우ㅠ
				// 9%3의 ==0 조건문이 트루가되고
				// 9%4 이후는 계산할 필요가 없다.
				if(i % index == 0) {
						break;

			
				}
				
			}
			//브레이크 이후 실행되는 곳
			// i값이 소수이면 index = i
			// i값이 소수가 아니면 index < i
			if(i==index) {
			 System.out.println(i+"는 소수입니다.");
			}
		}

		
	}

}
