package byepam.javaonline.part_1;
/* ������ 2.1 :
 *   ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, 
 *   ���� ��, �� ����� �� �� �������������?
*/  
import global.Global;
public class Task1_2_1 {
     public static void main(String[] args) {
      int Corner1=Global.InPutIntVal("���� 1 ������������(� ��������): ");
      int Corner2=Global.InPutIntVal("���� 2 ������������(� ��������): ");

      //����� ����� ������ ������������ ����� 180 ��������
       if ( (Corner1+Corner2) <=180 )
            System.out.println("����� ��������� �����������!"); 
            else System.out.println("�� ��������� �����������.");

       if ( (180-(Corner1+Corner2))==90 )
            System.out.println("����� ������������� �����������!"); 
        	else System.out.println("�� ��������� ������������� �����������.");

      }
}


