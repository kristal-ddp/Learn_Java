package day4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
//		1개의 단 만들기
		
//		반복문: for,while,do~while
//		변하는 값이 있을 때, 똑같은 일, 반복적인 작업을 할 때 사용
//		ex: 구구단(2x1=2, 2x2=4, 2x3=6)
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("단을 입력하세요. ");
		dan = sc.nextInt();
		
//		for문: 시작값과 끝값이 정해져 있을 때 사용하며, 증가값은 중요하지 않다.
//		조건에 따라 1번도 실행되지 않을 수 있다.
//		for(초기값;최대값;증가값) {
//			내용
//		}
		for(int i=1;i<=9;i++) {//i++ == i=i+1 
			System.out.printf("%d * %d = %d\n",dan,dan*i);
		}

	}

}
