package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		//짝수,홀수를 구분하는 프로그램
		
		int num;
//		String judge = Null;//변수 str을 null로 초기화. 방법①
		String judge = "";//방법② ※항상 변수 초기화하는 습관 가지기
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("수 입력 ");
		num = Integer.parseInt(br.readLine());
		
		/*
		- 제어문: if(단일 if문, if~else문, if~else if문), 반복문(for,while,do~while), switch
		- 단일 if문: 조건 1개에 작업 1개씩. 각각의 조건을 따로따로 비교할 때
		if(조건식){
			작업
		}
		- if~else문: 조건 1개에 작업 2개. A or B
		if(조건식){
			작업1
		}else {
			작업2
		}
		
		else O: 조건문에 해당되지 않는 모든 경우를 포함한다(default)
			→변수 초기화 하지 않아도 된다
		else X: 조건문에 해당되지 않는 경우가 제외될 수 있어, 변수에 쓰레기값이 들어갈 수 있다
			→변수 초기화 해야한다
		*/
		//단일if문
		if(num%2==0) {//중괄호{}는 생략 가능
			judge = "짝수";
		}
		if(num%2!=0) {//방법① better
//		if(num%2==1) {//방법②
			judge = "홀수";
		}
		
		System.out.println(num + "은 " + judge);
		
		//if-else문
		if(num%2==0) {
			judge = "짝수";
		}else {
			judge = "홀수";
		}
		
		System.out.println(num + "은 " + judge);
		

	}

}
