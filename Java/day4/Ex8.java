package day4;

import java.io.IOException;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) throws IOException {
		
		//switch������ ���� ����� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		int cal=0;
		
		System.out.print("ù��° ���� �Է��ϼ���. ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���. ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���.[+,-,*,/] ");
//		char operator = sc.next().charAt(0);
		char operator = (char)System.in.read();
		
		/*if(operator=='+') {//���1
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�");		
		}
		
		System.out.printf("%d %s %d = %d",num1,operator,num2,cal);
		
	}

}
