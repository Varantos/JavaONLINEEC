package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* ������ 4.10
 * ����  �����������  �����  N.  ��������  �����(������)  ���  ������������  �������,  ����������  �������� 
* �������� ����� ����� N.
 */
public class Task2_4_10 {
	
	 static int input_intVal(String msg) {   
		int val = 0;  
		//try (
			Scanner scanIn = new Scanner(System.in);
//		{
			scanIn.useLocale(Locale.getDefault());    
			do {
			    System.out.print(msg);
			    if (scanIn.hasNextInt()) {
			        val = scanIn.nextInt();
			        break;
			    } else scanIn.next();
			} while (true);
	 //   }
		return val;
	    }
	
	
	 static int numbering(int n) { // ����������� ������� ��� ����  
		 int k=0;
		 for (;n>0;n/=10)  k++;
		 return k;
	 }
	 
	 static int[] create_vector(int k, int z) { // ����������� ������� ��� ����  
		 int[] vec = new int[k]; // ������ ��� ������
		 for (;z>0;z/=10){
		    if (k!=0) {
		    	vec[k-1]=z%10;
		        k--;
		    }
		 }
		 return vec;
	 }
	 
public static void main(String[] args) {
	int n=input_intVal("������� �����: ");
	int k=numbering(n);
	int[] vector = create_vector( k, n); // ������ ��� ������
	System.out.println("\n������ ����:");  	
	for (int i=0;i<=k-1;i++)  System.out.print("\t "+vector[i]);
}
	
	
}
