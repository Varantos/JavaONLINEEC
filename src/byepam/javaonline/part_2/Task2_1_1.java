package byepam.javaonline.part_2;
import java.util.Locale;
import java.util.Scanner;

/* ������ 1.1
 *   � ������� A[N] �������� ����������� �����.
 *   ����� ����� ��� ���������, ������� ������ ������� �.
 */

public class Task2_1_1 {
	
	//���� ������������� �����  int
	public static int InPutIntVal(String msg) {   
		int val = 0;  
		//try (
			Scanner scanIn = new Scanner(System.in);
//		{
			scanIn.useLocale(Locale.getDefault());    
			do {
			    System.out.print(msg);
			    if (scanIn.hasNextInt()) {
			        val = scanIn.nextInt();
			        break;
			    } else scanIn.next();
			} while (true);
	 //   }
		return val;
	    }
//��������� ������-������ ���������� ������������� ���������� [0; 40]
	public static int[] GenVectorInt_rnd(int n) { 
		int[] vector = new int[n];
		int cnt	= 0;
		System.out.println("��������� ������: ");
		for (cnt=0;cnt<=n-1;cnt++) { 		
			vector[cnt]=(int) Math.round(Math.random()*40);
			System.out.print("\t"+vector[cnt]);
		}
		return vector;
	}
	public static void main(String[] args) {
		int   cnt=0;
		int   sum=0;
		int   n	 =InPutIntVal("������� ����������� ������� n: "); 	// ������ ����������� �������
		int   k	 =InPutIntVal("������� ����� k: "); 				// ������ ����� k
		int[] a  =new int[n]; 											// ��������� � �������������� ������
		
		System.out.print("������:  ");
		a= GenVectorInt_rnd(n);// ��������� ������ ���������� ������ ���������� � �������� 100
		
		System.out.print("\n"+"�������: "); 
		for (cnt=0;cnt<=n-1;cnt++) { 			// ���������� �������� �������
			if ( a[cnt]%k ==0 ) {				// ��������� ��������� ������� ��������
				System.out.print(a[cnt]+"  ");	// ����� � ������� �������
				sum=sum+a[cnt];					// ������� ����� �������
			}
		}
		System.out.print("\n����� ������� ���������: "+sum); //������� �����
		
	}
}
