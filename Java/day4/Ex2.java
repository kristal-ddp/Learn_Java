package day4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//1부터 입력받은 수까지의 합계 구하고, 계속 실행할 것인지 물어보는 프로그램
		//조건: 1~5000사이의 값 입력
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int sum = 0;
			
			do {
				
				System.out.print("숫자를 입력하세요. ");
				number = sc.nextInt();
				
			}while(number<1 || number>5000);
			
			for(int i=1;i<=number;i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계는 %d입니다",number,sum);
			
			while(true){
				
				System.out.print("계속 실행하시겠습니까?[Y/N] ");
				char answer = sc.next().charAt(0);
				
				if(answer=='Y' || answer=='y') {
					break;//while문 종료
				}else if(answer=='N' || answer=='n') {
					return;//프로그램 실행 종료
				}else {
					continue;//while문 반복
				}
				
			}
		}

	}

}
