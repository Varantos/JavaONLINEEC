package byepam.javaonline.part_2;

import global.Global;

/* ������ 2.8
* 	 � �������� ������� �������� ������� ��� �������  �������, �. �. ��� �������� ������ ������� ��������� 
*	 �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������ �������� ������ 
*	 ������������ � ����������.
*/
public class Task2_2_8 {
	public static void main(String[] args) {
		int n=3; // ����������� �������
		int m=5;
		
		int i=0; // �������� ���������
		int j=0;

		int tmp=0;
		
		int[][] a = new int[n+1][m+1];// ������� �������
		a=Global.GenMatrixINT_rnd( n+1, m+1); // ���������� ��������
		
		 // ����� ������������� ������� ������	
		System.out.println("\n-----------------------------------------");
		int k=Global.InPutIntVal("������� ����� ������� �������� ��� ������: ");
		int p=Global.InPutIntVal("������� ����� ������� �������� ��� ������: ");
		
		if (k>n || p>m) {
			System.out.println("������ ��������� ������� �� ������� �����������!\n��������� ��������� �����!");
			System.exit(0);
		}
		
		System.out.println("\n-----------------------------------------"); 
		System.out.print("\t"+k+"\t"+p+"\n"); 
		
		for (i=0;i<=n;i++) {
			System.out.println();
			for (j=0;j<=m;j++) { 	
					if( (j==k) || (j==p) ) System.out.print("\t"+a[i][j]);

			}
		}
		System.out.println("\n-----------------------------------------");
		// ������ ������� ��������
		for (i=0;i<=n;i++) {
			tmp=a[i][k];
			a[i][k]=a[i][p];
			a[i][p]=tmp;
		}
		// ������� � ������� ���������� �������
		System.out.println();
		System.out.print("�");
		for (i=0;i<=m;i++) System.out.print("\t"+i);
		System.out.println();
		for (i=0;i<=n;i++) { 	
			System.out.println();
			System.out.print(i);
			for (j=0;j<=m;j++) { 	
				System.out.print("\t"+a[i][j]);
			}
		}	
		
		
		
		
		
	}
}