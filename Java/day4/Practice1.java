package day4;

public class Practice1 {

	public static void main(String[] args) {
		
		/*
		1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) ������� ����Ͽ�
		����� 220 ����ϴ� ���α׷�
		*/
		
		int i,j,sum=0;
		
		/*for(i=1;i<=10;i++) {//���1
			for(j=1;j<=i;j++) {
				sum += j;
			}
		}*/
		
		i=0;
		j=0;
		/*while(i<10) {//���2
			i++;//1 2 3
			j += i;//1 1+2 1+2+3
			sum += j;//1 1+(1+2)+(1+2+3)
		}*/
		
		do {//���3
			
			i++;
			j += i;
			sum += j;
			
		}while(i<10);
		
		System.out.println(sum);

	}

}
