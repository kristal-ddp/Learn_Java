package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader 이용
		//1부터 입력받은 수까지의 합계 구하고, 계속 실행할 것인지 물어보는 프로그램
		//조건: 1~5000사이의 값 입력
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		int num;
		
		while(true) {
			
			int sum = 0;
			
			do {
			
				System.out.print("숫자를 입력하세요. ");
				num = Integer.parseInt(br.readLine());
			
			}while(num<1 || num>5000);
			
			for(int i=1;i<=num;i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합은 %d입니다.\n",num,sum);
			
			while(true) {
				
				System.out.print("계속 하시겠습니까?");
				char answer = (char)System.in.read();
				System.in.skip(2);
				
				if(answer=='y' || answer=='Y') {
					break;
				}else if(answer=='n' || answer=='N') {
					System.out.println("프로그램을 종료합니다.");
					return;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		
		}

	}

}
