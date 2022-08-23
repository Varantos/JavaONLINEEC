package byepam.javaonline.part_3;

/*	������ 3.1.2
 *	�������� � ������ ��� ��������� 'word' �� 'letter'.
 */
public class Task3_1_2 {
   	public static char[] CHR_WORD 	= "word".toCharArray();
    public static char[] CHR_LETTER	= "LETTER".toCharArray();
//--------------------------------------------------------------------------------------------------------------------
	static boolean findWord( int cnt, char[] strwrd, char [] word ){ // �������� 4 �������, ��������� � i-�� �� "WORD" 
		boolean flg=false;
		int k=0; 
		while (k < word.length) { 
		 if ( strwrd[cnt+k]==word[k] ) flg=true;
		 	else {flg= false; break;};
		 k++;
		}
	return flg;	
	}
//--------------------------------------------------------------------------------------------------------------------	
	static int CntWords( char[] strk) {
		int count=0;
		for (int i=0;i< strk.length;i++) 
			if (strk[i]== CHR_WORD[0] )
				if  ( findWord(i, strk, CHR_WORD ) ) 
					count++;
	return count;
	}
//--------------------------------------------------------------------------------------------------------------------	
	static char[] insletter( char[] strk, char[] str_wrd, char [] str_letter ) {
	   	int i		=0;// ������� ��� ��������� ������
    	int j		=0;// ������� ��� �������� ������
    	int cnt_le	=0; //������� ��� LETTER
  
    	int	len=strk.length+ CntWords(strk)*(str_letter.length-str_wrd.length+1);//������ ������� ����������� �� ����������� �������
    	char[] strk1=new char [len ];  //����� ������ � ���������� ������
		for (i=0;i< strk.length;i++) { // ���� �� �������� ������
    		if (strk[i]!= str_wrd[0] )  strk1[j]=strk[i];//���� ��  ������ ����� ����������� �����, �� ��������� ��� ����
    		if (strk[i]== str_wrd[0] )   {				 // ���� ������ ����� �������� �����, �� ...
    			strk1[j]=strk[i];						 // ����� ��������� �...
    			if  ( findWord(i, strk, str_wrd) ) {	 // ���������� �� ��� ����� �������
      				cnt_le=0;							//  ���� ���� �����, �� ����� �����, ����� ������� ���� ������. 
      				i=i+str_wrd.length-1;
      				while (cnt_le < str_letter.length) {
      					strk1[j]=str_letter[cnt_le];
      					cnt_le++;j++;
      				}
     			}
    		}
   			j++;	
    	} 
		return strk1;
	}
//--------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        char[] strk = "wordfkworkgjdflkwo wordvgvwewe word  lgfflkg wordkvmkjnogwork".toCharArray();
    	System.out.println(" �������� � ������ ��� ��������� 'word' �� 'letter:':\n ����������� �������: "+ new String(strk));
       	System.out.println(" �������� ������: "+ new String( insletter(  strk,  CHR_WORD, CHR_LETTER ) ));	
    }//Main method
 }/////Main  Task3_1_2
