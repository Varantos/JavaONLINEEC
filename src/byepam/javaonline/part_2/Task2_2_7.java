package byepam.javaonline.part_2;
/* ������ 2.7
* 	 C����������� ���������� ������� ������� n �� ��������� �������
* 					A[i][j]=sin((I*I-J*J)/n)
* 	� ���������� ����������� �������������� ��������� � ���
*/
public class Task2_2_7 {
	public static void main(String[] args) {
		int n=5; 		// n - �� ����� ����! ����������� �������.
		int i=0; 		// �������� ���������
		int j=0;
		int nums=0; 	// ��� ������������
		
		double[][] a = new double[n][n]; // ������������ ������� 
		nums=0;
		for (i=1;i<=n-1;i++) { 
			System.out.println();
			for (j=0;j<=n-1;j++) { 
				a[i][j]=Math.sin ( (i*i-j*j)/n );
				if (a[i][j]>0) nums++;			// ������� ������������� ��������
				System.out.printf("\t %.2f", a[i][j]); // ����� �������
			}
		}
		System.out.print("\n\n����������� ������������� ��������� � ������� NUMS ="+ nums);// ������� ����� ���������
		
	}		
}
