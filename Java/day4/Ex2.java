package day4;

import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		//Scanner �̿�
		//1���� �Է¹��� �������� �հ� ���ϰ�, ��� ������ ������ ����� ���α׷�
		//����: 1~5000������ �� �Է�
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {//����ڰ� ��� �ݺ��� �� �𸣹Ƿ� while�� ���
			
			int sum = 0;
			
			//1~5000������ �� �Է¹���
			do {
				
				System.out.print("���ڸ� �Է��ϼ���. ");
				number = sc.nextInt();
				
			}while(number<1 || number>5000);//���ǽ��� false�̸�(1~5000������ ���̸�) do-while�� ����
			
			//1���� �Է¹��� �������� �հ�
			for(int i=1;i<=number;i++) {
				sum += i;
			}
			
			System.out.printf("1���� %d������ �հ�� %d�Դϴ�\n",number,sum);
			
//			System.in.read(); ASCII������ ��ȯ�� ���ڰ� �ϳ��� �Էµȴ�
//			(char)System.in.read(); ASCII���� ������ ����ȯ
//			������ �Է��� ���͸� ġ��, \n(���� �Ʒ��� �̵�)�� \r(�� ������ �̵�)�� �Էµȴ�.
//			�� System.in.skip(2); �Է°� 2���� �ǳʶڴ�
			
//			String.charAt(0): String���ڿ� �� �� ���ڸ� ������ char ���·� ��ȯ�Ѵ١濩������ �Է� ����
//			ch = sc.next().charAt(0);
			
			//��� ������ ������ ����
			while(true){
		
				System.out.print("����Ͻðڽ��ϱ�?[Y/N] ");
				char answer = (char)System.in.read();//�����
				System.in.skip(2);//����� System.in.read()
//				char answer = sc.next().charAt(0);//�����
				
				if(answer=='Y' || answer=='y') {//�ظ��� ������ �����̸� ||�� �ƴ� &&�� ���
					break;//while�� ����
				}else if(answer=='N' || answer=='n') {
					System.out.println("���α׷��� �����մϴ�");
					return;//���α׷� ���� ����
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					//while�� �ݺ�
				}
				
			}
		}

	}

}
