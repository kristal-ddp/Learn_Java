package day5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
//		�⵵,��,���� �Է¹޾� �ش��ϴ� ������ ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int year,month,day,numberOfDay,week,i;
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String dayOftheWeek[] = {"��","��","ȭ","��","��","��","��"};
		
		do {
			System.out.print("�⵵�� �Է��ϼ���. ");
			year = sc.nextInt();
		}while(year<1);
		
		do {
			System.out.print("���� �Է��ϼ���. ");
			month = sc.nextInt();
		}while(month<1 || month>12);

//		���� ���
		if(year%4==0 && year%100!=0 || year%400==0) {
			days[1] = 29;
		}
		
		do {
			System.out.print("���� �Է��ϼ���. ");
			day = sc.nextInt();
		}while(day<1 || day>days[month-1]);
		
//		1��1��1�� ~ (year-1)��12��31�ϱ����� ���� + ����
//		���� ���		
		numberOfDay = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
//		year��1��1�� ~ (month-1)�����ϱ����� ����
		for(i=0;i<month-1;i++) {
			numberOfDay += days[i];
		}
		
//		month��day�ϱ����� ����
		numberOfDay += day;
		
		week = numberOfDay%7;
		
		System.out.printf("%d�� %d�� %d�� %s����",year,month,day,dayOftheWeek[week]);
		
		sc.close();

	}

}
