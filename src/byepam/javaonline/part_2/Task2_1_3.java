package byepam.javaonline.part_2;
/* ������ 1.3
 *   ��� ������ �������������� ����� �1,�2,�3,...an. ����������� n.
 *   ���������� ������� � ��� �������������, ������������� � ������� ���������.
 */
import global.Global;

public class Task2_1_3 {
	 public static void main(String[] args) {
	int i  =0;
	int sum=0;
	
	int n		 =Global.InPutIntVal("������� ����������� ������� n: ");
	double[] a = new double[n];
	a 		 = Global.GenVectorDbl_rnd(n);  //��������� � ������� ������ ��������
	
	System.out.print("\n������������� �������� sum: ");
	for(i=0; i<=n-1;i++)    //�������: ������������� � ���������
		if (a[i]>0) sum++;
	System.out.print(sum);
	
	sum=0;
	System.out.print("\n������������� �������� sum: ");
	for(i=0; i<=n-1;i++)    //�������: ������������� � ���������
		if (a[i]<0) sum++;
	System.out.print(sum);

	sum=0;
	System.out.print("\n�������  ��������  sum:     ");
	for(i=0; i<=n-1;i++)    //�������: ������� � ���������
		if (a[i]==0) sum++;
	System.out.print(sum);
	}
	
}
