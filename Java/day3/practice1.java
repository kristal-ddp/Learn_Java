package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice1 {

	public static void main(String[] args) throws IOException {
		/*
		1. �Է� ���� ������ ¦��,Ȧ���� �����ؼ� ���
		ex: 3 �Է½� �� 3 : Ȧ��
	 	ex: 4 �Է½� �� 4 : ¦��
	 	*/
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String panjung = "";
		
		System.out.print("������ �Է��ϼ���. ");
		num = Integer.parseInt(br.readLine());
		
		if(num==0) {
			panjung = "��";
		}else if(num%2==0) {
			panjung = "¦��";
		}else if(num%2==1) {
			panjung = "Ȧ��";
		}
		
		System.out.printf("%d : %s",num,panjung);
		

	}

}
