package byepam.javaonline.part_2;
/* ������ 2.14
*   ������������ ��������� ������� m  x  n, ��������� �� ����� � ������, 
* 	������ � ������ ������� ����� ������ ����� ������ �������
*/
public class Task2_2_14 {
	public static void main(String[] args) {
	
	int m=10; 		// m -  ����������� �������.
	int n=10; 		// n -  ����������� �������.
	int cnt=0;
	int i=0;
	int j=0;
	int[][] mtrx = new int[m+1][n+1];
	
	
	//---------------------------------------------------------
	for (i=1;i<m;i++) { 
		// cnt=(int) Math.round(Math.random()*i);
		 for (j=0;j<=i;j++) {
			 cnt=(int) Math.round(Math.random()*(i));
			 mtrx[cnt][j]=cnt; 
			 
		 }
	 }
	 //--------------------------------------------------
	 
	 System.out.print("�");
		for (i=1;i<=n;i++) System.out.print("\t"+i);
		System.out.println();
		for (i=1;i<=m;i++) { 	
			System.out.println();
			System.out.print(i);
			for (j=1;j<=n;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	
		
	 
	 
		 
		 
	}
}
