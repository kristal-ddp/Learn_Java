package day3;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		/*
		5. 단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인해줄 때, 판매금액을 계산하는 프로그램
		할인율: 10개 이상 10%, 20개 이상 15%, 30개 이상 20%
		ex: 구입수량 15개 → 구입수량: 15개, 판매총금액: 213300원
		*/
		
		double rate=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 상품의 개수를 입력하세요. ");
		int num = sc.nextInt();
		
		if(num>=30) {
			rate = 0.8;
		}else if(num>=20) {
			rate = 0.85;
		}else if(num>=10) {
			rate = 0.9;
		}else {
			rate = 1;
		}
		
		int total = (int)(15800*num*rate);//방법①
		System.out.printf("구입 수량: %d개, 판매 총 금액: %d",num,total);
		
//		double total = 15800*num*rate;//방법②
//		System.out.printf("구입 수량: %d개, 판매 총 금액: %g",num,total);

	}

}
