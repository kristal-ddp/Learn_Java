package javal.day2;//���ϴ¸�ŭ ����ڿ��� �����ϴ� ���α׷�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		/*
		���ڿ�: ���ڸ� ������ �迭 ex: Hello Java / a / 123
		
		String: ���ڿ��� ��Ÿ���� class. ���� ����ִ� ��ġ�� ��ǥ�� �������������� �ְ� ���뺯����X.
				���� ������ String �����ø��� ���� �ٸ� ��ǥ�� �����ǹǷ� '==' ��� �Ұ��ɡ��ذ�: .equals() �̿�
		ex: String a = "Hello";
			a = a + "123";
			System.out.println(a);//Hello123
		
		char: ���ڸ� ��Ÿ���� �ڷ���. 1���� ���ڸ� ���� ����(����0~9, ���ĺ� ��ҹ���, Ư����ȣ)
			  ���� �ȿ� ���� ������, �� ���� ����ִ� ��ġ�� ��ǥ�� �� ����. ���� ������ '==' ��� ����
		ex: char a = '��';
		 */
		String name;
		int kor,eng,tot;
		
		//�Է�
		System.out.print("�̸�? ");//soo
		name = br.readLine();//readLine(): method. ����Ǵ� ����[��ȯ��]�� �׻� String(����)
		
		System.out.print("����? ");//90
		kor = Integer.parseInt(br.readLine());//���ڸ� ������ ����ȯ
		//����: kor�� int�� �����ߴµ�, readLine()�� ��ȯ���� String(����)�̹Ƿ� int(������)�� ����ȯ
		
		System.out.print("����? ");//80
		eng = Integer.parseInt(br.readLine());
		
		//����
		tot = kor + eng;
		
		//���
		System.out.printf("\n%s���� ����: %d��",name,tot);

	}

}
