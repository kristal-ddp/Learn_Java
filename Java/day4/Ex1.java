package day4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
//		1���� �� �����
		
//		�ݺ���: for,while,do~while
//		���ϴ� ���� ���� ��, �Ȱ��� ��, �ݺ����� �۾��� �� �� ���
//		ex: ������(2x1=2, 2x2=4, 2x3=6)
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("���� �Է��ϼ���. ");
		dan = sc.nextInt();
		
//		for��: ���۰��� ������ ������ ���� �� ����ϸ�, �������� �߿����� �ʴ�.
//		���ǿ� ���� 1���� ������� ���� �� �ִ�.
//		for(�ʱⰪ;�ִ밪;������) {
//			����
//		}
		for(int i=1;i<=9;i++) {//i++ == i=i+1 
			System.out.printf("%d * %d = %d\n",dan,dan*i);
		}

	}

}
