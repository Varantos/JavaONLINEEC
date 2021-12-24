package byepam.javaonline.part_2;

/* ������ 2.12
 * ������������� ������ ������� �� ����������� � �������� �������� ���������.
*/
public class Task2_2_12 {
	//��������� ������-������� ���������� ������ ���������� [0; 40]
	public static int[][] GenMatrixINT_rnd(int n, int m) {  
		int[][] mtrx = new int[n][m];
		int i =0;
		int j =0;
		System.out.println("��������� �������: ");
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=m-1;j++) { 	
			mtrx[i][j]=(int) Math.round(Math.random()*40);
			}
		}	
		
		System.out.print("�");
		for (i=0;i<=m-1;i++) System.out.print("\t"+i);
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i);
			for (j=0;j<=m-1;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	

		return mtrx;
	}
	
	
	public static void main(String[] args) {
	
	int m=10; 		// m -  ����������� �������.
	int n=5; 		// n -  ����������� �������.

	int i=0; 		// �������� ���������
	int j=0;
	int tmp=0;		// ��� ������
	
	int a[][]  = new int [n][m];

	//------------------------------------------
	a= GenMatrixINT_rnd(n, m); 
	//-------------���������� �� �����������!--------------------------------	
	for ( i = 0; i < n; ++i) {		// ������� �����
	  for ( j = 0; j < m; ++j) {
	     for ( int k=j+1; k<m; k++ ){	//���������� �������  �� �����������
	   	   if ( a[i][j]>a[i][k] ) {
	       	 tmp	  =a[i][k];
		 	 a[i][k]  =a[i][j];
             a[i][j]=tmp;
	        }
	     }
	  }
	}
 //-------------------------------------------------    
	System.out.println("\n\n������������� ������ �� �����������!");
	System.out.print("�");
	for (i=0;i<=m-1;i++) System.out.print("\t"+i);// ������� �������
	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	//-------------���������� �� ��������!--------------------------------	
	for ( i = 0; i < n; ++i) {		// ������� �����
		  for ( j = 0; j < m; ++j) {
		     for ( int k=j+1; k<m; k++ ){	//���������� �������  �� ��������
		   	   if ( a[i][k]>a[i][j] ) {
		       	 tmp	  =a[i][k];
			 	 a[i][k]  =a[i][j];
	             a[i][j]=tmp;
		        }
		     }
		  }
		}
	 //-------------------------------------------------	
	System.out.println("\n\n������������� ������ �� ��������!");
	System.out.print("�");
	for (i=0;i<=m-1;i++) System.out.print("\t"+i);// ������� �������
	System.out.println();
	for (i=0;i<=n-1;i++) { 	
		System.out.println();
		System.out.print(i);
		for (j=0;j<=m-1;j++) { 	
			System.out.print("\t"+a[i][j]);
		}
	}	
	
  }
}

