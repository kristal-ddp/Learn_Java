package day3;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		/*
		5. �ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� �������� ��, �Ǹűݾ��� ����ϴ� ���α׷�
		������: 10�� �̻� 10%, 20�� �̻� 15%, 30�� �̻� 20%
		ex: ���Լ��� 15�� �� ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��
		*/
		
		double rate=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ��ǰ�� ������ �Է��ϼ���. ");
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
		
		int total = (int)(15800*num*rate);//�����
		System.out.printf("���� ����: %d��, �Ǹ� �� �ݾ�: %d",num,total);
		
//		double total = 15800*num*rate;//�����
//		System.out.printf("���� ����: %d��, �Ǹ� �� �ݾ�: %g",num,total);

	}

}
