package byepam.javaonline.part_2;
/* ������ 1.10
* 	 ��� �������������  ������  �  �����������  ���������  �.  
* 	 �����  ������,  ��������  ��  ����  ������  ������ 
*     ������� (�������������� �������� ��������� ������). 
*    ����������. �������������� ������ �� ������������)
*/
public class Task2_1_10 {
	public static void main(String[] args) {
					//��� �����������
		int n=10;
		int sz=n;
		int i=0,j=0;
		int tmp=0;
		int[] a = {10,11,12,13,14,15,16,17,18,19,20};

		System.out.println("�������:");	
		for (i=0;i<=n;i++) 	System.out.print("\t"+i);
		System.out.println();
		
		System.out.println("��������:");
		for (i=0;i<=n;i++) 	System.out.print("\t"+a[i]);
		System.out.println();
		
		for ( i = 0; i < n; ++i) // �������� ������ ������� � ������ �������� �����
	        if( i%2==0) { a[i]=0; sz--;}  
	    
		System.out.println("������:");
		for (i=0;i<=n;i++) 	System.out.print("\t"+a[i]);
		
		System.out.println();
		
		//��������� ������������ ����� � �������� ������
		for( i=0; i < n; i++) {            // i - ����� �������
		    for( j = n; j > i; j-- ) {     // ���������� ���� �������
		      if ( a[j-1] == 0 ) {
		      tmp=a[j-1]; a[j-1]=a[j]; a[j]=tmp;
		    }
		  }
		}
		System.out.println("�����:");	
		for (i=0;i<=sz;i++) 	System.out.print("\t"+a[i]);
		
		
	}

}
