package byepam.javaonline.part_2;
/* ������ 2.3
* 	 ���� �������. ������� k-� ������ � p-� ������� �������/
*/
import global.Global;
public class Task2_2_3no {
	public static void main(String[] args) {

		int n=10;
		int m=15
				;
		int i=0;
		int j=0;
		String str1="\t";
		String str2="\t";
		
		int k =Global.InPutIntVal("����� ������ (k<n): ");
		int p =Global.InPutIntVal("����� �������(p<m): ");
		int[][] a = new int[n][m];
	
		a=Global.GenMatrixINT_rnd( n, m+1); 
	
		System.out.println("\n");
		for (i=0;i<=p-1;i++)str1=str1+"\t"; // ��������� TAB-�� �� ������� ��� �������
		
		System.out.println("\n\n������� �="+k+"-� ������, p="+p+"-� �������: \n");
		
		for (i=0;i<=m;i++) System.out.print("\t"+i); System.out.println("\n"); // ������� ������� ��������
		

		for (i=0;i<=n-1;i++) {										// ������ �� ��������
			 System.out.println(str1+a[i][p]); 						// �������� ������� - p
			for (j=0;j<=m;j++) { 									// ������ �� �������
				if (i==k-1) System.out.print("\t"+a[k][j]); 		//�������� ������ - k
				
			}		
		}
		
	
		
	}
}
