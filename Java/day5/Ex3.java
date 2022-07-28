package day5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
//		년도,월,일을 입력받아 해당하는 요일을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int year,month,day,numberOfDay,week,i;
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String dayOftheWeek[] = {"일","월","화","수","목","금","토"};
		
		do {
			System.out.print("년도를 입력하세요. ");
			year = sc.nextInt();
		}while(year<1);
		
		do {
			System.out.print("월을 입력하세요. ");
			month = sc.nextInt();
		}while(month<1 || month>12);

//		윤년 계산
		if(year%4==0 && year%100!=0 || year%400==0) {
			days[1] = 29;
		}
		
		do {
			System.out.print("일을 입력하세요. ");
			day = sc.nextInt();
		}while(day<1 || day>days[month-1]);
		
//		1년1월1일 ~ (year-1)년12월31일까지의 날수 + 윤년
//		날수 계산		
		numberOfDay = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
//		year년1월1일 ~ (month-1)월말일까지의 날수
		for(i=0;i<month-1;i++) {
			numberOfDay += days[i];
		}
		
//		month월day일까지의 날수
		numberOfDay += day;
		
		week = numberOfDay%7;
		
		System.out.printf("%d년 %d월 %d일 %s요일",year,month,day,dayOftheWeek[week]);
		
		sc.close();

	}

}
