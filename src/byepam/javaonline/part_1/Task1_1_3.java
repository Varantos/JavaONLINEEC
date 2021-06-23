package byepam.javaonline.part_1;

import global.Global;

/* ������ 1.3 :
 *   ��������� �������� ��������� �� ������� (��� ��������� ��������� �������������� ��������):
 *           ( ( sin(x)+cos(x) )/ (cos(x)-sin(x) ) ) *tg(x)
 */
public class Task1_1_3 {
    public static void main(String[] args) {
        double x=Global.InPutFloatVal(" x: ");		//���� �������� ������
        double y=Global.InPutFloatVal(" y: ");
        System.out.println("x="+x+"; y="+y);		//������ �������� ������
        System.out.println("z= "+SolveMath(x,y) );	//����� ������� ���������� � ����� ����������
    }
    
    private static double SolveMath(double x, double y) {
    	double r1 =0;
    	double r2 =0;
    	double res=0;
        r1=Math.sin(x)+Math.cos(y);			// ���������
        r2=Math.cos(x)-Math.sin(y);			// �����������
        if (r2!=0) {						// �������� ����������� �� ����
            res = (r1/r2) * Math.tan(x*y);  // ���������
        }else System.out.println("������� �� ����!");
        return res;
    }


}
