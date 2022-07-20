package day4;

public class Ex5 {

	public static void main(String[] args) {
		
		//다중 for문으로 구구단 구하는 프로그램
		for(int i=2;i<=9;i++) {
			
			System.out.println(i + "단");
			
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
			
			System.out.println();
		}

	}

}
