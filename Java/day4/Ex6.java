package day4;

public class Ex6 {

	public static void main(String[] args) {
		
		//´ÙÁß for¹®À¸·Î º° Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥
		int i,j;
		
		//»ç°¢Çü
		System.out.println("»ç°¢Çü");
		for(i=1;i<=5;i++) {//¿­
			for(j=1;j<=5;j++) {//Çà
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//¿ÞÂÊ »ï°¢Çü
		System.out.println("¿ÞÂÊ »ï°¢Çü");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//¿À¸¥ÂÊ »ï°¢Çü
		System.out.println("¿À¸¥ÂÊ »ï°¢Çü");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//¿ÞÂÊ ¿ª»ï°¢Çü
		System.out.println("¿ÞÂÊ ¿ª»ï°¢Çü");
		for(i=5;i>=1;i--) {
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//¿À¸¥ÂÊ ¿ª»ï°¢Çü
		System.out.println("¿À¸¥ÂÊ ¿ª»ï°¢Çü");
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//5Ä­ ¶ç¿ì°í ¿ÞÂÊ »ï°¢Çü
		System.out.println("5Ä­ ¶ç¿ì°í ¿ÞÂÊ »ï°¢Çü");
		for(i=1;i<=5;i++) {
			for(j=1;j<=10-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ »ï°¢Çü
		System.out.println("5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ »ï°¢Çü");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//5Ä­ ¶ç¿ì°í ¿ÞÂÊ ¿ª»ï°¢Çü
		System.out.println("5Ä­ ¶ç¿ì°í ¿ÞÂÊ ¿ª»ï°¢Çü");
		for(i=5;i>=1;i--) {
			for(j=1;j<=10-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ ¿ª»ï°¢Çü
		System.out.println("5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ ¿ª»ï°¢Çü");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ ¿ª»ï°¢Çü2
		System.out.println("5Ä­ ¶ç¿ì°í ¿À¸¥ÂÊ ¿ª»ï°¢Çü2");
		for(i=5;i>=1;i--) {
			for(j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
