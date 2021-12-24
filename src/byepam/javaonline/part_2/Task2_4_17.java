package byepam.javaonline.part_2;
/* ������ 4.17
 *�� ��������� ����� ����� ����� ���  ����. �� ���������� ����� ����� ����� ��� ���� � �.�. 
 *������� ����� �������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ ������������. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Task2_4_17 { 
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
	}//------------------------------------------
	static int sum_nums(int n) { //����� ���� �����
		int sum=0;
		   if (n < 10) return 1;
		   while(n != 0){
		       //������������ ���� �����
		        sum += (n % 10);
		        n/=10;
		}
	
    return sum;
	}//------------------------------------------
 	static int minus_nums(int num, int cnt) { // �������� �����-���������
 		int sum=sum_nums(num);
 		if (num-sum==0) return cnt;
	return minus_nums(num-sum,cnt+1);
 	}//------------------------------------------
public static void main(String[] args) {
 	 int number=input_intVal("������� �����: ");
 	 System.out.print("����� ����: "+sum_nums(number)+"\n");
	 System.out.println("���������� �������� (�����-���������): "+minus_nums(number,1)); 
}
}
