package day3;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		2. 두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
		ex: 20, 30 입력시 → 큰 숫자 30, 작은 숫자 20
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		
//		System.out.print("2개의 정수를 입력하세요.[a b] ");//10 20 방법①
		
		System.out.print("2개의 정수를 입력하세요.[a,b] ");//10,20 방법②
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");//방법②
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			max = num1;
			min = num2;
			
			System.out.printf("큰 숫자: %d, 작은 숫자: %d",max,min);
		}
		if(num1<num2) {
			max = num2;
			min = num1;
			
			System.out.printf("큰 숫자: %d, 작은 숫자: %d",max,min);
		}		
		if(num1==num2) {
			System.out.printf("입력한 값이 %d으로 같습니다",num1);
		}
		
		sc.close();

	}

}

