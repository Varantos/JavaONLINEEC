package byepam.javaonline.part_3;

/* ������ 3.1.5
 * �������  �  ������  ���  ������  �������,  ��  ����  �����  �����  ������  
 * ��������  ��������  ��  ���������  �������. ������� ������� � ������ �������
 */
public class Task3_1_5 {   
	public static char[] str1 = "    Prepare       to speak     confidently    with the best            online tutorss          ".toCharArray();
//-----------------------------------------------------
	static int findSpaces( int cnt, char[] str ){ // ���� ������ �������� 
		int k=cnt; 
		int sps=0;
		while (k < str.length) {
			if ( Character.isWhitespace(str[k]) ) sps++; 
			else
				break;
			k++;	
		}	
	return sps;	
	}
//-----------------------------------------------------
	public static void main(String[] args) {
		int j 	=0; // ������� �������� ������    
		int i 	=0; // ������� ������������ �����
		int k	=0; // ������� ��������
		int spsc=0; // ������� ����� ����

		System.out.println("\n"+new String ("Init:: \t\t->"+new String (str1))+"<-" );
//------������� ������� ������ �������
		while (Character.isWhitespace(str1[i])) {
		   	 if (str1[i]==' ' )  k++;
		   	 	else
		   		 break;
		     i++;
		     }
	     char[] str2= new char[str1.length-k];
	     for ( i = 0; i < str1.length-k; i++) {
	    	str2[i]=str1[i+k];
	     }
//-------������� ������� � ����� ������ 	  
	     i = str2.length-1;
	     k=0;
	     while (Character.isWhitespace(str2[i])) {
	    	 if (str2[i]==' ' )  k++;
	    	 else 
	    		 break;
	    	  i--;
	     }
	     char[] str3= new char[str2.length-k];
	     for ( i = 0; i<str2.length-k ; i++) {
	    	 str3[i]=str2[i];
	     }
	     k=0;
//-------������� ������� ����� ����
	     for ( i = 0; i < str3.length; i++) {
	    	 if (Character.isWhitespace(str3[i])) {
	    		 spsc= findSpaces(i,  str3 );
		    	 i=i+spsc;
		    	 if (spsc>1) k=k+(spsc-1);
		      }
		 }
		 char[] str4= new char[str3.length-k];   
		 j=0;
		 spsc=0;
		 for ( i = 0; i < str3.length; i++) {
		   	if (!Character.isWhitespace(str3[i]))
		   		str4[j]=str3[i];
		   	if (Character.isWhitespace(str3[i])) {
		       	spsc= findSpaces(i,  str3 );
		       	if (Character.isWhitespace(str3[i]) && spsc==1)	
		        	str4[j]=str3[i]; 
			   	if (Character.isWhitespace(str3[i]) && spsc>1)	{
			    		str4[j]=str3[i+spsc-1]; 
			    		i=i+spsc-1;
			    	}
		    }
		   	j++;
		}
	    System.out.println("\n"+new String ("Rezult:: \t->"+new String (str4))+"<-" ); //������� ���������
		}
}
