package byepam.javaonline.part_3;
/* ������ 3.2.1
 * ��� ����� (������). ������� ���������� ���������� ������ ������ �������� � ���.
 */
public class Task3_2_1 {
	 static String str = "  Prepare to  speak         conf ";	
//-------------------------------------------------------------------	
	static int findSpaces( int cnt ){ // ���� ������ �������� 
		int k=cnt; 
		int sps=0;
		while (k < str.length()) {
			if ( str.codePointAt(k) ==' ') sps++; 
			else 
				break;
			k++;	
		}	
	return sps;	
	}
//--------------------------------------------------------------------	
	public static void main(String[] args) {
	   int i=0;
	   int spcs = 0;
       int maxSps = 0;
       while (i < str.length()) {
	      	if(str.codePointAt(i)==' ') {
	           	  spcs=findSpaces(i);
	           	  i=i+spcs-1;
	           	  if (spcs>maxSps)
	           		  	maxSps=spcs;  
             }
	        i++;
       }
	   System.out.println("�������� �������� ����� ����: "+maxSps);
	}
}
