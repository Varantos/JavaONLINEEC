package byepam.javaonline.part_2;

import global.Global;

/* ������ 2.7
* 	 C����������� ���������� ������� ������� n �� ��������� �������
* 	
* 					1 1 1 1 1 1 1 1 1
* 					0 1 1 1 1 1 1 1 0 
* 					0 0 1 1 1 1 1 0 0 
* 					0 0 0 1 1 1 0 0 0
* 					0 0 0 0 1 0 0 0 0
* 					0 0 0 1 1 1 0 0 0
* 					0 0 1 1 1 1 1 0 0 
* 					0 1 1 1 1 1 1 1 0
*  					1 1 1 1 1 1 1 1 1
* 
*/
public class Task2_2_6 {
	public static void main(String[] args) {
	
	int i=0;
	int j=0;
	
	 

	int n  =Global.InPutIntVal("������� ����� Z: ");
	
	
	if (n <= 2 || n%2!=0){ 	// �������� ��� ������ ��: ������ ����������� ��������� 
		System.out.println("n - �������� �����!");
		System.exit(0);
	}
	
	int[][] a = new int[n+1][n+1]; // ������������ �������
	
	System.out.print("      ");
	for (i=0;i<=n;i++) System.out.print(" "+i+" ");
	System.out.println("\n");
	
	for (i=0;i<=n;i++) {    //��������� �������		�� ��������
		
		for (j=0;j<=n;j++) { //�� �������� �� (j-1)  - �� ������� ���������
			//         ������� ������                          ������ ������
			if ( (  (i <= j) && (j <= n - i )  ) || ( (i >= j) && (j >= n - i ) )  ) {
				a[i][j] = 1;
			}
		}
	}

	for (i=0;i<=n;i++) { //������� ���������� �������
		System.out.print("  "+i+"    ");
		for (j=0;j<=n;j++) { 
			 System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
}
	}
