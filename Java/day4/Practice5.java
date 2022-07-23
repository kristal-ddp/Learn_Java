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
		
		/*if(num1>num2) {//num1에 작은값, num2에 큰값 가도록 설정 //방법1
			temp = num1;
			num1 = num2;
			num2 = temp;
		}*/
		
		
		/*
		^: 논리연산자. XOR. 비트연산을 할 때 1이 홀수개면 1, 짝수개면 0을 반환한다
		10진수→2진수: 몫이 0이 될 때까지 2로 나눈 후, 나머지 값을 역순으로 읽는다
		2진수→10진수: 2^n값들을 더한다
		ex) 1010=2^3+2^1=8+2=10
		*/
		if(num1>num2) {//num1에 작은값, num2에 큰값 가도록 설정. num1=10, num2=5 //방법2
			num1 = num1^num2;//num1=1010^101=1111
			num2 = num1^num2;//num2=1111^101=1010→10
			num1 = num1^num2;//num1=1111^1010=0101→5
		}//→num1=5, num2=10
		
		for(i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.printf("%d~%d까지의 합: %d",num1,num2,sum);
		
		sc.close();

	}

}
