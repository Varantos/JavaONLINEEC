package byepam.javaonline.part_2;
/* ������ 2.9
* 	 ������ ������� ��������������� �����. ��������� ����� ��������� � ������ �������. 
* 	 ����������, ����� ������� �������� ������������ �����.
*/
import global.Global;
public class Task2_2_9 {
	public static void main(String[] args) {
		int n=2; // ����������� �������
		int m=3;
		
		int i=0; // �������� ���������
		int j=0;
		int sum_clm=0;
	//	int sum_max=0;
		int[][] a = new int[n+1][m+1];// ������� �������
		
		int[] sum_arc = new int[m+1];// ������� ������ ���� �� ��������		
		a=Global.GenMatrixINT_rnd( n+1, m+1); // ���������� ��������
		
		
		System.out.println("\n\n-----------------------------------------");
		// ������� ����� � ��������
		System.out.print("SUM:");
		for (j=0;j<=m;j++) {
			sum_arc[j]=sum_clm;
			sum_clm=0;
			
			for (i=0;i<=n;i++) { 
				sum_clm+= a[i][j];	
			}
			System.out.print("\t"+sum_clm);
		}

		// �������� ������������� �� ��� � ��������� �� �����
		int maxS=sum_arc[0]; 
		int maxN=0;
		for (j=0;j<=m;j++) {
			if  (maxS<sum_arc[j]) {
		
				maxS=sum_arc[j];
				maxN=j;
			}
		}
		System.out.println("\n-----------------------------------------");
		System.out.print("������������ �����: "+maxS+" � "+maxN+"-� ��������!");
	}
}
