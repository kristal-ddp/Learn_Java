package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice1 {

	public static void main(String[] args) throws IOException {
		/*
		1. 입력 받은 정수를 짝수,홀수를 구별해서 출력
		ex: 3 입력시 → 3 : 홀수
	 	ex: 4 입력시 → 4 : 짝수
	 	*/
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String panjung = "";
		
		System.out.print("정수를 입력하세요. ");
		num = Integer.parseInt(br.readLine());
		
		if(num==0) {
			panjung = "영";
		}else if(num%2==0) {
			panjung = "짝수";
		}else if(num%2==1) {
			panjung = "홀수";
		}
		
		System.out.printf("%d : %s",num,panjung);
		

	}

}
