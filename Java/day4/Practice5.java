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
		
		if(num1>num2) {//num1�� ������, num2�� ū�� ������ ����
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.printf("%d~%d������ ��: %d",num1,num2,sum);
		
		sc.close();

	}

}
