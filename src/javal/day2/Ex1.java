package javal.day2;

/*
- ����������: �ܺο��� class�� interface�� ������ �� �ִ� ������ ����
public: �ܺ� class�� �����Ӱ� ��� ����
protected: ���� package �Ǵ� �ٸ� package�� ���� �ڽ� class������ ��� ����
private: �������� ��. �ܺο��� ���X. class ���ο����� ��� ����
default: �� 3���� ���������� ������� ������. ���� package������ ��� ����
public > protected > default > private

��� ���α׷��� class������ ����
class: �̸��� ù���ڴ� �빮��. �ڿ� �ٸ� �ܾ ���϶��� ù���ڴ� �빮�� ex: System, CustomInfo
���ϰ� class�� �̸��� �����ؾ��� ex: Ex1.java & class Ex1*/
public class Ex1 {

	/*void: return��X
	
	method(�޼ҵ�): ���� ��ɾ�. class �ȿ� �������� ���� �� �ִ�. �̸��� ù���ڴ� �ҹ���
	ex: print, println, customInfo
	main() method: ���� �޼ҵ�. java ��ɾ�� ���� �����ϸ� ���� ���� mani() method�� �����
	main: method �̸�. ������ �־ �ٲٸ� �ȵ�
	
	String: ����. "@"*/
	public static void main(String[] args) {
		
		/*System�̶�� class �ȿ� print, println�̶�� method�� ������
		print: �μ�,�Ű����� ������ �ϳ��� �����
		println: enter ����. �Ű����� ����O
		\n: C���,�ڹ� �� ��� ���α׷������� enter. ""�ȿ� ���
		
		�Ű�����(parameter): �Լ��� ������ �� �Է°��� ���¸� �������ִ� ����.
							 ������ �� ����X ex: int a���� a, add(x,y)���� x,y
		�μ�(argument): �Լ��� ȣ���� �� �Ű������� ���� ��.
						�޸𸮿� �Ҵ�Ǿ� �ִ� ���� ex: add(2,5)���� 2,5
		�Ѵ� method �� ��ȣ() �ȿ� �� ex: main( ), print(" ")
		*/
		System.out.println("Today is my second day studying Java");
		System.out.print("Study hard\n\n");
		System.out.println();
		
		System.out.println("a");

	}

}

/*
��ȣ Ŭ��: ¦ ��ȣ ǥ��
��ȣ ����Ŭ��: ���� ����

�����ư: javac�� �����
�����ư: java�� �����

������: comfile ����. ���������� Ʋ�� ��. �������� ������ ������ �ȵ�
*/