package byepam.javaonline.part_3;
/* ������ 3.2.3
 *  ���������, �������� �� �������� ����� �����������.
 */
public class Task3_2_3 {
	static String str = "!�����!";
	public static void main(String[] args) {
		String rvrs = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rvrs)) 
        	System.out.println("�����: "+str+" :::���������!"); 
        else 
        	System.out.println("�����: "+str+" :::�� ���������!");
	}
}
