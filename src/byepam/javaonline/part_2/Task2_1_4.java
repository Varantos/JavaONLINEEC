package byepam.javaonline.part_2;
/* ������ 2.4
 *   ���� �������������� �����: �1,�2,�3,...an.
 *   �������� ������� ������������ � ����������� ��������.
 */
import global.Global;
public class Task2_1_4 {
	 public static void main(String[] args) {
		int n=0;
		int i=0;
		int min_i=0;
		int max_i=0;
		double tmp=0;
			
		n=Global.InPutIntVal("������� ����������� ������� n: ");
		double[] a = new double[n];
		a = Global.GenVectorDbl_rnd(n);  //��������� � ������� ������ ��������
				
		//����� ������������� �������
		tmp=a[0];
		for (i=0;i<n;i++) 
			if (a[i]<tmp) { 
				min_i=i;
				tmp=a[i];
			}
		
		System.out.print("\nmin_i :: a("+min_i+")=");System.out.printf("%.2f\t\n",a[min_i]);

		//����� ������������ � �������
		tmp=a[0];
		for (i=0;i<n;i++) 
			if (a[i]>tmp) {
				max_i=i;
				tmp=a[i];
			}
		
		System.out.print("max_i :: a("+max_i+")=");System.out.printf("%.2f\t\n",a[max_i]);

		//������ ������� ������������ � ������������
		tmp=a[min_i];
		a[min_i]=a[max_i];
		a[max_i]=tmp;
		
		System.out.println("�������� ������:");
		for(i=0; i<=n-1;i++)
			System.out.printf("%.2f\t",a[i]);
	 }
}
