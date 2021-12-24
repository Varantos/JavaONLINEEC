package byepam.javaonline.part_2;

import java.util.Locale;
import java.util.Scanner;

/* ������ 4.13
 * ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43). 
 * ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ���  n  -  �������� ����������� ����� ������ 2.  ��� 
 * ������� ������ ������������ ������������.
 */
		
public class Task2_4_13 {
	static boolean ifprime(int n){
		   for (int i = 2; i < Math.round(Math.sqrt(n)); i++) {
	        	if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }	
	 static void pair(int num){
	        System.out.print("��������: \n");
	        for (int i = num; i <= 2*num - 2 ; i++) {
	           if (ifprime(i) && ifprime(i + 2) )
	                          System.out.println(i + ", " + (i + 2) + "; ");// 
	        }
	        System.out.println();
	 }
	static int input_intVal(String msg) {   
		int val = 0;  
			Scanner scanIn = new Scanner(System.in);
			scanIn.useLocale(Locale.getDefault());    
			do {
			    System.out.print(msg);
			    if (scanIn.hasNextInt()) {
			        val = scanIn.nextInt();
			        break;
			    } else scanIn.next();
			} while (true);
			return val;
		}
	public static void main(String[] args) {
		int num=input_intVal("������� �����:");
		pair(num);
	
		
	}
	
}
