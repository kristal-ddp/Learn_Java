package day4;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		2. 1���� 100������ ���� �� Ȧ���� ��, ¦���� ��, ��ü�� ���� ���ϴ� ���α׷�
		¦���� ��: 2550
		Ȧ���� ��: 2500
		��ü�� ��: 5050
		*/
		
		int i,sum=0;
		
		for(i=1;i<=100;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.printf("1���� 100������ ���� �� Ȧ���� ��: %d\n",sum);
		
		sum=0;
		
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.printf("1���� 100������ ���� �� ¦���� ��: %d\n",sum);
		
		sum=0;
		
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.printf("1���� 100������ ���� �� ��ü�� ��: %d",sum);
		
	}

}
