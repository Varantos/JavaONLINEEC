package byepam.javaonline.part_1;
/* ������ 1.4 :
 *   ���� ������������ ����� R ���� nnn.ddd(��� �������� ������� � ������� � ����� ������).
 *   �������� ������� � ����� ����� ����� ������� � ������� ���������� �������� �����. 
 */
import global.Global;
public class Task1_1_4 {
    public static void main(String[] args) {
       float  ValueX;
       ValueX=Global.InPutFloatVal("������� ������������ ����� ���� nnn.xxx: ");
       System.out.print( "REZ="+SolveMath(ValueX)  ); // ����� ����������
    }
    private static double SolveMath(float x) {
        return (int)x*0.001 + Math.round( ( ( x-(int)x)*1000 ) ); // ��������� ������� ������� � ����� ����� �����
    }

}
