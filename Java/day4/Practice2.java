package day4;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		2. 1���� 100������ ���� �� Ȧ���� ��, ¦���� ��, ��ü�� ���� ���ϴ� ���α׷�
		¦���� ��: 2550
		Ȧ���� ��: 2500
		��ü�� ��: 5050
		*/
		
		int i,sum1=0,sum2=0,sum3=0;
		
		/*for(i=1;i<=100;i++) {//���1
			
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}*/
		
		i=0;
		/*while(i<100) {//���2
			
			i++;
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}*/
		
		do {//���3
			
			i++;
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}while(i<100);

		System.out.printf("1���� 100������ ���� �� ¦���� ��: %d\n",sum1);
		System.out.printf("1���� 100������ ���� �� Ȧ���� ��: %d\n",sum2);
		System.out.printf("1���� 100������ ���� �� ��ü�� ��: %d",sum3);		
		
	}

}
