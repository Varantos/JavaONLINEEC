package byepam.javaonline.part_3;

/* ������ 3.1.1
 *   ��� ������ �������� ���������� � CamelCase. ������������� �������� � snake_case. 
 *  ------------------------------------------------------------------------------------ 
 *   CamelCase  (� ����. �  �����������������) �  �����  ���������  ��������� ����, 
 *   ��� ������� ��������� ����  �������  ������ ��� ��������, ��� ���� ������ ����� 
 *   ������ ����� ������� � ��������� �����.
 *  ------------------------------------------------------------------------------------ 
 *   Snake case (��� snake_case,  ���. �������_�������) �  ����� ��������� ���������  
 *   ����, ��� ������� ��������� ���� ����������� �������� ������������� (_), � �� �����  
 *   �������� � ������, ������ ������ ����� ������ ������� � ��������� �����
  */
public class Task3_1_1 {
// ������ ������
	static String[] inputMasVARS(int n) {
		 String[] s = new String[n];
		 s[0]="CamelOneBoyFridayMonthJuanuary";
		 s[1]="CamelTwoGirlGickBrainsTricks";
		 s[2]="CamelThreeToyPlayMediaGames";
		 s[3]="CamelFourCapDrinkOfCupCofee";
		 s[4]="CamelFivePlateEatManyFood";
	return s;
	};
//---------------------------------------------------------------------------------------	
	static String trans_ONEVAR(String str) {
		int lengstr=str.length();
		int cnt=0;
		int i=0;
		int j=0;
		
		for (i = 1; i < lengstr; i++)  //��������� ���������� ��������
				if (Character.isUpperCase(str.charAt(i))) cnt++; //������� ���������� ��������� ���� ��� ���������� � �������������
		char[] res_snake = new char[lengstr + cnt+1]; // ����� ������ �������� ������ �������� �������� ������������ �� ���������� ������������
		res_snake[0] = Character.toLowerCase(str.charAt(0));// ������ ������
		i=1;
		j=1;
		while (i<lengstr) {   
			if (!Character.isUpperCase(str.charAt(i))) {//���� ��������� ����� �� �������
				 res_snake[j] = Character.toLowerCase(str.charAt(i));j++;
			}
			if (Character.isUpperCase(str.charAt(i))) {//���� ��������� ����� �������
				 res_snake[j] = '_';
				 res_snake[j+1] = Character.toLowerCase(str.charAt(i));
				 j=j+2;
			}
			i++;	
		}
	return new String (res_snake);			
	}
//--------------------------------------------------------------------------------------------	
	static String[] transmas_VARS(String s []) {
		String[] snakemas=	new String[5];
		for (int i = 0; i < s.length; i++) //������� ����� ���������� �� �������
			snakemas[i]=trans_ONEVAR(s[i]);
			return snakemas;
	}
//--------------------------------------------------------
	public static void main(String[] args) {
		int n=5;
		String[] CamelCase=	new String[n];
		String[] snake_case=new String[n];
		CamelCase=	inputMasVARS(n);
		snake_case=	transmas_VARS(CamelCase);
		for (int j = 0; j <snake_case.length; j++) 
			System.out.print(CamelCase[j]+"\t->\t"+snake_case[j]+"\n"); 
	}
}
