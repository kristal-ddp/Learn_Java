package day4;

public class Ex3 {

	public static void main(String[] args)  {
		
		//�ݺ������� 1���� 100������ �հ� ������ ���ϴ� ���α׷�
		
		int i,sum=0,num=0;
		
//		100������ ��
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.printf("1���� 100������ ��: %d\n",sum);
		
		sum=0;
		
//		Ȧ���� ��
		for(i=1;i<=100;i+=2) {
			sum += i;
		}
		System.out.printf("1���� 100���� Ȧ���� ��: %d\n",sum);
		
		sum=0;
		
//		¦���� ��
		for(i=2;i<=100;i+=2) {
			sum +=i;
		}
		System.out.printf("1���� 100���� ¦���� ��: %d\n",sum);
		
//		Ȧ���� ����
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				num++;
			}
		}
		System.out.printf("Ȧ���� ����: %d",num);
		
	}
}
