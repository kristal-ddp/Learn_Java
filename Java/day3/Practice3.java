package day3;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		/*
		3. �� ���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
		ex: 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20
		*/

		int num1,num2,num3,num4,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4���� ������ �Է��ϼ���.[1 2 3 4] ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
//		�� 6�� ��
//		��������(���� ����ū ��)
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num3>num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("���� ū ����: %d, ���� ���� ����: %d",num4,num1);
		
	}

}
