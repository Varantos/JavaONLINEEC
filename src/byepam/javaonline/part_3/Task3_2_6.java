package byepam.javaonline.part_3;
/* ������ 3.2.6
 * �� �������� ������ �������� �����, �������� ������ ������ ������.
 */
public class Task3_2_6 {
	static String str = " ���� �� �����  ����� ��� ����� ";
	
	public static void main(String[] args) {
		StringBuilder strBldr = new StringBuilder(str);
		String kk="";
		for (int i=0;i<strBldr.length();i++) {
			kk=String.valueOf( strBldr.charAt(i) )+String.valueOf( strBldr.charAt(i) );
			strBldr.replace(i, i+1, String.valueOf(kk));	
			i++;
		}
		System.out.println(strBldr);	
	}
	
}
