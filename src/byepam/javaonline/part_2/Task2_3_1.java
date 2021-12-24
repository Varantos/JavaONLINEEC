package byepam.javaonline.part_2;
/* ������ 3.1
 * 	������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. 
 * 	���������� �� � ����  ������,  �������  ������  ������  �����  k-�  �  (k+1)  -  � 
 *   ����������  �������,  ���  ����  ��  ��������� �������������� ������.
 */

import global.Global;

public class Task2_3_1 {
	public static void main(String[] args) {
		int m1=5; 	    // ����������� ������� �������	
		int m2=10; 	    // ����������� ������� �������
		int k=4; 		// ����������� ����� �

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
		
		System.out.println("�������: VECTOR1[1.."+m1+"] ; VECTOR2[1.."+m2+"] ; k="+k+"\n" );
		
		System.out.print("�\t\t");
		for (i=1;i<=m1m2;i++) 
			System.out.print("\t"+i);
		
		System.out.print("\n\nVECTOR1:\t");
		for (i=1;i<=m1;i++)
			System.out.print("\t"+vctr1[i]);

		System.out.print("\n\nVECTOR2:\t");
		for (i=1;i<=m2;i++) 
			System.out.print("\t"+vctr2[i]);
	
		//-------------------------------------------------------------------
		
		//j=m2;			// � ������������ ������� �� ���������� �������� ��� �������� � ����� � �-����
	    for(i=m1m2+1; i>=(m1m2-(m1-k)+1); i--) {
	    	 vctr1[i-1]=vctr1[i-m2-1];
	    	 vctr1[i-m2-1]= 0;
	   // 	 j--;
	     }
	    
	    
	    
	    
		System.out.print("\n\n����� C "+k+" �������� :") ;
		for (i=1;i<=m1m2;i++)
			System.out.print("\t"+vctr1[i]);
		
	    for (j=1; j<=m2;j++) vctr1[k+j-1]= vctr2[j]; // �������  ������2 � ������1	 
	    
		System.out.print("\n\n������� :\t") ;	
	    
		for (i=1;i<=m1m2;i++)
			System.out.print("\t"+vctr1[i]);

		} 
}
