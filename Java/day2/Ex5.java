package day2;//원하는만큼 사용자에게 질문하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		/*
		문자열: 문자를 나열한 배열 ex: Hello Java / a / 123
		
		String: 문자열을 나타내는 class. 값이 들어있는 위치의 좌표를 가짐→읽을수만 있고 내용변경은X.
				값이 같더라도 String 생성시마다 서로 다른 좌표가 생성되므로 '==' 사용 불가능→해결: .equals() 이용
		ex: String a = "Hello";
			a = a + "123";
			System.out.println(a);//Hello123
		
		char: 문자를 나타내는 자료형. 1개의 문자만 저장 가능(숫자0~9, 알파벳 대소문자, 특수기호)
			  변수 안에 값을 가지고, 그 값이 들어있는 위치의 좌표는 안 가짐. 값이 같을때 '==' 사용 가능
		ex: char a = '가';
		 */
		String name;
		int kor,eng,tot;
		
		//입력
		System.out.print("이름? ");//soo
		name = br.readLine();//readLine(): method. 저장되는 변수[반환값]는 항상 String(문자)
		
		System.out.print("국어? ");//90
		kor = Integer.parseInt(br.readLine());//문자를 정수로 형변환
		//이유: kor을 int로 선언했는데, readLine()은 반환값이 String(문자)이므로 int(정수형)로 형변환
		
		System.out.print("영어? ");//80
		eng = Integer.parseInt(br.readLine());
		
		//연산
		tot = kor + eng;
		
		//출력
		System.out.printf("\n%s님의 총점: %d점",name,tot);

	}

}
