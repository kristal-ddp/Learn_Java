package day5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
//		�迭�� ����޷� ����� [�⵵�� ���� �Է¹޾� �ش��ϴ� �޷� �����ֱ�]
		
		Scanner sc = new Scanner(System.in);
		
		int year,month,numberOfDay,i,week;//numberOfDay: ����
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};//�迭 ���� �� �ʱ�ȭ
		
		do {
			System.out.print("�⵵�� �Է��ϼ���. ");
			year = sc.nextInt();
		}while(year<1);
		
		do {
			System.out.print("���� �Է��ϼ���. ");
			month = sc.nextInt();
		}while(month<1 || month>12);
		
//		����
		if(year%4==0 && year%100!=0 || year%400==0) {
			day[1] = 29;
		}
		
		
//		2022��6��1���� ���� = 1��1��1��~2021��12��31�ϱ����� ����(���� ����) + 2022�� 1~5���� ���� + 1��
		
//		1��1��1�� ~ (year-1)��12��31�ϱ����� ���� + ����
		numberOfDay = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
		/*
		��(month):		1  2  3  4  5 |��6  7  8  9 10 11 12 : month
		����(day):		31,28,31,30,31|,30,31,31,30,31,30,31
		index(month-1):	0  1  2  3  4 |  5  6  7  8  9 10 11 : month-1
		*/
//		year��1��1�� ~ (month-1)�����ϱ����� ����
		for(i=0;i<month-1;i++) {
			numberOfDay += day[i];
		}
		
//		month��1�ϱ����� ����
		numberOfDay++;
		
		/*
		week: ���� ��. ��(0),��(1),ȭ(2),��(3),��(4),��(5),��(6)
		1��1��1�� ������
		*/
		week = numberOfDay%7;//0~6
		
//		System.out.println("���� ��: " + week); //2022��6���� �Է��ϸ� 3�� ��µȴ١�����Ϻ��� 1��
		
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");//�ѱ��� 2byte. ������ 1byte �� ���� �ϳ��� 4byte��
		System.out.println("------------------------------");
		
		/*
		4byte*3 ������ �����Ͽ� 1���� �������Ѵ�
		�� ���ϴ� week(ex: week=3�� ������)���� ���������� ���� �Է�
		*/
//		�����ϴ� week ������ ����4ĭ
		for(i=0;i<week;i++) {
			System.out.print("    ");
		}
		
//		�ش� ���� ��¥ ���
		for(i=1;i<=day[month-1];i++) {//6���̸� index(5)���� ���
			System.out.printf("%4d",i);
			
			week++;//day�� 1�� ����(1,2,3,��)�� ������ week�� 1(3,4,5,��)�� �����Ѵ�
//			week�� �������� ������ �ش� ���� ù��° week�� ��µȴ� (ex: 2022��6�� �Է½� week=3)
			
			if(week%7==0) {//����� ����� week++�� �Ͽ����� �ʡ��ٹٲޡ��Ͽ����� �����ٿ� ��µ�
				System.out.println();
			}	
		}
		
		if(week%7!=0) {
			System.out.println();//������ ������̸� �ڵ����� �ٹٲ�. �� �ܿ��� �ٹٲ�ó�� �������
		}
		
		System.out.println("------------------------------");
		
		//cf) Excel���� 2022-06-01 ���� �� ����-�Ϲ�-'44713' �� �ϼ�
	}

}
