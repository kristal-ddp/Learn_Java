package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader �̿�
		//1���� �Է¹��� �������� �հ� ���ϰ�, ��� ������ ������ ����� ���α׷�
		//����: 1~5000������ �� �Է�
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		int num;
		
		while(true) {
			
			int sum = 0;
			
			do {
			
				System.out.print("���ڸ� �Է��ϼ���. ");
				num = Integer.parseInt(br.readLine());
			
			}while(num<1 || num>5000);
			
			for(int i=1;i<=num;i++) {
				sum += i;
			}
			
			System.out.printf("1���� %d������ ���� %d�Դϴ�.\n",num,sum);
			
			while(true) {
				
				System.out.print("��� �Ͻðڽ��ϱ�?");
				char answer = (char)System.in.read();
				System.in.skip(2);
				
				if(answer=='y' || answer=='Y') {
					break;
				}else if(answer=='n' || answer=='N') {
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
		
		}

	}

}
