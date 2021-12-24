package byepam.javaonline.part_2;

import global.Global;

/* ������ 3.6
* 	 ���������� �����
*		���  ������  n  ��������������  �����.  
*		���������  �����������  ���  ��  �����������. 
*		�������� ��� ��������� �������: 
* 			������������ ��� �������� �������� a(i) � a(i+1);
* 			����  a(i)<=a(i+1), �� ������������ ��  ����  �������  ������;  
* 			���� a(i)>a(i+1),  ��  ������������  ������������  �  ����������  ��  ����  �������  �����;
*			c�������� �������� ���� ����������.
*/
public class Task2_3_6 {
	public static void main(String[] args) {
		int n=10;
		int i=0;		
		
		int[] a = new int[n];			 // ������� � ��������� ������ ������
		a = Global.GenVectorInt_rnd(n);  //��������� � ������� ������ ��������
		ShellSort( n,  a);
		
		System.out.println("\n");
		System.out.print("�������������! �������� �����:\n");
		for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);
	
	}

//------------------------------------------------------	
	static void ShellSort(int n, int a[]){
	    int i, j, step;
	    int tmp;
	    for (step = n/2; step>0; step/=2)
	        for (i = step; i<n; i++){
	            tmp = a[i];
	            for (j=i; j>= step; j-= step){
	                if (tmp<a[j-step])
	                    a[j]=a[j-step];
	                else
	                    break;
	            }
	            a[j] = tmp;
	        }
	}
//------------------------------------------------------	
	
}
