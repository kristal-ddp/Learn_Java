package day4;

public class Practice3 {

	public static void main(String[] args) {
		
		/*
		3. 1-2+3-4+5-6+7-8+9-10 ������� ����Ͽ�
		����� -5 ����ϴ� ���α׷�
		
		*/
		
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				sum -= i;
			}else if(i%2==1) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}

}
