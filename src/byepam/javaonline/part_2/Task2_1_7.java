package byepam.javaonline.part_2;
/* ������ 1.7
 *   ���a  �������������� ����� �[1],a[2],a[3]....a[n].  
 *   max(a[1]+a[2n],a[2]+a[2n-1],...,a[n]+a[n+1])
 *   
 *  [a1, a2, a3, ......., an , ............... , a2n]
 *  max(a1 + a2n, a2 + a2n-1, a3+ a2n-2, a4+ a2n-3, a4+ a2n-3,........, an + an+1)
 */
import global.Global;
public class Task2_1_7 {
	 public static void main(String[] args) {
		 int i=0;
		 int j=0;	
		 int n=Global.InPutIntVal("������� ����������� ������� n: ");		 
		 double[] a = new double[n*2];	     // ������ ��������� �������� ��������� �������
		 a = Global.GenVectorDbl_rnd(n*2);   // ��������� ���������� ������� � ������� ������ � �������
		 double midl=a[1]+a[n];
		 System.out.println();
		 System.out.printf("��������:\n");
		 for ( i = 0, j = 2*n - 1; i < j; i++, j--) { // ������ ������ �� i: [0,   n-1]  �� ���������� 
			 										  // ������ ������ �� j: [2n-1,n-1]  �� ��������
		        midl =  a[i] + a[j];				  // c�������� �������� � ������ � � ����� ������� ���� i<j (����  i � j �� ������ ����� n-1 )
		        System.out.printf(" %.2f\t", midl);   // ������� ��������� 
		 }
	 }
}

