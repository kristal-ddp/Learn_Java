package day4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
//		1개의 단 만들기
		
//		반복문: for문,while문,do-while문
//		변하는 값이 있을 때, 똑같은 일, 반복적인 작업을 할 때 사용
//		ex: 구구단(2x1=2, 2x2=4, 2x3=6)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요. ");
		int dan = sc.nextInt();
		
//		1. for문
//		- 시작값과 끝값이 정해진 경우, 반복 횟수가 정해진 경우
//		조건에 따라 1번도 실행 안 될 수 있다.
		
//		for(초기화식;조건식;증감식){
//		실행문;
//		}		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		System.out.println();
		
//		2. while문
//		- 무한 루프로 프로그램이 종료되지 않게 하는 경우 while(true)
//		ex: 사용자에게 Y/N물어볼 때, Y입력시 반복
//		- 특정 조건에 만족할 때까지 반복해야하는 경우
//		- 수시로 변하는 값[정해지지 않은 값] 때문에 몇번 반복해야 하는지 모르는 경우
//		ex: 사이트에 회원가입한 사람들이 몇명인지 모를 때. DB에 들어있는 데이터의 개수를 모를 때
//		- 배열 (시작값은 0)
//		- 시작값과 끝값이 정해진 경우에도 사용
		
//		조건을 먼저 검사 후, 조건식이 true일때 반복, false일때 실행 안되거나 반복문 종료
//		조건에 따라 1번도 실행 안 될 수 있다.
		
//		while(조건식){
//			실행문;
//		}
		int j=0;//배열때문에 일반적으로 0부터 시작
		while(j<9) {
			j++;
			System.out.printf("%d * %d = %d\n",dan,j,dan*j);
		}
		System.out.println();
		
//		3. do-while문
//		- 특정 조건에 만족할 때까지 반복해야하는 경우
//		- 시작값과 끝값이 정해진 경우에도 사용
		
//		무조건 1번은 실행하고 조건을 나중에 검사해서, 조건식이 true일때 반복, false일때 반복문 종료
//		→사용자의 입력값을 제한할 때 사용
		
//		do{
//			실행문;
//		}while(조건식);
		int k=0;
		do {
			k++;
			System.out.printf("%d * %d = %d\n",dan,k,dan*k);
		}while(k<9);
		
		
//		4. continue: for,while,do-while문 내에서 continue 아래부분은 건너뛰고 반복됨
//		반복문{
//		코드1
//		continue;
//		코드2
//		}
//		→코드1만 반복됨

//		5. break: for,while,do-while,switch문 종료
//		반복문{
//		코드1
//		break;
//		코드2
//		}
//		→코드1 1번만 실행되고 반복문 종료

//		6. return: for,while,do-while문 종료 및 함수 자체 종료
//		반복문{
//		코드1
//		return;
//		코드2
//		}
//		→코드1 1번만 실행되고 함수 자체 종료

	}

}