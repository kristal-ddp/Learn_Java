package javal.day2;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		��1. Data type �ڷ���(8��): ����,�Ǽ� ���� ��������		
		*char: ������. 1���� ���ڸ� ���� ���� ex: char a = '��';. 2byte
		*boolean: ����(true/false)
		byte: ������. 1byte
		short: ������. 2byte
		*int: ������ ex: ��a,0. 4byte(���� -21��~+21��)
		long: ������. 8byte
		*float: �Ǽ���,�Ҽ�. 4byte. �Ǽ� �ڿ� f/F �ٿ��� ��
		*double: �Ǽ���,�Ҽ�. 8byte
		
		2. variable ����: �������� �ҹ��� ex: num1. �������� ������ ���� ����
		*/
		int num1 = 20;//���� ���� �� �ʱ�ȭ
		//int num1,num2;//2�� ������ �ѹ��� ������ ��O
		int num2;//���� ����
		num2 = 10;//���� �ʱ�ȭ
		
		/*
		���� �������� ���� ����: ������ ���� ����ְ�, �� �� ����
		�� �⺻�� 0���� �ʱ�ȭ ex: int num3=0; int num4=0;
		*/
		int num3,num4;
		
		//num1,num2 ���
		System.out.println(num1);//20
		System.out.println(num2);//10
		//System.out.println(num3); //������ ����: �����Ⱚ�� �������� ����
		//System.out.println(num4);
		System.out.println();
		
		//num1�� num2�� ��,�� ���
		num3 = num1 + num2;//=: ���Կ�����. ������ ���� ���ʿ� �־���
		num4 = num1 - num2;
		
		System.out.println(num3);//30
		System.out.println(num4);//10
		System.out.println();
		
		//���곻�� ���� ���
		System.out.println(num1 + "+" + num2 + "=" + num3);//20+10=30
		System.out.println(num1 + "-" + num2 + "=" + num4);//20-10=10
		System.out.println();
		
		//num1,num2�� ���ο� �� �Է��� ���
		num1 = 200;
		num2 = 100;
		//�ؿ��⼭ num3,num4�� ���� �ڵ� ���ϸ� ������ ������ ���� num3=30, num4=10�� ��µ�
		num3 = num1 + num2;
		num4 = num1 - num2;
		
		System.out.println(num1 + "+" + num2 + "=" + num3);//300
		System.out.println(num1 + "-" + num2 + "=" + num4);//100
		System.out.println();
		
		//printf�� ���
		/*
		3. printf
		%d: ����(int ��) ���
		%f: f�� format�� ����. �Ǽ�(float,double)�� �Ҽ��� ���.
			�Ҽ��� 2°�ڸ����� ��½� %.2f
		%e: �Ǽ�(float,double)�� ������ ���
		%g: �Ǽ�(float,double)�� %f(�Ҽ�)�� %e(����) �� ª�� ǥ���� �� �ִ� ���·� ���
			ex: 10.02, 2.33e+005. �Ҽ��� 2°�ڸ����� ��½� %.3g
		%c: 1���� ����(char)�� ��� ex: char a = '��';
		%s: ���ڿ�(char,string) ��� ex: Spring b ="������";
		%n: printf������ ���� enter. but \n�� �� ���� ���
		*/
		System.out.printf("%d+%d=%d\n",num1,num2,num3);//200+100=300
		System.out.printf("%d-%d=%d",num1,num2,num4);//200-100=100
		System.out.printf("\n\n");
		
		char a= 'a';
		//char b = 'abc';//����: char�� 1���� ���ڸ� ���� ����
		String c= "abc";
		System.out.printf("%c, %s",a,a);
		System.out.println();
		System.out.printf("%s",c);
	}

}