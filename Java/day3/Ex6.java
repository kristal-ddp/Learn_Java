package day3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		//�̸�,������ �Է¹޾� ������ ����ϴ� ���α׷�
		
		String name;
		int kor,eng,mat,tot;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Scanner���� �������� �Է°��� ���� ���� ������(Space,Enter,��ǥ ��)�� �ʿ��ϴ�.
		��Space�� ��ǥ�� �����͸� �����Ͽ�, ���� �����͸� �� �ٿ� �Է¹��� �� �ִ�.
		
		Scanner class�� useDelimiter method�� �̿��Ͽ� ����� ���� �����ڸ� ����� �� �ִ�.
		
		��Scanner�� ����� �������� �Է°��� ���� ���� �о�� ���� ������ ������Ѵ�
		 */
//		System.out.print("�̸� ���� ���� ����? ");//soo 100 90 80 ��������� ����
		System.out.print("�̸�,����,����,����? ");//soo,100,90,80 �轰ǥ�� ����
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");//�轰ǥ�� ������ �д� ���� �����
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor+eng+mat;
		
		System.out.println(name + "�� ����: " + tot + "��");
		
		sc.close();		

	}

}
