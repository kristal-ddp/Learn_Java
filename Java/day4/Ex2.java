package day4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//1���� �Է¹��� �������� �հ� ���ϰ�, ��� ������ ������ ����� ���α׷�
		//����: 1~5000������ �� �Է�
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int sum = 0;
			
			do {
				
				System.out.print("���ڸ� �Է��ϼ���. ");
				number = sc.nextInt();
				
			}while(number<1 || number>5000);
			
			for(int i=1;i<=number;i++) {
				sum += i;
			}
			
			System.out.printf("1���� %d������ �հ�� %d�Դϴ�",number,sum);
			
			while(true){
				
				System.out.print("��� �����Ͻðڽ��ϱ�?[Y/N] ");
				char answer = sc.next().charAt(0);
				
				if(answer=='Y' || answer=='y') {
					break;//while�� ����
				}else if(answer=='N' || answer=='n') {
					return;//���α׷� ���� ����
				}else {
					continue;//while�� �ݺ�
				}
				
			}
		}

	}

}
