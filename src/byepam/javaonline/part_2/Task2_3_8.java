package byepam.javaonline.part_2;
import java.io.*;
import global.*;

/* ������ 3.4
* 	 �������� ������������ ����� � ������ ����������� �
* 	������������� �� �����������. ����������� ������ - N 
*/

import java.io.*;
import global.*;
public class Task2_3_8{

public static int NOD(int a, int b) { // ���
  return b == 0 ? a : NOD(b, a % b);
}
public static int NOK(int n1, int n2) { // ��� 
  return (n1 / NOD (n1,n2))*n2;
}
//-----------------------------------------------------------------
public static void main(String[] args) {
	String str="";
	int n=3; // ���������� ������
	int i=0; // �������
	int j=0; // �������
	int k=0; // ����� �������
	int d=0; // ����� ��������
	int tmp=0; // ��� ������ ��� ����������
	int numerator[]   = new int [n+1]; // ���������
	int denominator[] = new int [n+1]; // �����������
		
//---------------��������� ������� ���������� � ������������--------------------------		
	for (i=0;i<n+1;i++) {
	  int x=1+(int) Math.round(Math.random()*9);
	  int y=1+(int) Math.round(Math.random()*9);
	  numerator[i] = x;
	  denominator[i] = y;
	  str=str +"   "+numerator[i]+"/"+denominator[i];
	}
	System.out.println(str);
	System.out.println();
//-----------------------------------------------------------------------------------		
	k=NOK(denominator[0],denominator[1]); //��������� ��� 1�� � 2�� �����������
	for (i=0;i<=n;i++) k=NOK(k,denominator[i]);//NOK ����� �������
	for (i=0;i<=n;i++){ //
		d= k / denominator[i]; 			// ��� ����� ��� ��������� ������ �����
		numerator[i]=numerator[i]*d;	// �������� � ������ �����������
		denominator[i]=denominator[i]*d;// ������ �����
	};
	System.out.println();
//-----------------------���������� ���������� (���������)---------------------------
	for(i = numerator.length-1 ; i > 0 ; i--){
       for(j = 0 ; j < i ; j++){
           if(numerator[j] > numerator[j+1] ){
                tmp = numerator[j];
                numerator[j] = numerator[j+1];
                numerator[j+1] = tmp;
           }
       }
    }
 //-------------------����� � �������-------------------------------------------------
	str="";
	for (i=0;i<n+1;i++) 
		str=str +"   "+numerator[i]+"/"+denominator[i];
		System.out.println(str);
	}
//---------------------------------------------------------------
}
