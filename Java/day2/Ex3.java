package day2;

public class Ex3 {

	public static void main(String[] args) {
		
		int r = 10;
		float area, perimeter;//perimeter: �ѷ�
		area = 10;
		
		//������,���� ���
		System.out.println(r);//10
		System.out.println(area);//10.0
		System.out.println();
		
		
		/*
		ũ��: �Ǽ���(float,double) >= ������(int) �� 10.0>10
		�� 1. ū���� �������� ���� ��O, �������� ū���� ���� ��X
		�� 10�� 10.0�� ���� ��O, 10.0�� 10�� ���� ��X

		double b=10.0;//����X
		b=10;

		r = 10.0;//����: r = 10.0; == r = (double)10.0;
		r = (float)10.0;//����: float���� int�� �� �� ����
		r = (double)10.0;//����: double���� int�� �� �� ����

		�� ��2. �������� ū���� �������� ����ȯ!
		r = (int)10.0;//����X: 10.0�� int(������)���� ����ȯ
		r = Integer.parseInt(br.readLine());//�ڴ� ����� ���

		��Integer.parseInt(br.readLine())
		Integer: ������
		parselnt: ��ȯ
		readLine(): BufferedReader�� method. �̸� ���� ����Ǵ� ������ �׻� String�̴�
		*/
		
		
		//����,�ѷ� ���
		/*
		ũ��: double(8yte) > float(4byte) �� 3.14 > 3.14f
		�� ū���� �������� ���� ��O, �������� ū���� ���� ��X
		�� 3.14f�� 3.14�� ���� ��O, 3.14�� 3.14f�� ���� ��X

		area = r*r*3.14;//����: ǥ������� float�� ����f, double�� ����
		�� �ڷ��� �����ֱ�
		ex: float area,length; && area = r*r*3.14f; || double area,length; && area=r*r*3.14;
		*/
		area = r*r*3.14f;//or double area,length; && area = r*r*3.14
		perimeter = 2*r*3.14f;
		
		//������,����,�ѷ� ���
		System.out.printf("������: %d, ����: %f\n",r,area);//printf�� �Ϲ������� �Ҽ��� 6°�ڸ����� ǥ�õ�
		System.out.printf("������: %d, ����: %.2f\n",r,area);//�Ҽ��� ��°�ڸ����� ǥ��
		System.out.printf("������: %d, �ѷ�: %f",r,perimeter);//println�� �Ҽ��� �ڸ��� ���� �Ұ���

	}

}