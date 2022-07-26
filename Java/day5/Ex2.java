package day5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
//		배열로 만년달력 만들기 [년도와 월을 입력받아 해당하는 달력 보여주기]
		
		Scanner sc = new Scanner(System.in);
		
		int year,month,numberOfDay,i,week;//numberOfDay: 날수
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};//배열 생성 및 초기화
		
		do {
			System.out.print("년도를 입력하세요. ");
			year = sc.nextInt();
		}while(year<1);
		
		do {
			System.out.print("월을 입력하세요. ");
			month = sc.nextInt();
		}while(month<1 || month>12);
		
//		윤년
		if(year%4==0 && year%100!=0 || year%400==0) {
			day[1] = 29;
		}
		
		
//		2022년6월1일의 날수 = 1년1월1일~2021년12월31일까지의 날수(윤년 포함) + 2022년 1~5월의 날수 + 1일
		
//		1년1월1일 ~ (year-1)년12월31일까지의 날수 + 윤년
		numberOfDay = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
		/*
		월(month):		1  2  3  4  5 |∨6  7  8  9 10 11 12 : month
		날수(day):		31,28,31,30,31|,30,31,31,30,31,30,31
		index(month-1):	0  1  2  3  4 |  5  6  7  8  9 10 11 : month-1
		*/
//		year년1월1일 ~ (month-1)월말일까지의 날수
		for(i=0;i<month-1;i++) {
			numberOfDay += day[i];
		}
		
//		month월1일까지의 날수
		numberOfDay++;
		
		/*
		week: 주의 수. 일(0),월(1),화(2),수(3),목(4),금(5),토(6)
		1년1월1일 월요일
		*/
		week = numberOfDay%7;//0~6
		
//		System.out.println("주의 수: " + week); //2022년6월을 입력하면 3이 출력된다→수요일부터 1일
		
		System.out.println("  일  월  화  수  목  금  토");//한글은 2byte. 공백은 1byte → 요일 하나에 4byte씩
		System.out.println("------------------------------");
		
		/*
		4byte*3 이후인 수요일에 1일이 찍혀야한다
		→ 원하는 week(ex: week=3인 수요일)보다 작을때까지 공백 입력
		*/
//		시작하는 week 전까지 공백4칸
		for(i=0;i<week;i++) {
			System.out.print("    ");
		}
		
//		해당 월의 날짜 출력
		for(i=1;i<=day[month-1];i++) {//6월이면 index(5)까지 출력
			System.out.printf("%4d",i);
			
			week++;//day가 1씩 증가(1,2,3,…)될 때마다 week가 1(3,4,5,…)씩 증가한다
//			week가 증가되지 않으면 해당 월의 첫번째 week만 출력된다 (ex: 2022년6월 입력시 week=3)
			
			if(week%7==0) {//토요일 출력후 week++로 일요일이 됨→줄바꿈→일요일은 다음줄에 출력됨
				System.out.println();
			}	
		}
		
		if(week%7!=0) {
			System.out.println();//말일이 토요일이면 자동으로 줄바꿈. 그 외에는 줄바꿈처리 해줘야함
		}
		
		System.out.println("------------------------------");
		
		//cf) Excel에서 2022-06-01 적고 셀 서식-일반-'44713' → 일수
	}

}
