package day4;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		2. 1부터 100까지의 숫자 중 홀수의 합, 짝수의 합, 전체의 합을 구하는 프로그램
		짝수의 합: 2550
		홀수의 합: 2500
		전체의 합: 5050
		*/
		
		int i,sum1=0,sum2=0,sum3=0;
		
		/*for(i=1;i<=100;i++) {//방법1
			
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}*/
		
		i=0;
		/*while(i<100) {//방법2
			
			i++;
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}*/
		
		do {//방법3
			
			i++;
			if(i%2==0) {
				sum1 += i;
			}else if(i%2==1) {
				sum2 += i;
			}
			sum3 += i;
			
		}while(i<100);

		System.out.printf("1부터 100까지의 숫자 중 짝수의 합: %d\n",sum1);
		System.out.printf("1부터 100까지의 숫자 중 홀수의 합: %d\n",sum2);
		System.out.printf("1부터 100까지의 숫자 중 전체의 합: %d",sum3);		
		
	}

}
