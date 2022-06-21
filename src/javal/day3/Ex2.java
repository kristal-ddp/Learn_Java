package javal.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String judge1,judge2,judge3,judge4,judge5;
		
		System.out.print("수 입력? ");//2022
		num = Integer.parseInt(br.readLine());
		
		/*
		※삼항 연산자: 조건문 ? 조건의 값이 참(true) : 조건의 값이 거짓(false)
		한 줄에 입력 가능→단순한 if문 대신 사용
		
		비교 연산자: >,<,>=,<=,==,!=
		==: 같다
		!=: 같지 않다
		논리 연산자: !,&,|,&&,||
		A && B: A and B. A,B 둘다 true이면 true
		A || B: A or B. A 또는 B 중 1개가 true이면 true
		*/
		//짝수,홀수,0 판단
		judge1 = num % 2 == 0 ? "짝수" : "홀수";//0 제외
		judge2 = num % 2 == 0 ? (num == 0 ? "0" : "짝수") : "홀수";//0포함
		judge3 = num % 2 != 0 ? "홀수" : (num == 0 ? "0" : "짝수");//0 포함
		//홀수가 아니면 0 또는 짝수인데, su == 0이면 0, su != 0이면 짝수
		
		//만약 0을 넣으면
		System.out.println(judge1);//짝수
		System.out.println(judge2);//0
		System.out.println(judge3);//0
		System.out.println();
		
		//양수,음수,0 판단
		judge1 = num > 0 ? "양수" : "음수";//0 제외
		judge2 = num > 0 ? "양수" : (num == 0 ? "0" : "음수");//0 포함
		judge3 = num > 0 ? "양수" : (num < 0 ? "음수" : "0");//0 포함
		
		//만약 0을 넣으면
		System.out.println(judge1);//음수
		System.out.println(judge2);//0
		System.out.println(judge3);//0
		System.out.println();
		
		/*
		윤년: 연수가 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않는 해,
			  연수가 4와 400으로 나누어 떨어지는 해
		→※윤년: 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		&& 왼쪽과 오른쪽이 동시에 만족하면 윤년
		 */
		//윤년,평년 판단
		judge1 = num % 4 == 0 && num % 100 != 0 || num % 400 == 0 ?  "윤년" : "평년";
		
		System.out.println(num + "년: " + judge1);

	}

}
