package day3;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		/*
		4. �⵵�� �Է¹޾� �������� ��������� ���
		ex: 2010 �Է½� �� 2010��: ���,
		2012 �Է½á� 2012��: ����
		*/
		
		String panjung="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���. ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			panjung = "����";
		}else {
			panjung = "���";
		}
		
		
		System.out.printf("%d��: %s",year,panjung);
		
	}

}
