package day3;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		2. �� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
		ex: 20, 30 �Է½� �� ū ���� 30, ���� ���� 20
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		
//		System.out.print("2���� ������ �Է��ϼ���.[a b] ");//10 20 �����
		
		System.out.print("2���� ������ �Է��ϼ���.[a,b] ");//10,20 �����
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");//�����
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			max = num1;
			min = num2;
			
			System.out.printf("ū ����: %d, ���� ����: %d",max,min);
		}
		if(num1<num2) {
			max = num2;
			min = num1;
			
			System.out.printf("ū ����: %d, ���� ����: %d",max,min);
		}		
		if(num1==num2) {
			System.out.printf("�Է��� ���� %d���� �����ϴ�",num1);
		}
		
		sc.close();

	}

}

