package day2;

public class Ex7 {

	public static void main(String[] args) {
		
		float num1 = 0;
		double num2 = 0;
		
		//float,double�� �Ǽ����̹Ƿ� 0�� ������ 0.0�� ��µ�
		System.out.println("float: " + num1);//0.0
		System.out.println("double: " + num2);//0.0
		System.out.println();
		
		for(int i=0;i<1000000;i++) {//i++ == i=i+1
			num1 += 1000000;
			num2 += 1000000;
		}
		
		/*
		- float�� double�� ���е� ��
		�Ǽ��� ������ Ÿ��(float,double)���� ������ �����ϴµ�, �� �������� ǥ���� �� �ִ� ������ ��ȿ�ڸ����� ��Ÿ����.
		��ȿ�ڸ����� float�� 7�ڸ�, double�� 16�ڸ��̹Ƿ�, float���� double�� ���е��� �� ����
		��شܼ��� ��� �ܿ� ������ ����ÿ��� float���� double ���
		*/
		System.out.println("float: " + num1);//9.9642625E11
		System.out.println("double: " + num2);//1.0E12
		System.out.println();
		System.out.println("float: " + num1/1000000);//996426.25
		System.out.println("double: " + num2/1000000);//1000000.0

	}

}
