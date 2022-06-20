package javal.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) throws IOException {
		
		//밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램		
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//int base,height;//base: 밑변, height: 높이. int의 경우
		//double areat;//areat: 삼각형의 넓이
		//double base,height,areat;//double의 경우
		float base,height,areat;//float의 경우
		
		//입력
		//readLine()은 반환값이 String(문자)이므로 형변환해야 한다
		System.out.print("밑변? ");//10
		//base = Integer.parseInt(br.readLine());//int의 경우
		//base = Double.parseDouble(br.readLine());//double의 경우
		base = Float.parseFloat(br.readLine());//float의 경우
		
		System.out.print("높이? ");//20
		//height = Integer.parseInt(br.readLine());//int의 경우
		//height = Double.parseDouble(br.readLine());//double의 경우
		height = Float.parseFloat(br.readLine());//float의 경우
		
		//연산
		//삼각형의 넓이 = 밑변*높이/2
		//java에서는 int가 소수점을 만나면 double이 된다 
		//areat = base*height/2.0;//int,double의 경우
		areat = base*height/2.0f;//float의 경우
		
		//출력
		System.out.printf("삼각형의 넓이: %.2fcm\n",areat);
		System.out.println();

		//반지름과 높이를 입력받아 원기둥의 넓이를 구하는 프로그램
		//선언
		//int r,heightc;//r: 반지름, heightc: 원기둥의 높이. int의 경우
		//double areac;//areac: 원기둥의 넓이
		//double r,heightc,areac;//double의 경우
		float r,heightc,areac;//float의 경우
		
		//입력
		//readLine()은 반환값이 String(문자)이므로 형변환해야 한다
		System.out.print("반지름? ");
		//r = Integer.parseInt(br.readLine());//int의 경우
		//r = Double.parseDouble(br.readLine());//double의 경우
		r = Float.parseFloat(br.readLine());//float의 경우
		
		System.out.print("높이? ");
		//heightc = Integer.parseInt(br.readLine());//int의 경우
		//heightc = Double.parseDouble(br.readLine());//double의 경우
		heightc = Float.parseFloat(br.readLine());//float의 경우
		
		//연산
		//원기둥의 넓이 = 3.14*반지름*반지름*높이
		//areac = 3.14*r*r*heightc;//int,double의 경우
		areac = 3.14f*r*r*heightc;//float의 경우
		
		//출력
		System.out.printf("원기둥의 넓이: %.2fcm",areac);

	}

}
