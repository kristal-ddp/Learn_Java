package day3;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		��Cast String to int
		- Integer.parseInt();
		ex: int i = Integer.parseInt(s);
		- Integer.valueOf()
		ex: int i = Integer.valueOf(s);
		
		��Cast int to String
		- Integer.toString()
		ex: String s = Integer.toString(i);
		- String.valueOf()
		ex: String s = String.valueOf(i);
		- String.format()
		ex: String s = String.format("%d",i);
		- "" + int: ���ڿ��� int�� ���̸� ���ڿ��� ���ϵȴ�
		ex: String s = "" + i;
		
		��Cast Character to String
		- Character.toString()
		ex: String s = Character.toString(c);
		- String.valueOf()
		ex: String s = String.valueOf(c);
		- "" + ch: ���ڿ��� Character�� ���̸� ���ڿ��� ���ϵȴ�
		ex: String s = "" + c;
		
		Character: ���� ch = 'a';��� ������ ������, a�� ������ �ִ°� �ƴ϶� ASCII�� 97�� ������ �ִ�.
		�׷��� �״�� ����ϸ� a�� ��µ�����, Integer.toString���� ��ȯ�ϸ� 97�� ��µȴ�
		
		Integer.toString: Integer�� ���� ��Ÿ���� String ��ü�� �����ִµ�, ĳ���� ������ ������ �����ش�
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
