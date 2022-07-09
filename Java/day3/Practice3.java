package day3;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		/*
		3. 네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
		ex: 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20
		*/

		int num1,num2,num3,num4,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수를 입력하세요.[1 2 3 4] ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
//		총 6번 비교
//		오름차순(작은 수→큰 수)
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num3>num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("제일 큰 숫자: %d, 제일 작은 숫자: %d",num4,num1);
		
	}

}
