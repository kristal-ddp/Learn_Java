package day3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//������ ���� ������ �ϴ� ���α׷�
		
		String name;
//		String judge = "";//��if-else if��, �ʱ�ȭO
		String judge;//��if-else if-else��, �ʱ�ȭX
		int kor;
		
		/*
		BufferedReader�� Scanner: ���ڿ��� �Է¹����� ����Ѵ�
		BufferedReader: �����ͷ��� ���Ƶ� �ӵ��� ������ /
			���ڿ� String�� ���� �� �ִ�. Space�� String���� �ν��Ѵ�. ����ȯ�� ����ó���� �ʿ��ϴ�.
		Scanner: �����ͷ��� ������ �ӵ��� ������ /
			���� ������ Ÿ��(int,double,String ��)�� ���� �� �ִ�.
			Space, Enter�� ���� �ν��Ѵ�. ������ ����ȯ�� ����ó���� �ʿ����� �ʴ�.
		
		��Scanner�� ����� 1���� ���� ���� ���� �о�� �� 1���� ������Ѵ�(sc.next() or sc.nextInt())
		sc.next()�� ��ȯ���� String, sc.nextInt()�� ��ȯ���� int�̹Ƿ�
		���� ����ȯ�� �ʿ䰡 ����(�ڵ������� ����ȯ)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�? ");
		name = sc.next();
		
		System.out.print("���� ����? ");
		kor = sc.nextInt();
		
		/*
		if-else if��: ���� 1���� �۾� ������. �ϳ��� ��Ȳ�� ���ؼ� �������� ������ ���� ��
		��if-else if������ ū ���ڳ� ������ ���� ������ ����� �Ѵ�
		*/
		
//		if(kor>=90) {//��if-else if��, �ʱ�ȭO
//			judge = "[��]";
//		}else if(kor>=80) {
//			judge = "[��]";
//		}else if(kor>=70) {
//			judge = "[��]";
//		}else if(kor>=60) {
//			judge = "[��]";
//		}else if(kor<60) {
//			judge = "[��]";
//		}
		
		//if-else if-else��
		if(kor>=90) {//��if-else if-else��, �ʱ�ȭX
			judge = "[��]";
		}else if(kor>=80) {
			judge = "[��]";
		}else if(kor>=70) {
			judge = "[��]";
		}else if(kor>=60) {
			judge = "[��]";
		}else{
			judge = "[��]";
		}
		
//		System.out.println(name + "���� ���� ������ " + kor +
//				"���̰� ȯ�� ������ " + judge + "�Դϴ�.");
		
		System.out.printf("%s���� ���� ������ %d���̰� ȯ�� ������ %s�Դϴ�.",name,kor,judge);
		
		sc.close();//��Scanner�� ����ϸ� sc.close();�� �׻� �ݾ��ִ°� �����̴�. ������ ���� �ʾƵ� ������ ���� �ʴ´�.

	}

}
