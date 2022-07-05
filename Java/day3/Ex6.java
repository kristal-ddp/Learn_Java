package day3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		//이름,점수를 입력받아 총점을 계산하는 프로그램
		
		String name;
		int kor,eng,mat,tot;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Scanner에서 연속으로 입력값을 받을 때는 구분자(Space,Enter,쉼표 등)가 필요하다.
		→Space나 쉼표로 데이터를 구분하여, 여러 데이터를 한 줄에 입력받을 수 있다.
		
		Scanner class의 useDelimiter method를 이용하여 사용자 지정 구분자를 사용할 수 있다.
		
		※Scanner을 사용해 여러개의 입력값을 받을 때는 읽어내는 값도 여러개 적어야한다
		 */
//		System.out.print("이름 국어 영어 수학? ");//soo 100 90 80 ①공백으로 구분
		System.out.print("이름,국어,영어,수학? ");//soo,100,90,80 ②쉼표로 구분
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");//②쉼표가 있으면 읽는 것을 멈춘다
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor+eng+mat;
		
		System.out.println(name + "의 총점: " + tot + "점");
		
		sc.close();		

	}

}
