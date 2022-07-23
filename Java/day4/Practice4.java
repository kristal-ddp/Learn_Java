package day4;

public class Practice4 {

	public static void main(String[] args) {
		
		/*
		4. 1부터 100까지의 숫자 중, 3의 배수의 개수(33)을 출력하는 프로그램
		*/
		
		int num=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				num++;
			}
		}
		
		System.out.println(num);

	}

}
