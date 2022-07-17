package day3;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		
		/*
		※Cast String to int
		- Integer.parseInt();
		ex: int i = Integer.parseInt(s);
		- Integer.valueOf()
		ex: int i = Integer.valueOf(s);
		
		※Cast int to String
		- Integer.toString()
		ex: String s = Integer.toString(i);
		- String.valueOf()
		ex: String s = String.valueOf(i);
		- String.format()
		ex: String s = String.format("%d",i);
		- "" + int: 문자열에 int를 붙이면 문자열이 리턴된다
		ex: String s = "" + i;
		
		※Cast Character to String
		- Character.toString()
		ex: String s = Character.toString(c);
		- String.valueOf()
		ex: String s = String.valueOf(c);
		- "" + ch: 문자열에 Character을 붙이면 문자열이 리턴된다
		ex: String s = "" + c;
		*/
		
		int i = 10;
		String s = "15";
		char c = '5';
		
		//class 이름의 첫글자는 대문자 → Integer/Double: class임을 알 수 있다
		//Cast String to int
		int j = Integer.parseInt(s);
		System.out.println(j);//15
		j = Integer.valueOf(s);
		System.out.println(j);//15	
		
		//Cast int to String
		String d = Integer.toString(i);
		System.out.println(i);//10
		d = String.valueOf(i);
		System.out.println(i);//10
		d = String.format("%d",i);
		System.out.println(i);//10
		d = "" + i;
		System.out.println(i);//10	
		
		//Cast Character to String
		String f = Character.toString(c);
		System.out.println(c);//5
		f = String.valueOf(c);
		System.out.println(c);//5
		f = "" + c;
		System.out.println(c);//5
		
		System.out.println("------------------");
		
		/*
		ASCII(American Standard Code for Information Interchange): 아스키 코드. 미국 정보 교환 표준 부호
		Unicode = ASCII + 언어
		문자형 char의 표현범위: 0~64
		\n: 왼쪽 정렬. LF(Line Feed), ASCII 10
		\r: enter. CR(Carriage Return), ASCII 13
		A~Z: 65~90,	a~z: 97~122. 대문자와 소문자의 차이: ±32 ex: a-32=A
		
		Character: 문자 데이터를 정수 형태인 ASCII값으로 변환하여 처리한다.
		ex: ch = 'a';을 선언하면, 문자 a를 저장하는게 아니라 문자 a에 해당하는 정수값[내부적으로 변환된 ASCII값] 97이 저장된다
		만약 그대로 출력하면 문자 a가 출력된다.
		
		Integer.toString: Integer의 값을 나타내는 String 객체를 돌려주는데, Character 라인의 값으로 돌려준다
		→ ch = 'a';를 Integer.toString(ch)으로 형변환하면 ASCII값 97이 출력된다
		 */
		char ch,result;
		
		ch = '\n';//왼쪽 정렬
		System.out.println(Integer.toString(ch));//10
		
		ch = '\r';//enter
		System.out.println(Integer.toString(ch));//13
		
		int aa = ch;
		ch = 'a';//a: ASCII 97
		System.out.println(ch);//a
		System.out.println(Integer.toString(ch));//97		
		System.out.println(String.valueOf(ch));//a. int to String or Character to String
		System.out.println(String.format("%c", ch));//a
		System.out.println("" + ch);//a. int to String or Character to String
		
		//char를 int로 형변환
		i = (int)ch;
		System.out.println(i);//97
		System.out.println("------------------");
		
		/*
		System.in.read() : 입력한 값을 1byte씩[문자 하나씩] 읽어들여 int형인 ASCII값으로 변환해 출력한다.
		ex: abc 입력시 첫번째 문자인 a의 ASCII값 97을 출력한다
		BufferedReader, Scanner를 사용하지 않고 입력값을 받을 수 있으며,
		예외처리(throw IOException 등)를 반드시 해줘야 한다.
		
		System.out.print("한 개의 문자? ");//a
		int k = System.in.read();
		System.out.println(k);//97
		*/
		
		//대문자면 소문자로, 소문자면 대문자로 전환하여 출력
		System.out.print("한 개의 문자? ");//a
		
		//ch = System.in.read();//오류: ch는 int형이 아니다. a의 ASCII값 97을 정수 9와 7로 바꿈 (9,7)→(57,55)
		ch = (char) System.in.read();//정수형 int를 문자형인 char로 형변환.
		//ex: a입력시 숫자 97이 (char)를 통해 형변환되어 문자a로 출력된다
		
		/*
		ch>=65 && ch<=90 또는 ch>='a' && ch<='z'//A~Z에 대한 ASCII값
		ch>=97 && ch<=122 또는 ch>='A' && ch<='Z'//a~z에 대한 ASCII값
		
		부등호(비교)는 숫자로만 가능하므로 문자형 char으로 입력해도 Java가 스스로 값을 정수형 int로 바꾸지만,
		정수형 int가 문자형 char로 선언된 result에 들어갈 수 없으므로 형변환해준다
		 */
		result = ch>='A' && ch<='Z'?(char)(ch+32) : (ch>='a' && ch<='z'?(char)(ch-32):ch);//대문자도 소문자도 아니면 문자 그대로 출력
		System.out.println(ch + " : " + result);//a : A

	}

}
