package byepam.javaonline.part_2;
/* ������ 2.11
 * ������� 10x20 ��������� ���������� ������� �� 0 �� 15.
 *  ������� �� ����� ���� ������� � ������ �����, � ������� ����� 5 ����������� ��� � ����� ���
 * 
 */

public class Task2_2_11 {
	public static void main(String[] args) {

	int n=10; 		// n -  ����������� �������.
	int m=20; 		// m -  ����������� �������.

	int i=1; 		// �������� ���������
	int j=1;
	int cnt5=0; 	// ��� ������������ 5
	int a[][]  = new int [n+1][m+1];
	int[] sum_n5 = new int[m+1];// ������� ������ ��������� 5�� �� ��������		
	//------------------------------------------
	System.out.println("��������� �������: ");// ���������
	for (i=1;i<=n;i++) 	
		for (j=1;j<=m;j++) 	
			a[i][j]=(int) Math.round(Math.random()*15);
	//------------------------------------------	
	System.out.print("�");
	for (i=1;i<=m;i++) System.out.print("\t"+i);// ������� �������
	System.out.println();
	for (i=1;i<=n;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=1;j<=m;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	//------------------------------------------
	System.out.println("");// ������� ���������� ������� � �����  � ������� ��������� ������ ����
	for (i=1;i<=n;i++) { 	
			sum_n5[i]=cnt5;
			cnt5=0;
			for (j=1;j<=m;j++) { 
				
				if (a[i][j]==5) cnt5+=1;	
			}
			if (cnt5>=3) System.out.print("\t ��������� :: "+i+"-� ������; ���-�� 5��: "+cnt5+"\n");
			
		}	
	//------------------------------------------
	System.out.println();	
	cnt5=0;
	for (i=1;i<=n;i++) {// �������� ���� ������� �� ������� ����� � ������� ������ �� ����������� 
		if ( sum_n5[i]<3 ) cnt5+=1;	
	}
	if (cnt5==n) System.out.print("��� �����, ��������������� ������� ������!");

  }
}
