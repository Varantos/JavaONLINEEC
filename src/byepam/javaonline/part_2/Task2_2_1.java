package byepam.javaonline.part_2;

import global.Global;

/* ������ 2.1
* 	 ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������.
*/
public class Task2_2_1 {
	public static void main(String[] args) {
		int n=5;
		int m=10;
		int i=0;
		int j=0;
		
		int[][] a = new int[n][m];
		
		a=Global.GenMatrixINT_rnd( n, m); 
		
		System.out.println();		
		System.out.println();
		System.out.println("��� �������� �������( a(0,0)>a(n,m) ):");
		for (i=0;i<=n-1;i++) { 	       // ������ �� ��������
				System.out.println();  // ������� �� ����� ������ 
				for (j=0;j<=m-1;j++) { // ������ �� �������	
					if (j%2!=0 && a[0][j]>a[n-1][j]) {	// ��� �������� ������, � ������� mtrxd[0][0]>mtrxd[n-1][m-1]
						System.out.print("\t"+a[i][j]);	// ����� ��������
					}
				}
		}
	}
}
