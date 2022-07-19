package day4;

public class Ex3 {

	public static void main(String[] args)  {
		
		//반복문으로 1부터 100까지의 합과 개수를 구하는 프로그램
		
		int i,sum=0,num=0;
		
//		100까지의 합
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.printf("1부터 100까지의 합: %d\n",sum);
		
		sum=0;
		
//		홀수의 합
		for(i=1;i<=100;i+=2) {
			sum += i;
		}
		System.out.printf("1부터 100까지 홀수의 합: %d\n",sum);
		
		sum=0;
		
//		짝수의 합
		for(i=2;i<=100;i+=2) {
			sum +=i;
		}
		System.out.printf("1부터 100까지 짝수의 합: %d\n",sum);
		
//		홀수의 개수
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				num++;
			}
		}
		System.out.printf("홀수의 개수: %d",num);
		
	}
}
