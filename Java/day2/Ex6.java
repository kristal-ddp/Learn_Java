package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) throws IOException {
		
		//�غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ���ϴ� ���α׷�		
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//int base,height;//base: �غ�, height: ����. int�� ���
		//double areat;//areat: �ﰢ���� ����
		//double base,height,areat;//double�� ���
		float base,height,areat;//float�� ���
		
		//�Է�
		//readLine()�� ��ȯ���� String(����)�̹Ƿ� ����ȯ�ؾ� �Ѵ�
		System.out.print("�غ�? ");//10
		//base = Integer.parseInt(br.readLine());//int�� ���
		//base = Double.parseDouble(br.readLine());//double�� ���
		base = Float.parseFloat(br.readLine());//float�� ���
		
		System.out.print("����? ");//20
		//height = Integer.parseInt(br.readLine());//int�� ���
		//height = Double.parseDouble(br.readLine());//double�� ���
		height = Float.parseFloat(br.readLine());//float�� ���
		
		//����
		//�ﰢ���� ���� = �غ�*����/2
		//java������ int�� �Ҽ����� ������ double�� �ȴ� 
		//areat = base*height/2.0;//int,double�� ���
		areat = base*height/2.0f;//float�� ���
		
		//���
		System.out.printf("�ﰢ���� ����: %.2fcm\n",areat);
		System.out.println();

		//�������� ���̸� �Է¹޾� ������� ���̸� ���ϴ� ���α׷�
		//����
		//int r,heightc;//r: ������, heightc: ������� ����. int�� ���
		//double areac;//areac: ������� ����
		//double r,heightc,areac;//double�� ���
		float r,heightc,areac;//float�� ���
		
		//�Է�
		//readLine()�� ��ȯ���� String(����)�̹Ƿ� ����ȯ�ؾ� �Ѵ�
		System.out.print("������? ");
		//r = Integer.parseInt(br.readLine());//int�� ���
		//r = Double.parseDouble(br.readLine());//double�� ���
		r = Float.parseFloat(br.readLine());//float�� ���
		
		System.out.print("����? ");
		//heightc = Integer.parseInt(br.readLine());//int�� ���
		//heightc = Double.parseDouble(br.readLine());//double�� ���
		heightc = Float.parseFloat(br.readLine());//float�� ���
		
		//����
		//������� ���� = 3.14*������*������*����
		//areac = 3.14*r*r*heightc;//int,double�� ���
		areac = 3.14f*r*r*heightc;//float�� ���
		
		//���
		System.out.printf("������� ����: %.2fcm",areac);

	}

}
