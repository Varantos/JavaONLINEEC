package byepam.javaonline.part_2;
/* ������ 1.5
 *   ���� ����� �����: �1,�2,�3,...an.
 *   ������� ��� �������� ai > i.
 */
import global.Global;
public class Task2_1_5 {
	 public static void main(String[] args) {
		
		 int n=Global.InPutIntVal("������� ����������� ������� n: ");
		 int i=0;
		 int[] a = new int[n];
		 a = global.Global.GenVectorInt_rnd(n);  //��������� � ������� ������ � �������

		 System.out.println(); 
		 
		 for (i=0;i<n;i++)
			 System.out.print("\t"+i);  // ���������� ����� �������� �������
	
		 
		 System.out.println("\n���������: ");
		 
		 for (i=0;i<n;i++) 
			 if (a[i]>i) { 				//���� ai > i, ������� � ������� ������� ������� 
				 System.out.print("\t"+a[i]);
				}
	 
	 
		 
	 }
		

}
