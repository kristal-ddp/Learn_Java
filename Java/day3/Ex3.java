package day3;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		
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
		*/
		
		int i = 10;
		String s = "15";
		char c = '5';
		
		//class �̸��� ù���ڴ� �빮�� �� Integer/Double: class���� �� �� �ִ�
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
		ASCII(American Standard Code for Information Interchange): �ƽ�Ű �ڵ�. �̱� ���� ��ȯ ǥ�� ��ȣ
		Unicode = ASCII + ���
		������ char�� ǥ������: 0~64
		\n: ���� ����. LF(Line Feed), ASCII 10
		\r: enter. CR(Carriage Return), ASCII 13
		A~Z: 65~90,	a~z: 97~122. �빮�ڿ� �ҹ����� ����: ��32 ex: a-32=A
		
		Character: ���� �����͸� ���� ������ ASCII������ ��ȯ�Ͽ� ó���Ѵ�.
		ex: ch = 'a';�� �����ϸ�, ���� a�� �����°� �ƴ϶� ���������� ��ȯ�� ASCII�� 97�� ������ �ִ�.
		���� �״�� ����ϸ� ���� a�� ��µȴ�.
		
		Integer.toString: Integer�� ���� ��Ÿ���� String ��ü�� �����ִµ�, Character ������ ������ �����ش�
		�� ch = 'a';�� Integer.toString(ch)���� ����ȯ�ϸ� ASCII�� 97�� ��µȴ�
		 */
		char ch,result;
		
		ch = '\n';//���� ����
		System.out.println(Integer.toString(ch));//10
		
		ch = '\r';//enter
		System.out.println(Integer.toString(ch));//13
		
		ch = 'a';//a: ASCII 97
		System.out.println(ch);//a
		System.out.println(Integer.toString(ch));//97		
		System.out.println(String.valueOf(ch));//a. int to String or Character to String
		System.out.println(String.format("%c", ch));//a
		System.out.println("" + ch);//a. int to String or Character to String
		
		//char�� int�� ����ȯ
		i = (int)ch;
		System.out.println(i);//97
		System.out.println("------------------");
		
		/*
		System.in.read() : �Է��� ���� 1byte��[���� �ϳ���] �о�鿩 int���� ASCII������ ��ȯ�� ����Ѵ�.
		ex: abc �Է½� ù��° ������ a�� ASCII�� 97�� ����Ѵ�
		BufferedReader, Scanner�� ������� �ʰ� �Է°��� ���� �� ������,
		����ó��(throw IOException ��)�� �ݵ�� ����� �Ѵ�.
		
		System.out.print("�� ���� ����? ");//a
		int k = System.in.read();
		System.out.println(k);//97
		*/
		
		//�빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� ��ȯ�Ͽ� ���
		System.out.print("�� ���� ����? ");//a
		
		//ch = System.in.read();//����: ch�� int���� �ƴϴ�. a�� ASCII�� 97�� ���� 9�� 7�� �ٲ� (9,7)��(57,55)
		ch = (char) System.in.read();//������ int�� �������� char�� ����ȯ.
		//ex: a�Է½� ���� 97�� (char)�� ���� ����ȯ�Ǿ� ����a�� ��µȴ�
		
		/*
		ch>=65 && ch<=90 �Ǵ� ch>='a' && ch<='z'//A~Z�� ���� ASCII��
		ch>=97 && ch<=122 �Ǵ� ch>='A' && ch<='Z'//a~z�� ���� ASCII��
		
		�ε�ȣ(��)�� ���ڷθ� �����ϹǷ� ������ char���� �Է��ص� Java�� ������ ���� ������ int�� �ٲ�����,
		������ int�� ������ char�� ����� result�� �� �� �����Ƿ� ����ȯ���ش�
		 */
		result = ch>='A' && ch<='Z'?(char)(ch+32) : (ch>='a' && ch<='z'?(char)(ch-32):ch);//�빮�ڵ� �ҹ��ڵ� �ƴϸ� ���� �״�� ���
		System.out.println(ch + " : " + result);//a : A

	}

}
