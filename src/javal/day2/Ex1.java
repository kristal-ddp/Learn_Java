package javal.day2;

/*
- 접근지정자: 외부에서 class와 interface에 접근할 수 있는 범위를 지정
public: 외부 class가 자유롭게 사용 가능
protected: 같은 package 또는 다른 package에 속한 자식 class에서도 사용 가능
private: 개인적인 것. 외부에서 사용X. class 내부에서만 사용 가능
default: 위 3가지 접근지정자 적용되지 않을때. 같은 package에서만 사용 가능
public > protected > default > private

모든 프로그램은 class단위로 만듦
class: 이름의 첫글자는 대문자. 뒤에 다른 단어를 붙일때도 첫글자는 대문자 ex: System, CustomInfo
파일과 class의 이름은 동일해야함 ex: Ex1.java & class Ex1*/
public class Ex1 {

	/*void: return값X
	
	method(메소드): 실행 명령어. class 안에 여러개를 만들 수 있다. 이름의 첫글자는 소문자
	ex: print, println, customInfo
	main() method: 메인 메소드. java 명령어로 파일 실행하면 제일 먼저 mani() method가 실행됨
	main: method 이름. 정해져 있어서 바꾸면 안됨
	
	String: 문자. "@"*/
	public static void main(String[] args) {
		
		/*System이라는 class 안에 print, println이라는 method가 들어가있음
		print: 인수,매개변수 무조건 하나라도 써야함
		println: enter 역할. 매개변수 생략O
		\n: C언어,자바 등 모든 프로그램에서의 enter. ""안에 사용
		
		매개변수(parameter): 함수를 선언할 때 입력값의 형태를 정의해주는 변수.
							 실제로 값 존재X ex: int a에서 a, add(x,y)에서 x,y
		인수(argument): 함수를 호출할 때 매개변수에 담기는 값.
						메모리에 할당되어 있는 변수 ex: add(2,5)에서 2,5
		둘다 method 뒤 괄호() 안에 들어감 ex: main( ), print(" ")
		*/
		System.out.println("Today is my second day studying Java");
		System.out.print("Study hard\n\n");
		System.out.println();
		
		System.out.println("a");

	}

}

/*
괄호 클릭: 짝 괄호 표시
괄호 더블클릭: 영역 잡힘

저장버튼: javac가 실행됨
실행버튼: java가 실행됨

빨간줄: comfile 오류. 문법적으로 틀린 것. 고쳐주지 않으면 실행이 안됨
*/