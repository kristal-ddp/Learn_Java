package javal.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {//���� ����� ���α׷�

	public static void main(String[] args) throws IOException {
		
		//����
		int num1,num2;//����ڿ��� ������(����2��)�� �Է¹���
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//�Է�
		System.out.print("ù��° ��? ");//10
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ��? ");//3
		num2 = Integer.parseInt(br.readLine());
		
		/*
		���� ǥ����[���Խ�]: Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���� �� ����ϴ� ���� ������ ���.
			��� ��ǻ�Ϳ��� ���������� �νĵ�
		\t: tap
		\n: enter. �ٹٲ�
		
		���  ������: +,-,*,/,%
		/: ���� ����. ������X
		%: �������� ����. printf������ "%%"�� ǥ��
		�� ������: >,<,>=,<=,==,!=
		�� ������: !,&,|,&&,||
		�غ� �����ڿ� �� �������� ������� boolean(true/false)���� ���´�
		���� ������: =,+=,-=,*=,/=,%=
		
		������ �켱����: �����񱳡������� ������
		 */
		//printf�� ���
		System.out.printf("����: %d + %d = %d\n",num1,num2,(num1+num2));//10+3=13
		System.out.printf("����: %d - %d = %d\n",num1,num2,(num1-num2));//10-3=7
		System.out.printf("���ϱ�: %d * %d = %d\n",num1,num2,(num1*num2));//10*3=30
		System.out.printf("��: %d / %d = %d\n",num1,num2,(num1/num2));//10/3=3
		System.out.printf("������: %d %% %d = %d\n",num1,num2,(num1%num2));//10%3=1
		System.out.printf("ù��° �� > �ι�° �� : %s\n",(num1>num2));//������ true,Ʋ���� false
		System.out.println();
		
		//println���� ���
		System.out.println("����: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("����: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("����: " + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("����: " + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("����: " + num1 + " % " + num2 + " = " + (num1%num2));
		System.out.println("ù��° �� > �ι�° �� : " + (num1>num2));
		//�켱������ ���(+)���(>)�̹Ƿ�, num1>num2�� ��ȣ ��� �ؾ���

	}

}
