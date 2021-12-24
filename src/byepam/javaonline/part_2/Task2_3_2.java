package byepam.javaonline.part_2;

import global.Global;

/* ������ 3.2
* 	 ���� ��� ������������������ a1,a2,a3,...an;  b1,b2,b3...bm
*    ���������� �� ��� ����� ������������������ ����� ���, ����� ��� ���� ���� �����������.
*    ����������. �������������� ������ �� ������������.
*/
public class Task2_3_2 {
	public static void main(String[] args) {
		int m1=5; 	    // ����������� ������� �������	
		int m2=10; 	    // ����������� ������� �������

		int m1m2=m1+m2; // ����������� ������� �������, ������������ �� ����������� ��������� �������
		
		int i=0; 		// �������� ��������� ��������
		int j=0;
		
		int[] vctr1 = new int[m1m2+1];	// ������� � ��������� ������ ������
		//	vctr1 = Global.GenVectorInt_rnd(m1m2+1);  //��������� � ������� ������ ��������
			for (i=1;i<=m1;i++)		
				vctr1[i] =(int) Math.round(Math.random()*40);
			
			int[] vctr2 = new int[m2+1];	// ������� � ��������� ������ ������
			//vctr2 = Global.GenVectorInt_rnd(m2+1);  //��������� � ������� ������ ��������
			for (i=1;i<=m2;i++)		
				vctr2[i] =(int) Math.round(Math.random()*40);
		
		System.out.println("\n�������: VECTOR1[1.."+m1+"] ; VECTOR2[1.."+m2+"] \n" );

		System.out.print("�\t");
		for (i=1;i<=m1m2;i++) 
			System.out.print("\t"+i);
		
		System.out.print("\n\nVECTOR1:");
		for (i=1;i<=m1;i++)
			System.out.print("\t"+vctr1[i]);

		System.out.print("\n\nVECTOR2:");
		for (i=1;i<=m2;i++) 
			System.out.print("\t"+vctr2[i]);
		
		//-------------------------------------------------------------
		j=1;
		for ( i = m1+1; i < vctr1.length ; i++) {	//���������� �������
			 vctr1[i] =vctr2[j];
			 j++;
		}
		System.out.print("\n\nvctr1(������):");
		for (i=1; i<=m1m2;i++) {
			System.out.print("\t"+vctr1[i]);
			
		} 
		
		//-------------------------------------------------------------	
		boolean sorted = false;	//��������� ������ 
	    int temp;
	    
	    while(!sorted) {
	        sorted = true;
	        for ( i = 0; i < vctr1.length - 1; i++) {
	            if (vctr1[i] > vctr1[i+1]) {
	                temp = vctr1[i];
	                vctr1[i] =vctr1[i+1];
	                vctr1[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }

	//-------------------------------------------------------------
		
		System.out.print("\n\nvctr1(����):"); // ������������ �������������������, �������������
		for (i=1; i<=m1m2;i++) {
			System.out.print("\t"+vctr1[i]);
			
		} 
		
		
		
	
			
			
		
	}
	
}
