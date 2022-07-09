package day3;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		/*
		4. 년도를 입력받아 윤년인지 평년인지를 출력
		ex: 2010 입력시 → 2010년: 평년,
		2012 입력시→ 2012년: 윤년
		*/
		
		String panjung="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요. ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			panjung = "윤년";
		}else {
			panjung = "평년";
		}
		
		
		System.out.printf("%d년: %s",year,panjung);
		
	}

}
