package byepam.javaonline.part_2;
/* ������ 4.16
* 		��������  ���������,  ������������  �����  n-�������  �����,  ����������  ������  ��������  �����. 
*	���������� �����, ������� ������ ���� � ��������� �����. ��� ������� ������ ������������ ������������.
*/

import java.util.Locale;
import java.util.Scanner;

public class Task2_4_16 {
	
	static int input_intVal(String msg) { //������� �����
		int val = 0;
		Scanner scanIn = new Scanner(System.in);
		scanIn.useLocale(Locale.getDefault());
		do {
			System.out.print(msg);
			if (scanIn.hasNextInt()) {
				val = scanIn.nextInt();
				break;
			} else
				scanIn.next();
		} while (true);
		return val;
	}
	static int[] create_vector(int  k, int z) { //  ������� ������ �����  
		 int[] vec = new int[k]; // ������ ��� ������
		 for (;z>0;z/=10){
		    if (k!=0) {
		    	vec[k-1]=z%10;
		        k--;
		    }
		 }
		 return vec;
	}
	static boolean exam_number(int number, int pozs) {
		boolean flg=false;
		int i=0;
		int k=pozs;
		int b=0; // ������� �����
		int[] vector = new int[k];
		vector=create_vector( k, number);
		for (i=0;i<k;i++) 
			 if (vector[i]%2!=0) b++;
		if (b==k) flg=true;
	 return flg;
	 }
	 
	 static int numbering(int n) { // ���������� ����
		int k = 0;
		for (; n > 0; n /= 10)	k++;
	return k;
	}
		
	 static int exam_sum(int number, int pozs) {
		 int i=0;
		 int k=pozs;
		 int a=0; // ������� ���
		 int[] vector = new int[k];
		 vector=create_vector( k, number);
		 for (i=0;i<k;i++)	 
		   if (vector[i]%2==0) a++;
	 return a;
	 }
	 static int create_sum(int num1, int num2, int n) { // ������� �����
		 int sum=0;
		 for (int i=num1;i<num2;i++) {
				if (exam_number(i, n)==true) {
					System.out.print(i+" ");
					sum=sum+i;
				};
			}
		 
	 return sum;
	 }
	public static void main(String[] args) {
		int i=0;
		int n=input_intVal("���������� ���� � �����:");
		int num1=1;
		int num2=1;
		int sum=0;
		System.out.println("����:\t"+n);
		for ( i=1;i<n;i++) num1*=10; 		
		System.out.println("������:\t"+num1);
		for ( i=1;i<=n;i++) num2*=10; 		
		System.out.println("�����:\t"+(num2-1));
		sum= create_sum(num1,num2,n);
		System.out.println("\n����� ��������: "+sum);
		System.out.println("������ ����: "+exam_sum(sum, numbering(sum))); 
	}
}
