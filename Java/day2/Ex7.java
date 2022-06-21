package day2;

public class Ex7 {

	public static void main(String[] args) {
		
		float num1 = 0;
		double num2 = 0;
		
		//float,double은 실수형이므로 0을 넣으면 0.0이 출력됨
		System.out.println("float: " + num1);//0.0
		System.out.println("double: " + num2);//0.0
		System.out.println();
		
		for(int i=0;i<1000000;i++) {//i++ == i=i+1
			num1 += 1000000;
			num2 += 1000000;
		}
		
		/*
		- float과 double의 정밀도 비교
		실수형 데이터 타입(float,double)에는 오차가 존재하는데, 그 오차없이 표현할 수 있는 범위를 유효자리수로 나타낸다.
		유효자리수는 float은 7자리, double은 16자리이므로, float보다 double의 정밀도가 더 높다
		→※단순한 계산 외에 복잡한 연산시에는 float말고 double 사용
		*/
		System.out.println("float: " + num1);//9.9642625E11
		System.out.println("double: " + num2);//1.0E12
		System.out.println();
		System.out.println("float: " + num1/1000000);//996426.25
		System.out.println("double: " + num2/1000000);//1000000.0

	}

}
