package day2;//��ǻ�Ϳ� ��ȭ�ϴ� ���α׷� �����

/*
import: �ٸ� package�� class�� ���� ������� �ʴ� �͵��� ����� �� package �̸�.class �̸� ����ؾ���.
���� import ����ϸ� class �̸��� ������ ��
ex: java.util.Random rd = new java.util.Random();
�� import java.util.Random; & Random rand = new Random();

���� package�� class�� ���� ����ϴ� java.lang package(ex: System)�� class�� ����Ҷ��� import �ʿ�X
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		/*
		BufferedReader: ����ڿ��� ���� �Է¹��� �� ���. java�� �̹� ����� ���� ���� �����ͼ� ���� ��
		Stream: �� ������ �ٸ� �������� ������ �帧
				�ܹ����̹Ƿ� �Է°� ��� ���� �߻��� ��X. InputStream, OutputStream���� ������
		System.in: �Է¹��� �����͸� 10������ ��ȯ�Ͽ� int�� ������ ����.
				   1byte ����(ASCII ��. A,a,1,#)�θ� �Է¹���. 2byte(�ѱ� ex: ��)�� ����� �ν�X
		InputStreamReader: System.in���� ���� ���ڸ� 2byte�� ����(�Է� �����͸� char���·� ��ȯ)
		BufferedReader: 2byte�� ����� ���ڸ� ����(String�� ���ڿ��� ����)
		BufferedReader br �� int r. ǥ�� ����� �����
		*/
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int r;
		double area,perimeter;//����,�ѷ�
		
		/*
		print: Console �Է½� �ٷ� ���� ��ġ
		println: Console �Է½� ��ĭ �Ʒ��� ��ġ
		 */
		System.out.print("������? ");//123 (ASCII 49,50,51)
		//System.out.println("������? ");
		
		
		/*
		readLine: method. ����Ǵ� ����[��ȯ��]�� �׻� String(����)
		r = br.readLine();//����: r�� int�� ����Ǿ� �����ε�, readLine�� ���� ���ڷ� ����
		
		parse: ��ȯ�϶�� ��
		Integer.parseInt(br.readLine()): readLine�� Int�� ��ȯ�϶�
		String.valueOf(a): integer�� char�� a�� String���� ��ȯ�϶�
		*/
		r = Integer.parseInt(br.readLine());
		/*
		������: ������� ���� �Է¹�Ŀ� ���� ������ �߻��� �� ������ �˸� ex: 20, �̽�, 2��
		�� readLine�� throws IOException�� �Բ� ����ؾ� ��
		throws IOException: ����� ����ó��
		���ܰ� �߻��� �Լ��� ȣ���� �Լ����� ����ó���Ѵ�. ��� Ư�̻����� ����������(throws)
		�� ������ ���� �� Add throws declaration ������ throws NumberFormatException, IOException ���
		�� NumberFormatException, ����
		*/
		
		//if int�� �ƴ� double�� ���
		//double r;
		//r = Double.parseDouble(br.readLine());
		
		
		area = 3.14*r*r;
		perimeter = 2*3.14*r;
		
		System.out.printf("������: %d\n",r);
		System.out.printf("����: %.2f\n",area);
		System.out.printf("�ѷ�: %.2f",perimeter);

	}

}

/*
\n: enter
\r: �������� ����

�ڵ� �Է½� �����κ� ���� Ctrl+Space�ϸ� ����
*/