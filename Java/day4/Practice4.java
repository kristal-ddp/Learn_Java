package day4;

public class Practice4 {

	public static void main(String[] args) {
		
		/*
		4. 1���� 100������ ���� ��, 3�� ����� ����(33)�� ����ϴ� ���α׷�
		*/
		
		int i,num=0;
		
		/*for(i=1;i<=100;i++) {//���1
			if(i%3==0) {
				num++;
			}
		}*/
		
		i=0;
		/*while(i<100) {//���2
			
			i++;
			
			if(i%3==0) {
				num++;
			}
		}*/
		
		do {//���3
			
			i++;
			
			if(i%3==0) {
				num++;
			}
			
		}while(i<100);
		
		System.out.printf("3�� ����� ����: %d",num);

	}

}
