package byepam.javaonline.part_2;
/* ������ 1.2
 *   ���� ������������������ �������������� ����� �1,�2,�3,...an.
 *   ��������� ��� ��������, ������� Z, ���� ������. ���������� ���������� �����.
 */
import global.Global;
public class Task2_1_2 {
	 public static void main(String[] args) {
		int n  =Global.InPutIntVal("������� ����������� ������� n: ");
		int Z  =Global.InPutIntVal("������� ����� Z: ");
		int cnt=0; // ����������� �����

		double[] a = new double[n];
		a = Global.GenVectorDbl_rnd(n);  //��������� � ������� ������ ��������
				
		for(int i=0; i<=n-1;i++)  		   // ������ ��������� ������� ������� Z ������ ������ Z
			if (a[i]>Z) {a[i]=Z; cnt++;};
		
		System.out.println();
		
		for(int i=0; i<=n-1;i++)
			System.out.printf("%.2f\t",a[i]);
		
		System.out.print("\n���������� �����: "+cnt);	 
		 
	 }
	
}
