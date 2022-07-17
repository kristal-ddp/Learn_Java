package day2;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		※1. Data type 자료형(8개): 문자,실수 등을 구분지음		
		*char: 문자형,정수형. 1개의 문자만 저장 가능 ex: char a = '가';. 2byte
		*boolean: 논리형(true/false)
		byte: 정수형. 1byte
		short: 정수형. 2byte
		*int: 정수형 ex: ±a,0. 4byte(범위 -21억~+21억)
		long: 정수형. 8byte
		*float: 실수형,소수. 4byte. 실수 뒤에 f/F 붙여야 함
		*double: 실수형,소수. 8byte
		
		2. variable 변수: 변수명은 소문자 ex: num1. 변수에는 저장할 값을 담음
		*/
		int num1 = 20;//변수 선언 및 초기화
		//int num1,num2;//2개 변수를 한번에 선언할 수O
		int num2;//변수 선언
		num2 = 10;//변수 초기화
		
		/*
		값이 지정되지 않은 변수: 쓰레기 값이 들어있고, 볼 수 없다
		→ 기본값 0으로 초기화 ex: int num3=0; int num4=0;
		*/
		int num3,num4;
		
		//num1,num2 출력
		System.out.println(num1);//20
		System.out.println(num2);//10
		//System.out.println(num3); //컴파일 오류: 쓰레기값은 보여주지 않음
		//System.out.println(num4);
		System.out.println();
		
		//num1과 num2의 합,차 출력
		num3 = num1 + num2;//=: 대입연산자. 오른쪽 값을 왼쪽에 넣어줌
		num4 = num1 - num2;
		
		System.out.println(num3);//30
		System.out.println(num4);//10
		System.out.println();
		
		//연산내용 같이 출력
		System.out.println(num1 + "+" + num2 + "=" + num3);//20+10=30
		System.out.println(num1 + "-" + num2 + "=" + num4);//20-10=10
		System.out.println();
		
		//num1,num2에 새로운 값 입력후 출력
		num1 = 200;
		num2 = 100;
		//※여기서 num3,num4에 대해 코딩 안하면 위에서 선언한 값인 num3=30, num4=10이 출력됨
		num3 = num1 + num2;
		num4 = num1 - num2;
		
		System.out.println(num1 + "+" + num2 + "=" + num3);//300
		System.out.println(num1 + "-" + num2 + "=" + num4);//100
		System.out.println();
		
		//printf로 출력
		/*
		3. printf
		%d: 정수(int 등) 출력
		%f: f는 format의 약자. 실수(float,double)를 소수로 출력.
			소수점 2째자리까지 출력시 %.2f
		%e: 실수(float,double)를 지수로 출력
		%g: 실수(float,double)를 %f(소수)와 %e(지수) 중 짧게 표현할 수 있는 형태로 출력
			ex: 10.02, 2.33e+005. 소수점 2째자리까지 출력시 %.3g
		%c: 1개의 문자(char)만 출력 ex: char a = '가';
		%s: 문자열(char,string) 출력 ex: String b ="가나다";
		%n: printf에서만 쓰는 enter. but \n을 더 많이 사용
		*/
		System.out.printf("%d+%d=%d\n",num1,num2,num3);//200+100=300
		System.out.printf("%d-%d=%d",num1,num2,num4);//200-100=100
		System.out.printf("\n\n");
		
		char a= 'a';
		//char b = 'abc';//오류: char는 1개의 문자만 저장 가능
		String c= "abc";
		System.out.printf("%c, %s",a,a);
		System.out.println();
		System.out.printf("%s",c);
	}

}