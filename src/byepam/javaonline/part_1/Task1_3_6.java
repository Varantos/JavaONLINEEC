package byepam.javaonline.part_1;
/* ������ 3.6 :
 *   ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� � ������ ����������.
 */
public class Task1_3_6 { //UTF-8 ???
    public static void main(String[] args) {
    	 // "ISO-8859-1" - ������������������ �����
        // "windows-1251" - ����������� Windows (�������)
        // "UTF-8" - ������ !!!
    	// ASCII - ????
        String systemEncoding = "windows-1251";
        
        for (char c='�'; c<='�'; c++) System.out.println("���="+(int)c+"  ������="+c); //прописные
        
        System.out.println();
        
        for (char c='�'; c<='�'; c++) System.out.println("���= "+(int)c+"  ������= "+c); //строчные
  
    }
}
//=================================================================================================
