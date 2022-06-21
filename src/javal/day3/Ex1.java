package javal.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {//계산기 만드는 프로그램

	public static void main(String[] args) throws IOException {
		
		//선언
		int num1,num2;//사용자에게 데이터(정수2개)를 입력받음
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//입력
		System.out.print("첫번째 수? ");//10
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수? ");//3
		num2 = Integer.parseInt(br.readLine());
		
		/*
		정규 표현식[정규식]: 특정한 규칙을 가진 문자열의 집합을 표현할 때 사용하는 축약된 형식의 언어.
			모든 컴퓨터에서 공통적으로 인식됨
		\t: tap
		\n: enter. 줄바꿈
		
		산술  연산자: +,-,*,/,%
		/: 몫을 구함. 나누기X
		%: 나머지를 구함. printf에서는 "%%"로 표현
		비교 연산자: >,<,>=,<=,==,!=
		논리 연산자: !,&,|,&&,||
		※비교 연산자와 논리 연산자의 결과값은 boolean(true/false)으로 나온다
		대입 연산자: =,+=,-=,*=,/=,%=
		
		연산자 우선순위: 산술→비교→논리→대입 연산자
		 */
		//printf로 출력
		System.out.printf("덧셈: %d + %d = %d\n",num1,num2,(num1+num2));//10+3=13
		System.out.printf("뺄셈: %d - %d = %d\n",num1,num2,(num1-num2));//10-3=7
		System.out.printf("곱하기: %d * %d = %d\n",num1,num2,(num1*num2));//10*3=30
		System.out.printf("몫: %d / %d = %d\n",num1,num2,(num1/num2));//10/3=3
		System.out.printf("나머지: %d %% %d = %d\n",num1,num2,(num1%num2));//10%3=1
		System.out.printf("첫번째 수 > 두번째 수 : %s\n",(num1>num2));//맞으면 true,틀리면 false
		System.out.println();
		
		//println으로 출력
		System.out.println("덧셈: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("덧셈: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("덧셈: " + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("덧셈: " + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("덧셈: " + num1 + " % " + num2 + " = " + (num1%num2));
		System.out.println("첫번째 수 > 두번째 수 : " + (num1>num2));
		//우선순위는 산술(+)→비교(>)이므로, num1>num2에 괄호 사용 해야함

	}

}
