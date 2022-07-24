package day5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		기존에는 변수를 int i,j,k; 처럼 하나씩 선언
		그러나 만약 변수 500개를 선언할 경우에는? → 배열 사용
		
		- 배열(Array)
		동일한 자료형을 가진 데이터들의 집합. 연관된 데이터를 그룹화하여 묶어준다
		배열의 길이: 변수명.length. 배열의 길이는 고정값이다
		배열의 length 뒤에는 괄호 사용X, 다른 곳의 length에는 length()처럼 사용
		index: 배열에서 위치를 가리키며, 범위는 0 ~ n-1
		배열을 초기화할 때, 일반적으로 for(int i=0;i<n;i++) 사용
		
		- 배열의 선언 및 생성
		방법1. 배열의 선언과 생성을 각각 한다
		자료형 변수명[ ];//배열의 선언: 변수를 위한 공간을 만듦
		변수명 = new 자료형[배열의 길이];//배열의 생성: 값을 저장하는 공간을 만듦
		
		방법2. 배열의 선언과 생성을 동시에 한다
		자료형[ ] 변수명 = new 자료형[배열의 길이];배열의 선언과 생성
		+
		변수명[0] = 데이터값;//배열의 초기화: 데이터값을 나중에 입력
		변수명[1] = 데이터값;
		…
		
		방법3. 배열의 생성과 초기화를 동시에 한다
		자료형[ ] 변수명 = {데이터값,…}//배열의 생성과 초기화: 데이터값을 미리 입력
		*/
		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[5];//방법①//변수 5개 선언
		int number[] = new int[5];//방법②
		
		System.out.print("5개의 정수를 입력하세요. ");
		
//		배열의 시작값은 0, 마지막 값은 n-1
//		시작값과 마지막값이 정해져 있고, 일정하게 증가 → 반복문 사용
		for(int i=0;i<number.length;i++) {
			
			number[i] = sc.nextInt();//입력한 순서대로 값이 들어간다
			System.out.printf("num[%d]: %d\n",i,number[i]);
			
		}
		
//		num[5]=60;//오류: ArrayIndexOutOfBoundsException: 5 : 범위값을 벗어났다 → 범위는 0~4

		System.out.printf("배열의 개수: %d개\n",number.length);

	}

}
