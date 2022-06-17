package javal.day2;

public class Ex3 {

	public static void main(String[] args) {
		
		int r = 10;
		float area, perimeter;//perimeter: 둘레
		area = 10;
		
		//반지름,넓이 출력
		System.out.println(r);//10
		System.out.println(area);//10.0
		System.out.println();
		
		
		/*
		크기: 실수형(float,double) >= 정수형(int) → 10.0>10
		→ 1. 큰값에 작은값을 넣을 수O, 작은값에 큰값을 넣을 수X
		→ 10은 10.0에 넣을 수O, 10.0은 10에 넣을 수X

		double b=10.0;//에러X
		b=10;

		r = 10.0;//에러: r = 10.0; == r = (double)10.0;
		r = (float)10.0;//에러: float값은 int에 들어갈 수 없다
		r = (double)10.0;//에러: double값은 int에 들어갈 수 없다

		→ ※2. 작은값에 큰값을 넣을때는 형변환!
		r = (int)10.0;//에러X: 10.0을 int(정수형)으로 형변환
		r = Integer.parseInt(br.readLine());//★더 고급진 방법

		※Integer.parseInt(br.readLine())
		Integer: 정수형
		parselnt: 변환
		readLine(): BufferedReader의 method. 이를 통해 저장되는 변수는 항상 String이다
		*/
		
		
		//넓이,둘레 계산
		/*
		크기: double(8yte) > float(4byte) → 3.14 > 3.14f
		→ 큰값에 작은값을 넣을 수O, 작은값에 큰값을 넣을 수X
		→ 3.14f는 3.14에 넣을 수O, 3.14는 3.14f에 넣을 수X

		area = r*r*3.14;//에러: 표현방식이 float은 숫자f, double은 숫자
		→ 자료형 맞춰주기
		ex: float area,length; && area = r*r*3.14f; || double area,length; && area=r*r*3.14;
		*/
		area = r*r*3.14f;//or double area,length; && area = r*r*3.14
		perimeter = 2*r*3.14f;
		
		//반지름,넓이,둘레 출력
		System.out.printf("반지름: %d, 넓이: %f\n",r,area);//printf는 일반적으로 소수점 6째자리까지 표시됨
		System.out.printf("반지름: %d, 넓이: %.2f\n",r,area);//소수점 둘째자리까지 표시
		System.out.printf("반지름: %d, 둘레: %f",r,perimeter);//println은 소수점 자리값 조정 불가능

	}

}