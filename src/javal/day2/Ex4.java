package javal.day2;//컴퓨터와 대화하는 프로그램 만들기

/*
import: 다른 package의 class나 자주 사용하지 않는 것들을 사용할 때 package 이름.class 이름 명시해야함.
만약 import 사용하면 class 이름만 적으면 됨
ex: java.util.Random rd = new java.util.Random();
→ import java.util.Random; & Random rand = new Random();

같은 package의 class나 자주 사용하는 java.lang package(ex: System)의 class를 사용할때는 import 필요X
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		/*
		BufferedReader: 사용자에게 값을 입력받을 때 사용. java가 이미 만들어 놓은 것을 가져와서 쓰는 것
		Stream: 한 곳에서 다른 곳으로의 데이터 흐름
				단방향이므로 입력과 출력 동시 발생할 수X. InputStream, OutputStream으로 나뉜다
		System.in: 입력받은 데이터를 10진수로 변환하여 int형 변수에 저장.
				   1byte 단위(ASCII 값. A,a,1,#)로만 입력받음. 2byte(한글 ex: 가)는 제대로 인식X
		InputStreamReader: System.in으로 받은 문자를 2byte로 변경(입력 데이터를 char형태로 변환)
		BufferedReader: 2byte로 변경된 문자를 저장(String인 문자열로 저장)
		BufferedReader br ≒ int r. 표현 방식이 비슷함
		*/
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int r;
		double area,perimeter;//넓이,둘레
		
		/*
		print: Console 입력시 바로 옆에 위치
		println: Console 입력시 한칸 아래에 위치
		 */
		System.out.print("반지름? ");//123(ASCII 49,50,51)
		//System.out.println("반지름? ");
		
		
		/*
		readLine: method. 저장되는 변수는 항상 String(문자)
		r = br.readLine();//오류: r은 int로 선언되어 정수인데, readLine은 값을 문자로 읽음
		
		parse: 변환하라는 뜻
		Integer.parseInt(br.readLine()): readLine을 Int로 변환하라
		String.valueOf(a): integer나 char인 a를 String으로 변환하라
		*/
		r = Integer.parseInt(br.readLine());
		/*
		빨간줄: 사용자의 숫자 입력방식에 따라 오류가 발생할 수 있음을 알림 ex: 20, 이십, 2십
		→ readLine은 throws IOException과 함께 사용해야 함
		throws IOException: 입출력 예외처리
		예외가 발생한 함수를 호출한 함수에서 예외처리한다. 모든 특이사항은 던져버린다(throws)
		→ 빨간줄 선택 후 Add throws declaration 누르면 throws NumberFormatException, IOException 뜬다
		→ NumberFormatException, 삭제
		*/
		
		//if int가 아닌 double의 경우
		//double r;
		//r = Double.parseDouble(br.readLine());
		
		
		area = 3.14*r*r;
		perimeter = 2*3.14*r;
		
		System.out.printf("반지름: %d\n",r);
		System.out.printf("넓이: %.2f\n",area);
		System.out.printf("둘레: %.2f",perimeter);

	}

}

/*
\n: enter
\r: 왼쪽으로 정렬

코드 입력시 일정부분 쓰고 Ctrl+Space하면 편리함
*/