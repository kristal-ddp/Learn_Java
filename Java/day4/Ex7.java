package day4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//switch������ �� ����ϴ� ���α׷�
		int i,j,num;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("1~5 �̳��� ���� �Է��ϼ���. ");
			num = sc.nextInt();
			
		}while(num<1 || num>5);
		
		/*for(i=1;i<=num;i++) {//���1
			System.out.print("*");
		}*/
		
		/*if(num==1) {//���2
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
		- switch��
		������ ���� ���� ����ȴ�
		�ڵ尡 ���� case���� �ѹ��� ���� �� �ִ�
		���� if���� switch���� ���� �ٲ� �� �ִ�
		default: ������ case�� �ش��ϴ� ������ �ƴ� ���. ���� �����ϴ�
		
		switch(����){
		case ��1:
			���๮
			break;
		case ��2:
			���๮
			break;
		case ��3:
		case ��4:
			���๮
			break;
		default:
			���๮
			break;
		}
		*/
		switch(num) {//���3
		
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
