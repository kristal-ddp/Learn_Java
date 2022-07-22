package day4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//switch문으로 별 출력하는 프로그램
		int i,j,num;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("1~5 이내의 수를 입력하세요. ");
			num = sc.nextInt();
			
		}while(num<1 || num>5);
		
		/*for(i=1;i<=num;i++) {//방법1
			System.out.print("*");
		}*/
		
		/*if(num==1) {//방법2
			System.out.print("*");
		}else if(num==2) {
			System.out.print("**");
		}else if(num==3) {
			System.out.print("***");
		}else if(num==4) {
			System.out.print("****");
		}else if(num==5) {
			System.out.print("*****");
		}*/
		
		
		/*
		- switch문
		변수의 값에 따라 실행된다
		코드가 같은 case문을 한번에 묶을 수 있다
		다중 if문과 switch문은 서로 바꿀 수 있다
		default: 변수가 case에 해당하는 값들이 아닌 경우. 생략 가능하다
		
		switch(변수){
		case 값1:
			실행문
			break;
		case 값2:
			실행문
			break;
		case 값3:
		case 값4:
			실행문
			break;
		default:
			실행문
			break;
		}
		*/
		switch(num) {//방법3
		
		case 5:
		case 4:
			System.out.print("*****");
			break;
		case 3:
			System.out.print("***");
			break;			
		case 2:
			System.out.print("**");
			break;
		case 1:
			System.out.print("*");
			break;
		
		}
		
		sc.close();		

	}

}
