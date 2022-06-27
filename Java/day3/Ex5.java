package day3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//점수에 대한 판정을 하는 프로그램
		
		String name;
//		String judge = "";//①if-else if문, 초기화O
		String judge;//②if-else if-else문, 초기화X
		int kor;
		
		/*
		BufferedReader와 Scanner: 문자열을 입력받을때 사용한다
		BufferedReader: 데이터량이 많아도 속도가 빠르다 /
			문자열 String만 읽을 수 있다. Space를 String으로 인식한다. 형변환과 예외처리가 필요하다.
		Scanner: 데이터량이 많으면 속도가 느리다 /
			여러 데이터 타입(int,double,String 등)을 읽을 수 있다.
			Space, Enter을 경계로 인식한다. 별도의 형변환과 예외처리가 필요하지 않다.
		
		※Scanner을 사용해 1개의 값만 받을 때는 읽어내는 값 1개만 적어야한다(sc.next() or sc.nextInt())
		sc.next()은 반환값이 String, sc.nextInt()은 반환값이 int이므로
		따로 형변환할 필요가 없다(자동적으로 형변환)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름? ");
		name = sc.next();
		
		System.out.print("국어 점수? ");
		kor = sc.nextInt();
		
		/*
		if-else if문: 조건 1개에 작업 여러개. 하나의 상황에 대해서 여러개의 조건을 비교할 때
		※if-else if문에서 큰 숫자나 조건이 많은 순으로 적어야 한다
		*/
		
//		if(kor>=90) {//①if-else if문, 초기화O
//			judge = "[수]";
//		}else if(kor>=80) {
//			judge = "[우]";
//		}else if(kor>=70) {
//			judge = "[미]";
//		}else if(kor>=60) {
//			judge = "[양]";
//		}else if(kor<60) {
//			judge = "[가]";
//		}
		
		//if-else if-else문
		if(kor>=90) {//②if-else if-else문, 초기화X
			judge = "[수]";
		}else if(kor>=80) {
			judge = "[우]";
		}else if(kor>=70) {
			judge = "[미]";
		}else if(kor>=60) {
			judge = "[양]";
		}else{
			judge = "[가]";
		}
		
//		System.out.println(name + "님의 국어 점수는 " + kor +
//				"점이고 환산 점수는 " + judge + "입니다.");
		
		System.out.printf("%s님의 국어 점수는 %d점이고 환산 점수는 %s입니다.",name,kor,judge);
		
		sc.close();//※Scanner를 사용하면 sc.close();로 항상 닫아주는게 정석이다. 하지만 쓰지 않아도 오류는 나지 않는다.

	}

}
