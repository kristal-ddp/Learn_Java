package day4;

public class Ex6 {

	public static void main(String[] args) {
		
		//���� for������ �� ����ϴ� ���α׷�
		int i,j;
		
		//�簢��
		System.out.println("�簢��");
		for(i=1;i<=5;i++) {//��
			for(j=1;j<=5;j++) {//��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//���� �ﰢ��
		System.out.println("���� �ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//������ �ﰢ��
		System.out.println("������ �ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//���� ���ﰢ��
		System.out.println("���� ���ﰢ��");
		for(i=5;i>=1;i--) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//������ ���ﰢ��
		System.out.println("������ ���ﰢ��");
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//5ĭ ���� ���� �ﰢ��
		System.out.println("5ĭ ���� ���� �ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=10-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5ĭ ���� ������ �ﰢ��
		System.out.println("5ĭ ���� ������ �ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//5ĭ ���� ���� ���ﰢ��
		System.out.println("5ĭ ���� ���� ���ﰢ��");
		for(i=5;i>=1;i--) {
			for(j=1;j<=10-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5ĭ ���� ������ ���ﰢ��
		System.out.println("5ĭ ���� ������ ���ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5ĭ ���� ������ ���ﰢ��2
		System.out.println("5ĭ ���� ������ ���ﰢ��2");
		for(i=5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//�ﰢ��
		System.out.println("�ﰢ��");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {//4 3 2 1 0
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {//1 3 5 7 9
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//���ﰢ��
		System.out.println("���ﰢ��");
		for(i=5;i>=1;i--) {
			for(j=1;j<=5-i;j++) {//0 1 2 3 4
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {//9 7 5 3 1
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
