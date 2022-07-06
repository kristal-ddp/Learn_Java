package day3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//3개의 수를 오름차순으로 정렬하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		/*
		※코딩 순서는 위에서 아래로 진행되기 때문에
		입력값을 받는 method(next/nextInt)는 if문 아래에 넣는게 아니라 입력받는 코드 직후에 넣어야한다
		*/
		System.out.print("3개의 수를 입력하세요: ");//1 2 3
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		/*
		※else if문: if에서 true가 되면 if 블록만 실행하고 전체 if문을 벗어나므로, else if는 실행 안된다
		→3가지의 경우를 비교해야 하므로, else if문이 아니라 if문을 써야한다
		 */
		//1과2, 2와3, 1과3 비교
		if(num1>num2) {
			temp = num1;//num1을 temp로 빼냄
			num1 = num2;//num1>num2이므로 num1에 num2를 넣음
			num2 = temp;//temp를 num2에 넣음
		}
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
//		System.out.println(num1 num2 num3);//오류: println에서는 여러개 입력시 +를 사용해야 한다
//		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.printf("%d %d %d",num1,num2,num3);//better

	}

}
