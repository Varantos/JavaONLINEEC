package byepam.javaonline.part_3;
/*  ������ 3.2.8
 *  �������� ������ ����, ����������� ���������. 
 *  ����� ����� ������� ����� � ������� ��� �� �����. 
 *  ������, ����� ����� ������� ���� ����� ���� ���������, �� ������������.
 */
public class Task3_2_8 {
	static String str = "����� ����� ������ ������ ����� ���� ��������";
	public static void main(String[] args) {
		int curlen=0;
		int maxlen=0;
		int index=0;
		String[] wordMass=str.split(" ");
		maxlen=wordMass[0].length();
		for (int i=0; i<wordMass.length; i++ ) {
			curlen=wordMass[i].length();
			if (maxlen<curlen) {
				maxlen=curlen;
				index=i;
			};
		}
		System.out.println("maxSymbols: "+maxlen+", word: "+wordMass[index]);
	} 
	
}
