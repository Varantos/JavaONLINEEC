package byepam.javaonline.part_2;
/*
 * 
 * ���������  �������  �����������  ��������������  ��  ��������  �,  
 * ���������  �����  ����������  ������� ������������.
 * 
 * 
 * ���������� ������������� ����� � ����� ������ 
|* ���������� �������������� ������������ 
 * � ����� ��� ��������� 60 �������� � �������-��������� 
 * �������� a - ����������� ��������������
 * 
 */
import global.Global;
public class Task2_4_3 {
	public static void main(String[] args) {
	int num=6;
	double a=Global.InPutFloatVal("������ ������� �������������� �:  ");		 
	double Sq_figure=0;

	Sq_figure=area_of_figure(num, a, Sq_figure);
	
	System.out.print("\n������� �������������� :");
	System.out.printf(" %.2f ",Sq_figure);
	}


	
	static double  area_of_figure(int n, double a, double SqF) {
		double tmp;
		n--;
		tmp=(a*a) /(4*(Math.sqrt(3) ) );	//������� ������������
		if ((n)>=0) {
 			SqF=SqF+area_of_figure( n,  a, tmp );
		//	System.out.printf("\n"+(n)+"  \t %.2f ", SqF);
			
		return SqF;
		}
	return SqF;
	}

static double  area_of_figure1(int n, double a, double SqF) {
		double tmp;
		tmp=(a*a) /(4*(Math.sqrt(3) ) );	//������� ������������
 		SqF=tmp*6;
		System.out.printf("\n"+(n)+"  \t %.2f ", SqF);

		return SqF;
	}
	
}
