package byepam.javaonline.part_2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/* ������ 4.6
 *  �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������
 */
public class Task2_4_6 {
	
 static int[] In_IntVal(int n) {   
	int i=0;
	int []val;  
	val = new int [n];
	try(Scanner scanner = new Scanner(System.in)){
		scanner.useLocale(Locale.getDefault());
		do {
			System.out.print("�����-"+(i+1)+": ");
			    if (scanner.hasNextInt()) {
			        val[i] = scanner.nextInt();
			        i++;
				    if (i==n) break;
				}   else scanner.next();	
		} while (true);
	}// try
	 catch (Exception e) {
           e.printStackTrace();
       } //����� ����������    
	return val;
}
	
 public static int gcd(int a, int b) { //���
		if (b==0) return a; //���� ����� �������� �� ���� - �����
		   return gcd(b,a%b);//����� � ���������� ����������� ���������
}
	
 public static boolean Solution(int[] a) { 
	 boolean flag=false;
	 int fl=0;
	 for (int i=0;i<3;i++) {
			for (int j=0;i<3;i++) {
				if (i!=j)
					if (gcd(a[i],a[j])!=1) 
						fl++;
			}
		}
		if (fl == 0)	
			flag=true;
		else 
			flag=false;
	   return flag;
}
		
public static void main(String[] args) {
	int [] num=new int [3];
	num=In_IntVal(3);	
	int fl=0;
	for (int i=0;i<3;i++)System.out.print(num[i]+"\t");
	if (Solution(num))	
		System.out.println("\n ����� ��������������!");
	else 
		System.out.println("\n ����� ����������������!");
	}
}
