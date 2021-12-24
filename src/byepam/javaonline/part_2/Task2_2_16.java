package byepam.javaonline.part_2;
/* ������ 2.16
 * 	���������� ��������� �������  n ���������� ���������� ������� ������� nxn, ������������ �� ����� 1, 2, 3, 
 * ...,2n ���, ��� ����� �� ������� �������, ������ ������ � ������ �� ���� ������� ���������� ����� ����� 
 * �����. ��������� ����� �������. 
 */
		
public class Task2_2_16 {
	public static int[][] MatrixINT_null(int n) {  
		int[][] mtrx = new int[n][n];
		int i =0;
		int j =0;
		System.out.println("��������� �������: ");
		for (i=0;i<=n-1;i++) { 	
			for (j=0;j<=n-1;j++) { 	
			mtrx[i][j]=0;
			}
		}	
		
		System.out.print("�");
		for (i=0;i<=n-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (j=0;j<=n-1;j++) { 	
				System.out.print("\t"+mtrx[i][j]);
			}
		}	
	return mtrx;
	}
	
//---------------------------------------------------------------------------------------------	
	static void OddMagic(int n,int array[][]){// ���������� ������� ��������� �������
		int x=0, y=n/2;
        for(int i=1; i<=n*n; i++){
          	array[x][y]=i;
            x--;                                 			// �� ������� ��������� ������ ������� ����
            y++;
            if(x<0 && y>n-1) {x=x+2; y=y-1;}     			// ���������� �� ���������
            else if(x<0) x=x+n;                 			// ���������� �� ������� �������
            	else if(y>n-1) y=y-n;                		// ���������� �� ������ �������
            		else if(array[x][y]!=0) {x=x+2; y=y-1;} // ������ ������� ���� ��������
        }
        
    }
	

	
	static void SingleEvenMagic(int n,int array[][])                  // ��������� ���������� �������
	{
  		int tmp=0;
	    int n0=n/2;
	    OddMagic(n0,array);                            // ��������� ���������� ������� �� 2 * 2 ���������� �������� ��������� �������, ������� ������� ����������� �������� ��������� ������� ��� ���������� ����������� �������� ��������� ������� � ������� ����� ����
	    for(int i=0; i<n0; i++)
	        for(int j=0; j<n0; j++)
	        {
	        	array[i+n0][j+n0]=array[i][j]+n0*n0;       // ��������� �������� ���������� ������� � ������ ������ ����
	        	array[i][j+n0]=array[i+n0][j+n0]+n0*n0;     // ��������� �������� ���������� ������� � ������ ������� ����
	        	array[i+n0][j]=array[i][j+n0]+n0*n0;       // ��������� �������� ���������� ������� � ����� ������ ����
	        }
	    int k=(n-2)/4;                             // �������������� ������� n = 4 * k + 2
	    for(int i=0; i<n0; i++)
	        for(int j=0; j<k; j++)
	            if(i==n0/2) { // ������ ������� k ��������� ����� ������� � �������� ����������� �������� � ������� ����� ���� � ���������������� ���������� � ���������� �������� � ������ ����� ����
	            	tmp=array[i][i+j];
	            	array[i][i+j]=array[i+n0][i+j];
	            	array[i+n0][i+j]=tmp;	
	            }
	            else { // �������� ������� ������ k ��������� ������ ������ �������� ������ ����������� ��������, ����� ������� ������, � ���������������� ���������� � ������ ����� ���������� ��������
	            	tmp=array[i][j];
	            	array[i][j]=array[i+n0][j];
	            	array[i+n0][j]=tmp;
	            }
	    for(int i=0; i<n0; i++)
	        for(int j=n0+n0/2; j>n0+n0/2-(k-1); j--) {  // ������ ������� �������� � ������� k-1 ������ ������ � ������� ������� ����������� �������� � ������� ������ ���� � ���������������� ���������� � ���������� �������� � ������ ������ ����
	           tmp=array[i][j];
	           array[i][j]=array[i+n0][j];
	           array[i+n0][j]=tmp;
	        }
	     
	}

	static void DoubleEvenMagic(int n,int array[][])                  // ���������� ������� �������� ������� �������
	{
	  
	    for(int i=1, x=0, y=0; i<=n*n; i++)      // ��������������� ����������� ��������� ��������
	    {
	    	array[x][y]=i;
	        y++;
	        if(y>n-1) {x++; y-=n;}
	    }
	    for(int i=0; i<n; i++)                   // ��������� ���������� ������� �� m * m ���������� ��������� 4-�� ������� � �������� ������������ �������� ������� ����������� �������� 4-�� ������� ��� �����������
	        for(int j=0; j<n; j++)
	            if(i%4==0 && j%4==0)             // ����� ���������
	                for(int k=0; k<4; k++)
	                	array[i+k][j+k]=(n*n+1)-array[i+k][j+k];
	            else if(i%4==3 &&j%4==0)         // ������ ���������
	                for(int k=0; k<4; k++)
	                	array[i-k][j+k]=(n*n+1)-array[i-k][j+k];
	}
	
	static boolean Check(int n,int m[][])
	{
	    int cnt=n*(n*n+1)/2;                                // ����� ������ ������, ������� � ���������
	    for(int i=0; i<n; i++)
	    {
	        int sum_row=0,sum_line=0;
	        for(int j=0; j<n; j++)
	            {
	                sum_row+=m[i][j];                       // ��������� ������
	                sum_line+=m[j][i];                      // ��������� �������
	            }
	        if(sum_row!=cnt || sum_line!=cnt) return false;
	    }
	    int sum_left=0,sum_right=0;
	    for(int i=0; i<n; i++)
	    {
	        sum_left+=m[i][i];                              // ��������� ����� ���������
	        sum_right+=m[n-i-1][i];                         // ��������� ���������� ���������
	    }
	    if(sum_left!=cnt || sum_right!=cnt) return false;
	    return true;
	}
	
	static void Printmatrx(int n,int array[][]) {
		System.out.println("\n");
		
		System.out.print("�");
		for (int i=0;i<=n-1;i++) System.out.print("\t"+(i+1));
		System.out.println();
		for (int i=0;i<=n-1;i++) { 	
			System.out.println();
			System.out.print(i+1);
			for (int j=0;j<=n-1;j++) { 	
				System.out.print("\t"+array[i][j]);
			}
		}	
		
		
		
	}
	
	public static void main(String[] args) {
		int n=9;
		int a[][]  = new int [n][n];
		
		a=MatrixINT_null(n); 
		
		
		if (n%2!=0){  // �������� �������
            OddMagic(n,a);
		}
		if (n%2==0){  // ������ ������� ��������� �������� 
			SingleEvenMagic(n,a);
		}
		if (n%4==0){  // ������ ������� ������� �������� 
			DoubleEvenMagic(n,a);
		}
	
		if (Check(n,a)) {
			Printmatrx(n,a);
		
		}
	}
		
		
}
