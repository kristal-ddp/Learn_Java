package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String judge1,judge2,judge3,judge4,judge5;
		
		System.out.print("�� �Է�? ");//2022
		num = Integer.parseInt(br.readLine());
		
		/*
		�ػ��� ������: ���ǹ� ? ������ ���� ��(true) : ������ ���� ����(false)
		�� �ٿ� �Է� ���ɡ�ܼ��� if�� ��� ���
		
		�� ������: >,<,>=,<=,==,!=
		==: ����
		!=: ���� �ʴ�
		�� ������: !,&,|,&&,||
		A && B: A and B. A,B �Ѵ� true�̸� true
		A || B: A or B. A �Ǵ� B �� 1���� true�̸� true
		*/
		//¦��,Ȧ��,0 �Ǵ�
		judge1 = num % 2 == 0 ? "¦��" : "Ȧ��";//0 ����
		judge2 = num % 2 == 0 ? (num == 0 ? "0" : "¦��") : "Ȧ��";//0����
		judge3 = num % 2 != 0 ? "Ȧ��" : (num == 0 ? "0" : "¦��");//0 ����
		//Ȧ���� �ƴϸ� 0 �Ǵ� ¦���ε�, su == 0�̸� 0, su != 0�̸� ¦��
		
		//���� 0�� ������
		System.out.println(judge1);//¦��
		System.out.println(judge2);//0
		System.out.println(judge3);//0
		System.out.println();
		
		//���,����,0 �Ǵ�
		judge1 = num > 0 ? "���" : "����";//0 ����
		judge2 = num > 0 ? "���" : (num == 0 ? "0" : "����");//0 ����
		judge3 = num > 0 ? "���" : (num < 0 ? "����" : "0");//0 ����
		
		//���� 0�� ������
		System.out.println(judge1);//����
		System.out.println(judge2);//0
		System.out.println(judge3);//0
		System.out.println();
		
		/*
		����: ������ 4�� ������ �������鼭 100���� ������ �������� �ʴ� ��,
			  ������ 4�� 400���� ������ �������� ��
		�������: ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ��
		&& ���ʰ� �������� ���ÿ� �����ϸ� ����
		 */
		//����,��� �Ǵ�
		judge1 = num % 4 == 0 && num % 100 != 0 || num % 400 == 0 ?  "����" : "���";
		
		System.out.println(num + "��: " + judge1);

	}

}
