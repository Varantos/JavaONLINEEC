package byepam.javaonline.part_3;

import java.util.Scanner;

/*  ������ 3.2.7
 *  �������� ������. ��������� ������� �� ��� ������������� ������� � ��� �������.
 *  ��������, ���� ���� ������� "abc cde def", �� ������ ���� �������� "abcdef".
 */
public class Task3_2_7 {
	static String str = "  �����������    ������������ ������������ ��������� ������� �������  ";
	public static void main(String[] args) {
		int i=0;
		int j=0;
		System.out.println("Init  : "+str);	
		
//		Scanner inSC = new Scanner(System.in).useDelimiter("\n");
//        String str = inSC.next();
		
		// ������� ��� ������� � ����������� � ��� �������
		StringBuilder strBldr = new StringBuilder(str.replaceAll("\\s", ""));
		// ������� ��� ����� ��������	
		for (i=0;i<strBldr.length();i++) {
				for (j=i+1;j<strBldr.length();j++) {
					if ( strBldr.charAt(i)==strBldr.charAt(j) ) { 
						strBldr.deleteCharAt(j);
						j--;
					}
				}
		}
		System.out.println("Result: "+strBldr);	
	
//----------------------------------------------
//		System.out.println("\n->"+str);	
//		String pattern = "(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)";//���������
//		String result = str.replaceAll("\\s", "").replaceAll(pattern, "");
//		System.out.println("->"+result);
	}
}
