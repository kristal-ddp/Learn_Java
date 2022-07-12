package day3;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		/*
		6. 이름과 3과목의 점수를 입력 받아 다음 조건에 따라 출력
		- 모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		- 한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		- 평균이 60점 미만이면 불합격

		이름 : 홍길동
		총점 : 210, 평균 : 70, 판정 :합격
		*/
		
		String judge = "";
		int total,avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. ");
		String name = sc.next();
		
		System.out.print("세 과목 점수를 입력하세요.[60 70 80] ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		total = kor + eng + mat;
		avg = total/3;
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			judge = "합격";
//		}else if((kor<40 || eng<40 || mat<40) && avg>=60) {
		}else if(avg>=60) {
			judge = "과락";
//		}else if(avg<60) {
		}else {
			judge = "불합격";
		}
		
		System.out.printf("이름: %s\n",name);
		System.out.printf("총점: %d점, 평균: %d점, 판정: %s",total,avg,judge);

	}

}
