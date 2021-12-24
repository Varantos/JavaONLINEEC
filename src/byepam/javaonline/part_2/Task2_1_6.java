package byepam.javaonline.part_2;
/* ������ 1.6
 *   ������  ������������������  N  ������������  �����.  
 *   ���������  �����  �����,  ����������  ������  ������� 
 *   �������� �������� �������.
 */
import global.Global;
public class Task2_1_6 {
		 public static void main(String[] args) {
			 int n=Global.InPutIntVal("������� ����������� ������� n: ");
			 int i=0;
			 double sum=0;
			 double[] a = new double[n];
			 
			 a = Global.GenVectorDbl_rnd(n);  //��������� � ������� ������ � �������

			 for (i=0;i<=n-1;i++){
				 if (TestPrime(i)==true) sum=sum+a[i];
			 }
			  
			 System.out.println("\n����� ��������� � ��������� ���������: "+sum);
		 }
		 
static boolean TestPrime(int cnt) {	//������������� �������� ����� �� ��������
	boolean flag=false;
	int i=0; 
	int divs=0;
	
	for (i=2;i<cnt-1;i++ ) {
		if (cnt%i==0) divs++;
	} 
	if (divs==0) flag=true;
	return flag;	
}
}
