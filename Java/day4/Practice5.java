package day4;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		/*
		5. 2개의 수를 입력받아 작은 수부터 큰 수까지의 합을 구하는 프로그램
		1~100 까지의 합 : 5050
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int temp,i,sum=0;
		
		System.out.print("2개의 수를 입력하세요.[a b] ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {//num1에 작은값, num2에 큰값 가도록 설정
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.printf("%d~%d까지의 합: %d",num1,num2,sum);
		
		sc.close();

	}

}
