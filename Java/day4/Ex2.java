package day4;

import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		//1부터 입력받은 수까지의 합계 구하고, 계속 실행할 것인지 물어보는 프로그램
		//조건: 1~5000사이의 값 입력
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {//사용자가 몇번 반복할 지 모르므로 while문 사용
			
			int sum = 0;
			
			//1~5000사이의 값 입력받음
			do {
				
				System.out.print("숫자를 입력하세요. ");
				number = sc.nextInt();
				
			}while(number<1 || number>5000);//조건식이 false이면(1~5000사이의 값이면) do-while문 종료
			
			//1부터 입력받은 수까지의 합계
			for(int i=1;i<=number;i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계는 %d입니다\n",number,sum);
			
//			System.in.read(); ASCII값으로 변환된 문자가 하나씩 입력된다
//			(char)System.in.read(); ASCII값을 정수로 형변환
//			데이터 입력후 엔터를 치면, \n(한줄 아래로 이동)과 \r(맨 앞으로 이동)이 입력된다.
//			→ System.in.skip(2); 입력값 2개를 건너뛴다
			
//			String.charAt(0): String문자열 중 한 문자를 선택해 char 형태로 변환한다→여러글자 입력 가능
//			ch = sc.next().charAt(0);
			
			//계속 실행할 것인지 질문
			while(true){
		
				System.out.print("계속하시겠습니까?[Y/N] ");
				char answer = (char)System.in.read();//방법①
				System.in.skip(2);//방법① System.in.read()
//				char answer = sc.next().charAt(0);//방법②
				
				if(answer=='Y' || answer=='y') {//※만약 양쪽이 부정이면 ||이 아닌 &&를 사용
					break;//while문 종료
				}else if(answer=='N' || answer=='n') {
					System.out.println("프로그램을 종료합니다");
					return;//프로그램 실행 종료
				}else {
					System.out.println("잘못 입력하셨습니다.");
					//while문 반복
				}
				
			}
		}

	}

}
