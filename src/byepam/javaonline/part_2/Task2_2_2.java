package byepam.javaonline.part_2;
/* ������ 2.2
* 	 ���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.
*/
import global.Global;
public class Task2_2_2 {
	public static void main(String[] args) {
		int n=5;
		int m=5;
		int i=0;
		int j=0;
		
		int[][] a = new int[n][m];
		
		a=Global.GenMatrixINT_rnd( n, m); 
		
		System.out.println();
		System.out.print("\n������� ���������: ");
		for (i=0;i<=n-1;i++) { 	       // ������ �� ��������
			for (j=0;j<=m-1;j++) { 
				if (i==j) System.out.print(a[i][j]+"  ");
				
			}
		}
		
		
	}
}
