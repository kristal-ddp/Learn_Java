package day4;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		/*
		5. 2���� ���� �Է¹޾� ���� ������ ū �������� ���� ���ϴ� ���α׷�
		1~100 ������ �� : 5050
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int temp,i,sum=0;
		
		System.out.print("2���� ���� �Է��ϼ���.[a b] ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		/*if(num1>num2) {//num1�� ������, num2�� ū�� ������ ���� //���1
			temp = num1;
			num1 = num2;
			num2 = temp;
		}*/
		
		
		/*
		^: ��������. XOR. ��Ʈ������ �� �� 1�� Ȧ������ 1, ¦������ 0�� ��ȯ�Ѵ�
		10������2����: ���� 0�� �� ������ 2�� ���� ��, ������ ���� �������� �д´�
		2������10����: 2^n������ ���Ѵ�
		ex) 1010=2^3+2^1=8+2=10
		*/
		if(num1>num2) {//num1�� ������, num2�� ū�� ������ ����. num1=10, num2=5 //���2
			num1 = num1^num2;//num1=1010^101=1111
			num2 = num1^num2;//num2=1111^101=1010��10
			num1 = num1^num2;//num1=1111^1010=0101��5
		}//��num1=5, num2=10
		
		for(i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.printf("%d~%d������ ��: %d",num1,num2,sum);
		
		sc.close();

	}

}
