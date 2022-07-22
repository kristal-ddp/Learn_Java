package day4;

import java.io.IOException;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) throws IOException {
		
		//switch문으로 계산기 만드는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int cal=0;
		
		System.out.print("첫번째 수를 입력하세요. ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요. ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요.[+,-,*,/] ");
//		char operator = sc.next().charAt(0);
		char operator = (char)System.in.read();
		
		/*if(operator=='+') {//방법1
			cal = num1 + num2;
		}else if(operator=='-') {
			cal = num1 - num2;
		}else if(operator=='*') {
			cal = num1 * num2;
		}else if(operator=='/') {
			cal = num1 / num2;
		}*/
		
		switch(operator) {
		
		case '+':
			cal = num1 + num2;
			break;
		case '-':
			cal = num1 - num2;
			break;
		case '*':
			cal = num1 * num2;
			break;
		case '/':
			cal = num1 / num2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다");		
		}
		
		System.out.printf("%d %s %d = %d",num1,operator,num2,cal);
		
	}

}
