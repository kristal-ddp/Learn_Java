package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		//¦��,Ȧ���� �����ϴ� ���α׷�
		
		int num;
//		String judge = Null;//���� str�� null�� �ʱ�ȭ. �����
		String judge = "";//����� ���׻� ���� �ʱ�ȭ�ϴ� ���� ������
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("�� �Է� ");
		num = Integer.parseInt(br.readLine());
		
		/*
		- ���: if(���� if��, if~else��, if~else if��), �ݺ���(for,while,do~while), switch
		- ���� if��: ���� 1���� �۾� 1����. ������ ������ ���ε��� ���� ��
		if(���ǽ�){
			�۾�
		}
		- if~else��: ���� 1���� �۾� 2��. A or B
		if(���ǽ�){
			�۾�1
		}else {
			�۾�2
		}
		
		else O: ���ǹ��� �ش���� �ʴ� ��� ��츦 �����Ѵ�(default)
			�溯�� �ʱ�ȭ ���� �ʾƵ� �ȴ�
		else X: ���ǹ��� �ش���� �ʴ� ��찡 ���ܵ� �� �־�, ������ �����Ⱚ�� �� �� �ִ�
			�溯�� �ʱ�ȭ �ؾ��Ѵ�
		*/
		//����if��
		if(num%2==0) {//�߰�ȣ{}�� ���� ����
			judge = "¦��";
		}
		if(num%2!=0) {//����� better
//		if(num%2==1) {//�����
			judge = "Ȧ��";
		}
		
		System.out.println(num + "�� " + judge);
		
		//if-else��
		if(num%2==0) {
			judge = "¦��";
		}else {
			judge = "Ȧ��";
		}
		
		System.out.println(num + "�� " + judge);
		

	}

}
