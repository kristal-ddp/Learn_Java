package day3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		//3���� ���� ������������ �����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		/*
		���ڵ� ������ ������ �Ʒ��� ����Ǳ� ������
		�Է°��� �޴� method(next/nextInt)�� if�� �Ʒ��� �ִ°� �ƴ϶� �Է¹޴� �ڵ� ���Ŀ� �־���Ѵ�
		*/
		System.out.print("3���� ���� �Է��ϼ���: ");//1 2 3
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		/*
		��else if��: if���� true�� �Ǹ� if ��ϸ� �����ϰ� ��ü if���� ����Ƿ�, else if�� ���� �ȵȴ�
		��3������ ��츦 ���ؾ� �ϹǷ�, else if���� �ƴ϶� if���� ����Ѵ�
		 */
		//1��2, 2��3, 1��3 ��
		if(num1>num2) {
			temp = num1;//num1�� temp�� ����
			num1 = num2;//num1>num2�̹Ƿ� num1�� num2�� ����
			num2 = temp;//temp�� num2�� ����
		}
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
//		System.out.println(num1 num2 num3);//����: println������ ������ �Է½� +�� ����ؾ� �Ѵ�
//		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.printf("%d %d %d",num1,num2,num3);//better

	}

}
