package byepam.javaonline.part_1;
/* ������ 3.1 :
 *   �������� ��������, ��� ������������ ������ ����� �����.
 *   ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
 */
import global.Global;
public class Task1_3_1 {
    public static void main(String[] args) {
    	int x	=0;
    	int i	=1;
    	int rez	=0;
        x=Global.InPutIntVal("������� ����� �����: ");
        if (x>0)
        	for(i=0;i<=x;i++) 
         	rez+=i;
        System.out.println("�����  ����� : rez="+ rez);
    }
}
