package byepam.javaonline.part_2;
/* ������ 2.1
 *   � ������� A[N] �������� ����������� �����.
 *   ����� ����� ��� ���������, ������� ������ ������� �.
 */
import global.Global;
public class Task2_1_1 {
	public static void main(String[] args) {
		int   cnt=0;
		int   sum=0;
		int   n	 =Global.InPutIntVal("������� ����������� ������� n: "); 	// ������ ����������� �������
		int   k	 =Global.InPutIntVal("������� ����� k: "); 				// ������ ����� k
		int[] a  =new int[n]; 											// ��������� � �������������� ������
		
		System.out.print("������:  ");
		a= Global.GenVectorInt_rnd(n);// ��������� ������ ���������� ������ ���������� � �������� 100
		
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
