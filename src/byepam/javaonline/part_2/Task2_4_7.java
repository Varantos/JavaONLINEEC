package byepam.javaonline.part_2;
/* ������ 4.7
 *	�������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9.
 **/
public class Task2_4_7 {

	static int Factorial(int n){
		int fct=1;
		for (int i=1;i<=n;i++) fct=fct*i;
		return fct;
	}

	static void Fact_Necht(int n){
		for (int i=1;i<=n;i++) 
			if(i%2!=0) System.out.println("�����: "+i+" ���������: "+Factorial(i));
		
	}
	
	public static void main(String[] args) {
		int n=9;
		Fact_Necht(n);
		
	}
	
}


