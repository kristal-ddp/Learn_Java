package day2;

/*
- ����������: �ܺο��� class�� interface�� ������ �� �ִ� ������ ����
public: �ܺ� class�� �����Ӱ� ��� ����
protected: ���� package �Ǵ� �ٸ� package�� ���� �ڽ� class������ ��� ����
private: �������� ��. �ܺο��� ���X. class ���ο����� ��� ����
default: �� 3���� ���������� ������� ������. ���� package������ ��� ����
public > protected > default > private

but, default ���� �� �ϰ�, public������ protected��� �����ϸ� ��

��� ���α׷��� class������ ����
class: �̸��� ù���ڴ� �빮��. �ٸ� �ܾ ���϶��� �� �ܾ��� ù���ڴ� �빮�� ex: System, CustomInfo
���ϰ� class�� �̸��� �����ؾ��� ex: Ex1.java & class Ex1*/
public class Ex1 {

	/*
	method: ���� ��ɾ�. class �ȿ� �������� ���� �� �ִ�.
			�̸��� ù���ڴ� �ҹ���. �ٸ� �ܾ ���̸� �� �ܾ��� ù���ڴ� �빮�� ex: print, println, customInfo
	method ����: �����(���� Ÿ��, method �̸�, �Ű����� ����), ������{}
	���� Ÿ��: return���� ���� method�� void ���. return���� �ִ� method�� ���ϰ� ����
	cf: if void�� ����� method���� return; ����, method ���� ����
	main() method: ���� �޼ҵ�. java ��ɾ�� ���� �����ϸ� ���� ���� �����
	main: method �̸�. ������ �־ �ٲٸ� �ȵ�
	
	String: ����. "@"*/
	public static void main(String[] args) {
		
		/*System�̶�� class �ȿ� print, println�̶�� method�� ������
		print: �μ�,�Ű����� ������ �ϳ��� �����
		println: enter ����. �Ű����� ����O
		\n: C���,�ڹ� �� ��� ���α׷������� enter. ""�ȿ� ���
		
		�Ű�����(parameter): �Լ��� ������ �� �Է°��� ���¸� �������ִ� ����. ������ �� ����X
							 ex: int a���� a, add(x,y)���� x,y
		�μ�(argument): �޼ҵ� ȣ��ÿ� ���޵Ǵ� ��. �Լ��� ȣ���� �� �Ű������� ���� ��.
						�޸𸮿� �Ҵ�Ǿ� �ִ� ���� ex: add(2,5)���� 2,5
		�Ѵ� method �� ��ȣ() �ȿ� �� ex: main( ), print(" ")
		*/
		System.out.println("Today is my second day studying Java");
		System.out.print("Study hard\n");
		System.out.println();
		
		System.out.println("a");
		System.out.println();

	}

}

/*
��ȣ Ŭ��: ¦ ��ȣ ǥ��
��ȣ ����Ŭ��: ���� ����

�����ư: javac�� �����
�����ư: java�� �����

������: comfile ����. ���������� Ʋ�� ��. �������� ������ ������ �ȵ�
*/