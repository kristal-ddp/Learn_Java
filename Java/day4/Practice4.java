package day4;

public class Practice4 {

	public static void main(String[] args) {
		
		/*
		4. 1부터 100까지의 숫자 중, 3의 배수의 개수(33)을 출력하는 프로그램
		*/
		
		int i,num=0;
		
		/*for(i=1;i<=100;i++) {//방법1
			if(i%3==0) {
				num++;
			}
		}*/
		
		i=0;
		/*while(i<100) {//방법2
			
			i++;
			
			if(i%3==0) {
				num++;
			}
		}*/
		
		do {//방법3
			
			i++;
			
			if(i%3==0) {
				num++;
			}
			
		}while(i<100);
		
		System.out.printf("3의 배수의 개수: %d",num);

	}

}
