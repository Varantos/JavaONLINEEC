package byepam.javaonline.part_2;
/* ������ 2.10
* 	 ����� ������������� �������� ������� ��������� ���������� �������
*/
import global.Global;
public class Task2_2_10 {
	public static void main(String[] args) {
		int n=8;
		int i=0;
		int j=0;
		double[][] a = new double[n][n];// ������������ ������� 
		a= Global.GenMatrixDbl_rnd(n,n);
		System.out.print("\n\n������������� �������� ������� ���������:  ");
		
		for (i=0;i<=n-1;i++) {   //��������� �������		�� ��������
			for (j=0;j<=n-1;j++) { //�� �������� �� (j-1)   �� ������� ���������
				if ( (i==j) && (a[i][j]>0) )  System.out.printf("%.2f    ",a[i][j]);//���� ������� � ���������(i=j)?
			 																		// �� ������������� - ������� � �������		
			}
		}

	}
}
