package day3;

public class Ex3 {

	public static void main(String[] args) {
		
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
		
		Character: 만약 ch = 'a';라고 선언을 했으면, a를 가지고 있는게 아니라 ASCII값 97을 가지고 있다.
		그래서 그대로 출력하면 a가 출력되지만, Integer.toString으로 변환하면 97이 출력된다
		
		Integer.toString: Integer의 값을 나타내는 String 객체를 돌려주는데, 캐릭터 라인의 값으로 돌려준다
		*/
		
		int i = 10;
		String s = "15";
		char c = '5';
		
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

	}

}
