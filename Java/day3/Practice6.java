package day3;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		/*
		6. �̸��� 3������ ������ �Է� �޾� ���� ���ǿ� ���� ���
		- ��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
		- �Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
		- ����� 60�� �̸��̸� ���հ�

		�̸� : ȫ�浿
		���� : 210, ��� : 70, ���� :�հ�
		*/
		
		String judge = "";
		int total,avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���. ");
		String name = sc.next();
		
		System.out.print("�� ���� ������ �Է��ϼ���.[60 70 80] ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		total = kor + eng + mat;
		avg = total/3;
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			judge = "�հ�";
//		}else if((kor<40 || eng<40 || mat<40) && avg>=60) {
		}else if(avg>=60) {
			judge = "����";
//		}else if(avg<60) {
		}else {
			judge = "���հ�";
		}
		
		System.out.printf("�̸�: %s\n",name);
		System.out.printf("����: %d��, ���: %d��, ����: %s",total,avg,judge);

	}

}
