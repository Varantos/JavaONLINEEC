package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* ������ 4.9
* 	���� ����� X, Y, Z, � � ����� ������ ����������������. 
* �������� �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y� ������.
* 
* (������� �������� + ������� ������).
* ������� ������ ��� ������������� ������������ pl_tr:=sqrt(p*(p-x)*(p-y)*(p-z)); 
* S ����������������� = S �������. ������������ +(-) S ������. ������������. ��� ������� ��������.
* ��� ��������� - ���������� �������. ��� ��������� - �������� �������.
*/
public class Task2_4_9 {
	
	static double[] In_IntVal(int n) { //���� ������� ������  x,y,z,t
		int i=0;
		double []val;  
		val = new double [n];
		try(Scanner scanner = new Scanner(System.in)){
			scanner.useLocale(Locale.getDefault());
			do {
				System.out.print(" :: "+(i+1)+": ");
				    if (scanner.hasNextFloat()) {
				        val[i] = scanner.nextFloat();
				        i++;
					    if (i==n) break;
					}   else scanner.next();	
			} while (true);
		}// try
		 catch (Exception e) {
	           e.printStackTrace();
	       } //����� ����������    
		return val;
	}

	static double diag(double x, double y) {				// ������� �������� (���������-����������)
		return  Math.sqrt(x*x+y*y);
	}

	static double half_per(double t1, double t2,double t3) {// ������������ ������������
		return (t1+t2+t3)/2 ;
	}
	static double pl1(double x1, double y1) { 				// ������� �������������� ������������
		return (x1+y1*0.5)/2 ;
	}
	
	static double pl2(double[]vershs) { 					// ������� ������������� ������������ �� ���� ��������(������� ������) 
		double x=	vershs[0];
		double y=	vershs[1];
		double z=	vershs[2];
		double t=	vershs[3];
		double d = diag(x,y);				//���������
		double p = half_per(z,t,d); 		//������������
		return Math.sqrt(p*(p-z)*(p-t)*(p-d)); 
	}
	
	static double pl(double pl1, double pl2) {
		return pl1+pl2;
	}
	
public static void main(String[] args) {
		System.out.println("������� �������:");
		double [] vershs=new double [3];
		vershs=In_IntVal(4);	
		System.out.printf("������� ������: %.2f",pl(pl1(vershs[0],vershs[1]),pl2(vershs)));
	}
	
}

